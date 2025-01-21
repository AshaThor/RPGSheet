package com.ashathor.rpgsheet.ui;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.utils.Stat;

@SuppressWarnings("deprecation")
public class StatsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	
	Character character;
	
	StatPanel[] panels = new StatPanel[Stat.values().length];

	public StatsPanel(Character character) {
		
		CharacterStatsController characterStatsController = new CharacterStatsController(character, this);
		
		this.character = character;
		character.addObserver(this);
		
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		
		int[] stats = character.getStats();
		
		for (Stat stat : Stat.values()) {
			panels[stat.ordinal()] = new StatPanel(stat, stats[stat.ordinal()], characterStatsController);
			this.add(panels[stat.ordinal()]);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		Stat stat = Stat.valueOf(arg.toString());
		switch (stat) { 
		case STRENGTH:
			panels[Stat.STRENGTH.ordinal()].setLabels(character.getStrength());
			panels[Stat.STRENGTH.ordinal()].update();
			break;
		case DEXTERITY:
			panels[Stat.DEXTERITY.ordinal()].setLabels(character.getDexterity());
			panels[Stat.DEXTERITY.ordinal()].update();
			break;
		case CONSTITUTION:
			panels[Stat.CONSTITUTION.ordinal()].setLabels(character.getConstitution());
			panels[Stat.CONSTITUTION.ordinal()].update();
			break;
		case INTELLIGENCE:
			panels[Stat.INTELLIGENCE.ordinal()].setLabels(character.getIntelligence());
			panels[Stat.INTELLIGENCE.ordinal()].update();
			break;
		case WISDOM:
			panels[Stat.WISDOM.ordinal()].setLabels(character.getWisdom());
			panels[Stat.WISDOM.ordinal()].update();
			break;
		case CHARISMA:
			panels[Stat.CHARISMA.ordinal()].setLabels(character.getCharisma());
			panels[Stat.CHARISMA.ordinal()].update();
			break;
		}
		
	}

}
