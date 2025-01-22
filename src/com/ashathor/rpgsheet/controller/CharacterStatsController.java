/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.StatsPanel;
import com.ashathor.rpgsheet.utils.Stat;

/**
 * @author Rivendell
 *
 */
public class CharacterStatsController implements ActionListener{
	
	private static final Logger LOGGER = Logger.getLogger(CharacterStatsController.class.getName());

	/**
	 * 
	 */
	private Character model;
	private StatsPanel view;

	
	
	public CharacterStatsController(Character character, StatsPanel statsPanel) {
		super();
		model = character;
		view = statsPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] identifiers = e.getActionCommand().toString().split("_");
		LOGGER.fine(e.getActionCommand().toString());
		if(identifiers[1].contains("plus")){
			changeStat(identifiers[0], true);
			view.revalidate();
		} else if (identifiers[1].contains("minus")) {
			changeStat(identifiers[0], false);
		} else {
			LOGGER.warning("Should not be here");
		}
		
	}
	
	//TODO this is too much logic for a controller REFACTOR
	private void changeStat(String statName, boolean changeDirection) {
		Stat stat = Stat.valueOf(statName);
		switch (stat) { 
		case STRENGTH:
			if(changeDirection) {
			model.setStrength(model.getStrength()+1);
			} else {
			model.setStrength(model.getStrength()-1);
			}
			break;
		case DEXTERITY:
			if(changeDirection) {
			model.setDexterity(model.getDexterity()+1);
			} else {
			model.setDexterity(model.getDexterity()-1);
			}
			break;
		case CONSTITUTION:
			if(changeDirection) {
			model.setConstitution(model.getConstitution()+1);
			} else {
			model.setConstitution(model.getConstitution()-1);
			}
			break;
		case INTELLIGENCE:
			if(changeDirection) {
			model.setIntelligence(model.getIntelligence()+1);
			} else {
			model.setIntelligence(model.getIntelligence()-1);
			}
			break;
		case WISDOM:
			if(changeDirection) {
			model.setWisdom(model.getWisdom()+1);
			} else {
			model.setWisdom(model.getWisdom()-1);
			}
			break;
		case CHARISMA:
			if(changeDirection) {
			model.setCharisma(model.getCharisma()+1);
			} else {
			model.setCharisma(model.getCharisma()-1);
			}
			break;
		}
	}

}
