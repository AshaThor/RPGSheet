/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.ashathor.rpgsheet.model.Character;

/**
 * @author Ash Dev
 *
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	final int DEFAULT_WIDTH = 1900;
	final int DEFAULT_HEIGHT = 1000;
	final String DEFAULT_TITLE = "RPG Sheet";

	/**
	 * @throws HeadlessException
	 */
	public MainFrame(Character character) {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		// Menu bar
		ApplicationMenuBar applicationMenuBar = new ApplicationMenuBar(character);
		GridBagConstraints applicationMenuBarConstraints = new GridBagConstraints(0, 0, 8, 1, 1, 0, GridBagConstraints.CENTER, 
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		applicationMenuBar.setMaximumSize(new Dimension(80000,50));
		add(applicationMenuBar, applicationMenuBarConstraints);

		// Title Bar
		TitleBar titleBar = new TitleBar();
		GridBagConstraints titleBarConstraints = new GridBagConstraints(0, 1, 8, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		//titleBar.setMinimumSize(new Dimension(0, 200));
		add(titleBar, titleBarConstraints);

		// Stats Panel
		StatsPanel statsPanel = new StatsPanel(character);
		GridBagConstraints statsPanelConstraints = new GridBagConstraints(0, 2, 1, 4, 0, 1, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		statsPanel.setMinimumSize(new Dimension(90,0));
		statsPanel.setPreferredSize(new Dimension(90, 0));
		add(statsPanel, statsPanelConstraints);

		// Proficiency Panel
		ProficiencyPanel proficiencyPanel = new ProficiencyPanel(character);
		GridBagConstraints proficiencyPanelConstraints = new GridBagConstraints(1, 2, 1, 4, 0, 1, GridBagConstraints.CENTER, 
				GridBagConstraints.BOTH, new Insets(0,0, 0, 0), 0, 0); 
		add(proficiencyPanel, proficiencyPanelConstraints);
		

		// HP and Armour Panel
		HpAndArmourPanel hpAndArmourPanel = new HpAndArmourPanel();
		GridBagConstraints hpAndArmourConstraints = new GridBagConstraints(2, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		hpAndArmourPanel.setMinimumSize(new Dimension(250,200));
		hpAndArmourPanel.setPreferredSize(new Dimension(250, 200));
		add(hpAndArmourPanel, hpAndArmourConstraints);

		// Inspiration Panel
		InspirationPanel inspirationPannel = new InspirationPanel();
		GridBagConstraints inspirationPannelConstraints = new GridBagConstraints(2, 3, 1, 1, 0, 0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		inspirationPannel.setMinimumSize(new Dimension(250,50));
		inspirationPannel.setPreferredSize(new Dimension(250, 50));
		add(inspirationPannel, inspirationPannelConstraints);

		// Proficiency Panel
		ProficencyBonusPanel proficencyBonusPanel = new ProficencyBonusPanel(character);
		GridBagConstraints proficencyBonusPanelConstraints = new GridBagConstraints(2, 4, 1, 1, 0, 0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		proficencyBonusPanel.setMinimumSize(new Dimension(250,50));
		proficencyBonusPanel.setPreferredSize(new Dimension(250, 50));
		add(proficencyBonusPanel, proficencyBonusPanelConstraints);

		// Other Profs and Langs
		OtherProfsAndLangsPanel otherProfsAndLangsPanel = new OtherProfsAndLangsPanel();
		GridBagConstraints otherProfsAndLangsPanelConstraints = new GridBagConstraints(2, 5, 1, 1, 0, 0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		otherProfsAndLangsPanel.setPreferredSize(new Dimension(250, 250));
		add(otherProfsAndLangsPanel, otherProfsAndLangsPanelConstraints);

		// Tabbed Panel
		TabbedPanel tabbedPannel = new TabbedPanel();
		GridBagConstraints tabbedPanelContstraints = new GridBagConstraints(3, 2, 5, 5, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		add(tabbedPannel, tabbedPanelContstraints);

		// Passive Wisdom Panel
		PassiveWisdomPanel passiveWisdomPannel = new PassiveWisdomPanel(character);
		GridBagConstraints passiveWisdomConstraints = new GridBagConstraints(0, 6, 3, 1, 0, 0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		add(passiveWisdomPannel, passiveWisdomConstraints);

		pack();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle(DEFAULT_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create Modal dialog for opening Character
		//JDialog dialog = new SplashDialogFactory().create(this);
		//dialog.setVisible(true);
		
	}
}
