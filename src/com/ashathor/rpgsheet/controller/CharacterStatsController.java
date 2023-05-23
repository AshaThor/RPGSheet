/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ashathor.rpgsheet.ui.StatsPanel;

/**
 * @author Rivendell
 *
 */
public class CharacterStatsController implements ActionListener{

	/**
	 * 
	 */
	private com.ashathor.rpgsheet.model.Character model;
	private StatsPanel view;

	
	
	public CharacterStatsController(com.ashathor.rpgsheet.model.Character character, StatsPanel statsPanel) {
		super();
		model = character;
		view = statsPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] identifiers = e.getActionCommand().toString().split("_");
		System.out.println(e.getActionCommand().toString());
		if(identifiers[1].contains("plus")){
			changeStat(identifiers[0], true);
			view.revalidate();
		} else if (identifiers[1].contains("minus")) {
			changeStat(identifiers[0], false);
		} else {
			System.out.println("We should not be here...");
		}
		
	}
	
	//TODO this is too much logic for a controller REFACTOR
	private void changeStat(String stat, boolean changeDirection) {
		switch (stat) { 
		case "strength":
			if(changeDirection) {
			model.setStrength(model.getStrength()+1);
			} else {
			model.setStrength(model.getStrength()-1);
			}
			System.out.println(model.getStrength());
			break;
		case "dexterity":
			if(changeDirection) {
			model.setDexterity(model.getDexterity()+1);
			} else {
			model.setDexterity(model.getDexterity()-1);
			}
			break;
		case "constitution":
			if(changeDirection) {
			model.setConstitution(model.getConstitution()+1);
			} else {
			model.setConstitution(model.getConstitution()-1);
			}
			break;
		case "inteligence":
			if(changeDirection) {
			model.setInteligence(model.getInteligence()+1);
			} else {
			model.setInteligence(model.getInteligence()-1);
			}
			break;
		case "wisdom":
			if(changeDirection) {
			model.setWisdom(model.getWisdom()+1);
			} else {
			model.setWisdom(model.getWisdom()-1);
			}
			break;
		case "charisma":
			if(changeDirection) {
			model.setCharisma(model.getCharisma()+1);
			} else {
			model.setCharisma(model.getCharisma()-1);
			}
			break;
		}
	}

}
