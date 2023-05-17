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
		} else if (identifiers[1].contains("minus")) {
			changeStat(identifiers[0], false);
		} else {
			System.out.println("We should not be here...");
		}
		
	}
	
	//comment to show change in stats
	private void changeStat(String stat, boolean changeDirection) {
		/*
		 * switch (stat) { case }
		 */
	}

}
