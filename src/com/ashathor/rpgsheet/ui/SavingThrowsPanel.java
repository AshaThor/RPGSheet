package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.utils.StatNames;
import com.ashathor.rpgsheet.controller.SavingThrowsController;
import com.ashathor.rpgsheet.model.Character;

public class SavingThrowsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Saving throws creates a JPanel that contains more panels of each statistic
	 */
	public SavingThrowsPanel(Character character) {
		SavingThrowsController savingThrowsController = new SavingThrowsController(character, this);
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Saving Throws");
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		GridLayout gridLayout = new GridLayout(6, 1);
		this.setLayout(gridLayout);
		// To-Do reactor to use a list of statistics
		// and also character statistics
		ProficientStatFactory proficientStatFactory = new ProficientStatFactory();
		for(String stat : StatNames.statNames()) {
			this.add(proficientStatFactory.create(stat, 12 ));
		}
	}

	
}
