package com.ashathor.rpgsheet.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.model.Character;

public class StatsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel();
	boolean msgSwitch = false;

	public StatsPanel(Character character) {
		
		CharacterStatsController characterStatsController = new CharacterStatsController();
		
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		add(new StatPanel("Strength", 10, character ,characterStatsController));
		add(new StatPanel("Dexterity", 10, character ,characterStatsController));
		add(new StatPanel("Constitution", 10, character ,characterStatsController));
		add(new StatPanel("Intelligence", 10, character ,characterStatsController));
		add(new StatPanel("Wisdom", 10, character ,characterStatsController));
		add(new StatPanel("Charisma", 10, character ,characterStatsController));
		/*
		 * add(new StatHolder(10)); add(new StatHolder(12)); add(new StatHolder(13));
		 * add(new StatHolder(13)); add(new StatHolder(13));
		 */
	}

}
