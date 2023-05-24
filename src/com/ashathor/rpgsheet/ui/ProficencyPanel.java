/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JPanel;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.SavingThrowsPanel;

/**
 * @author Ash Dev
 *
 */
public class ProficencyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ProficencyPanel(Character character) {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		//Saving Throws Panel
		SavingThrowsPanel savingThrowsPannel = new SavingThrowsPanel(character);
		GridBagConstraints savingThrowsConstraints = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		this.add(savingThrowsPannel,savingThrowsConstraints);
		
		//Skills Panel
		SkillsPanel skillsPannel = new SkillsPanel();
		GridBagConstraints skillsPannelConstraints = new GridBagConstraints(0, 1, 1, 3, 0, 0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		this.add(skillsPannel,skillsPannelConstraints);
	}

}
