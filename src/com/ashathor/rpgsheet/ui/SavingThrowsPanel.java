package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.utils.StatNames;

public class SavingThrowsPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Saving throws creates a JPanel that contains more panels of each statistic
	 */
	public SavingThrowsPanel() {
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
		for(String stat : StatNames.statNames())
		this.add(proficientStatFactory.create(stat, 12));
	}

	
}
