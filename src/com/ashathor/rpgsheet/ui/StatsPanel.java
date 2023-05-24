package com.ashathor.rpgsheet.ui;

import java.awt.GridLayout;
import com.ashathor.rpgsheet.utils.StatNames;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.model.Character;

@SuppressWarnings("deprecation")
public class StatsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel();
	boolean msgSwitch = false;
	
	Character character;
	
	StatPanel strengthPanel;
	StatPanel dexterityPanel;
	StatPanel constitutionPanel;
	StatPanel intelligencePanel;
	StatPanel wisdomPanel;
	StatPanel charismaPanel;

	public StatsPanel(Character character) {
		
		CharacterStatsController characterStatsController = new CharacterStatsController(character, this);
		
		this.character = character;
		character.addObserver(this);
		
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		strengthPanel = new StatPanel(StatNames.STRENGTH, character.getStrength() ,characterStatsController);
		dexterityPanel = new StatPanel(StatNames.DEXTERITY, character.getDexterity() ,characterStatsController);
		constitutionPanel = new StatPanel(StatNames.CONSTITUTION, character.getConstitution() ,characterStatsController);
		intelligencePanel = new StatPanel(StatNames.INTELLIGENCE, character.getIntelligence() ,characterStatsController);
		wisdomPanel = new StatPanel(StatNames.WISDOM, character.getWisdom() ,characterStatsController);
		charismaPanel = new StatPanel(StatNames.CHARISMA, character.getCharisma() ,characterStatsController);
		add(strengthPanel);
		add(dexterityPanel);
		add(constitutionPanel);
		add(intelligencePanel);
		add(wisdomPanel);
		add(charismaPanel);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		switch (arg.toString()) { 
		case StatNames.STRENGTH:
			strengthPanel.setLabels(character.getStrength());
			strengthPanel.update();
			break;
		case StatNames.DEXTERITY:
			dexterityPanel.setLabels(character.getDexterity());
			dexterityPanel.update();
			break;
		case StatNames.CONSTITUTION:
			constitutionPanel.setLabels(character.getConstitution());
			constitutionPanel.update();
			break;
		case StatNames.INTELLIGENCE:
			intelligencePanel.setLabels(character.getIntelligence());
			intelligencePanel.update();
			break;
		case StatNames.WISDOM:
			wisdomPanel.setLabels(character.getWisdom());
			wisdomPanel.update();
			break;
		case StatNames.CHARISMA:
			charismaPanel.setLabels(character.getCharisma());
			charismaPanel.update();
			break;
		}
		
	}

}
