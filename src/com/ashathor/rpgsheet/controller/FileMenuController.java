/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.ApplicationMenuBar;
import com.ashathor.rpgsheet.utils.IOCharacter;

/**
 * @author Ash Dev
 *
 */
public class FileMenuController implements ActionListener {

	private static final Logger LOGGER = Logger.getLogger(FileMenuController.class.getName());

	private Character model;
	private ApplicationMenuBar view;

	public FileMenuController(Character character, ApplicationMenuBar applicationMenuBar) {
		super();
		this.model = character;
		this.view = applicationMenuBar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LOGGER.fine("Menu Item Pressed");
		switch (e.getActionCommand()) {
		case "save" -> IOCharacter.Save(model, view);
		case "load" -> IOCharacter.Load();
		case "about" -> LOGGER.info("About");
		}

	}

}
