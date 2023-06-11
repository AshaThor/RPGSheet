/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JPanel;

import com.ashathor.rpgsheet.controller.ProficencyController;
import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.SavingThrowsPanel;

/**
 * @author Ash Dev
 *
 */
public class ProficiencyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ProficiencyPanel(Character character) {
		ProficencyController proficencyController = new ProficencyController(character, this);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		//Saving Throws Panel
		SavingThrowsPanel savingThrowsPannel = new SavingThrowsPanel(character, proficencyController);
		GridBagConstraints savingThrowsConstraints = new GridBagConstraints(0, 0, 1, 1, 0, 1, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		this.add(savingThrowsPannel,savingThrowsConstraints);
		
		//Skills Panel
		SkillsPanel skillsPannel = new SkillsPanel(character, proficencyController);
		GridBagConstraints skillsPannelConstraints = new GridBagConstraints(0, 1, 1, 3, 0, 1, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
		this.add(skillsPannel,skillsPannelConstraints);
	}

}
