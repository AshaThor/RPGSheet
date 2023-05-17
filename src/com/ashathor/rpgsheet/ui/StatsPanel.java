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
		
		CharacterStatsController characterStatsController = new CharacterStatsController(character, this);
		
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		StatPanel strengthPanel = new StatPanel("Strength", character.getStrength() ,characterStatsController);
		add(strengthPanel);
		add(new StatPanel("Dexterity", character.getDexterity() ,characterStatsController));
		add(new StatPanel("Constitution", character.getConstitution() ,characterStatsController));
		add(new StatPanel("Intelligence", character.getInteligence() ,characterStatsController));
		add(new StatPanel("Wisdom", character.getWisdom() ,characterStatsController));
		add(new StatPanel("Charisma", character.getCharisma() ,characterStatsController));
	}

}
