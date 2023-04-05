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

import com.ashathor.rpgsheet.utils.SkillNames;

public class SkillsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final static int GRID_COLS = 1;

	public SkillsPanel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Skills");
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		GridLayout gridLayout = new GridLayout(SkillNames.numOfSkills, GRID_COLS);
		this.setLayout(gridLayout);
		// To-Do reactor to use character statistics
		ProficientStatFactory proficientStatFactory = new ProficientStatFactory();
		for(String skill : SkillNames.skillNames()) {
			this.add(proficientStatFactory.create(skill, 11, "Dex"));
		}
	}
}
