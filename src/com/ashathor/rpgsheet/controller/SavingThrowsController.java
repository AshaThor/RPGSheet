/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.SavingThrowsPanel;

/**
 * @author Ash Dev
 *
 */
public class SavingThrowsController implements ActionListener{
	
	private static final Logger LOGGER = Logger.getLogger(SavingThrowsController.class.getName());
	
	Character model;
	SavingThrowsPanel view;

	/**
	 * 
	 */
	public SavingThrowsController(Character character, SavingThrowsPanel savingThrowsPanel) {
		super();
		this.model = character;
		this.view = savingThrowsPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LOGGER.warning(e.getActionCommand().toString());	
	}

}
