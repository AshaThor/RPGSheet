package com.ashathor.rpgsheet.ui;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.model.Character;

public class StatsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel();
	boolean msgSwitch = false;
	
	Character character;
	
	StatPanel strengthPanel;
	StatPanel dexterityPanel;
	StatPanel constitutionPanel;
	StatPanel inteligencePanel;
	StatPanel wisdomPanel;
	StatPanel charismaPanel;

	public StatsPanel(Character character) {
		
		CharacterStatsController characterStatsController = new CharacterStatsController(character, this);
		
		this.character = character;
		character.addObserver(this);
		
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		strengthPanel = new StatPanel("Strength", character.getStrength() ,characterStatsController);
		dexterityPanel = new StatPanel("Dexterity", character.getDexterity() ,characterStatsController);
		constitutionPanel = new StatPanel("Constitution", character.getConstitution() ,characterStatsController);
		inteligencePanel = new StatPanel("Intelligence", character.getInteligence() ,characterStatsController);
		wisdomPanel = new StatPanel("Wisdom", character.getWisdom() ,characterStatsController);
		charismaPanel = new StatPanel("Charisma", character.getCharisma() ,characterStatsController);
		add(strengthPanel);
		add(dexterityPanel);
		add(constitutionPanel);
		add(inteligencePanel);
		add(wisdomPanel);
		add(charismaPanel);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		strengthPanel.setLabels(character.getStrength());
		strengthPanel.update();
		
	}

}
