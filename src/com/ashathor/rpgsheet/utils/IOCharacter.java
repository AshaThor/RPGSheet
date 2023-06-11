/**
 * 
 */
package com.ashathor.rpgsheet.utils;

import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.json.simple.*;

import com.ashathor.rpgsheet.controller.FileMenuController;
import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.ApplicationMenuBar;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Ash Dev
 *
 */
public class IOCharacter {
	
	private static final Logger LOGGER = Logger.getLogger(IOCharacter.class.getName());
	
	public static void Save(Character model, ApplicationMenuBar view) {
		LOGGER.info("Starting Save");
		ObjectMapper mapper = new ObjectMapper();
		FileDialog dialog = new FileDialog((JFrame) SwingUtilities.getRoot(view), "Save Character", FileDialog.SAVE);
		dialog.setDirectory(System.getProperty("user.dir"));
		dialog.setFile("character.json");
		dialog.setVisible(true);
		Path path = Path.of(dialog.getDirectory());
		String fileName = dialog.getFile();
		try {
			mapper.writeValue(new File(path + "\\" + fileName), model);
		} catch (JsonProcessingException error) {
			LOGGER.severe("Character to JSON failed");
		} catch (IOException e1) {
			LOGGER.severe("Save file failed on IO exception");
		}
	}
	
	public static void Load() {
		LOGGER.info("Load Pressed");
	}

}
