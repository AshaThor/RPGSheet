/**
 * 
 */
package com.ashathor.swing;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ash Dev
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int DEFAULT_WIDTH = 1900;
		final int DEFAULT_HEIGHT = 1000;
		final String DEFAULT_TITLE = "RPG Sheet";

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame();
			
			GridBagLayout gridBagLayout = new GridBagLayout();
			
			//Creating UI
			
			//Menu bar
			frame.setLayout(gridBagLayout);
			ApplicationMenuBar applicationMenuBar = new ApplicationMenuBar();
			GridBagConstraints applicationMenuBarConstraints = new GridBagConstraints(0, 0, 8, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(applicationMenuBar, applicationMenuBarConstraints);
			
			//Title Bar
			TitleBar titleBar = new TitleBar();
			GridBagConstraints titleBarConstraints = new GridBagConstraints(0, 1, 8, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(titleBar, titleBarConstraints);
			
			//Stats Panel
			StatsPanel statsPanel = new StatsPanel();
			GridBagConstraints statsPanelConstraints = new GridBagConstraints(0, 2, 1, 4, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			Dimension stats = new Dimension(90,0);
			statsPanel.setPreferredSize(stats);
			frame.add(statsPanel, statsPanelConstraints);
			
			//Saving Throws Pannel
			SavingThrowsPannel savingThrowsPannel =  new SavingThrowsPannel();
			GridBagConstraints savingThrowsConstraints = new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(savingThrowsPannel,savingThrowsConstraints);
			
			//Skills Pannel
			SkillsPannel skillsPannel = new SkillsPannel();
			GridBagConstraints skillsPannelConstraints = new GridBagConstraints(1, 3, 1, 3, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(skillsPannel,skillsPannelConstraints);
			
			//HP and Armour Pannel
			HpAndArmourPannel hpAndArmourPannel = new HpAndArmourPannel();
			GridBagConstraints hpAndArmourConstraints = new GridBagConstraints(2, 2, 1, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0); 
			hpAndArmourPannel.setPreferredSize(new Dimension(250,0));
			frame.add(hpAndArmourPannel,hpAndArmourConstraints);
			
			//Inspiration Panel
			InspirationPannel inspirationPannel = new InspirationPannel();
			GridBagConstraints inspirationPannelConstraints = new GridBagConstraints(2, 3, 1, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0); 
			inspirationPannel.setPreferredSize(new Dimension(250,50));
			frame.add(inspirationPannel,inspirationPannelConstraints);
			
			//Proficiency Panel
			ProficencyBonusPanel proficencyBonusPanel = new ProficencyBonusPanel();
			GridBagConstraints proficencyBonusPanelConstraints = new GridBagConstraints(2, 4, 1, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0); 
			proficencyBonusPanel.setPreferredSize(new Dimension(250,50));
			frame.add(proficencyBonusPanel,proficencyBonusPanelConstraints);
			
			//Other Profs and Langs
			OtherProfsAndLangsPanel otherProfsAndLangsPanel = new OtherProfsAndLangsPanel();
			GridBagConstraints otherProfsAndLangsPanelConstraints = new GridBagConstraints(2, 5, 1, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0); 
			otherProfsAndLangsPanel.setPreferredSize(new Dimension(250,250));
			frame.add(otherProfsAndLangsPanel, otherProfsAndLangsPanelConstraints);
			
			//Tabbed Pannel
			TabbedPanel tabbedPannel = new TabbedPanel();
			GridBagConstraints tabbedPanelContstraints = new GridBagConstraints(3, 2, 5, 5, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(tabbedPannel, tabbedPanelContstraints);
			
			//Passive Wisdom Pannel
			PassiveWisdomPannel passiveWisdomPannel = new PassiveWisdomPannel();
			GridBagConstraints passiveWisdomConstraints = new GridBagConstraints(0, 6, 3, 1, 0, 0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
			frame.add(passiveWisdomPannel, passiveWisdomConstraints);
			
			frame.pack();
			frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			frame.setTitle(DEFAULT_TITLE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}
}
