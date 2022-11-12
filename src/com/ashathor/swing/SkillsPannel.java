package com.ashathor.swing;

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

public class SkillsPannel extends JPanel {

	public SkillsPannel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Saving Throws");
		title.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		GridLayout gridLayout = new GridLayout(6, 1);
		this.setLayout(gridLayout);
		// To-Do reactor to use a list of statistics
		// and also character statistics
		this.add(new ProficientStatFactory("Strength", 12));
		this.add(new ProficientStatFactory("Dexterity", 12));
		this.add(new ProficientStatFactory("Constitution", 12));
		this.add(new ProficientStatFactory("Inteligence", 12));
		this.add(new ProficientStatFactory("Wisdom", 12));
		this.add(new ProficientStatFactory("Charisma", 12));
	}
}
