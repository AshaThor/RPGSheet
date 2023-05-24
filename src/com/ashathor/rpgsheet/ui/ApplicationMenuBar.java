package com.ashathor.rpgsheet.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.ashathor.rpgsheet.controller.FileMenuController;
import com.ashathor.rpgsheet.model.Character;


public class ApplicationMenuBar extends JMenuBar {

	
	
	public ApplicationMenuBar(Character character) {
		FileMenuController fileMenuController = new FileMenuController(character, this);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(fileMenuController);
		fileMenu.add(save);
		this.add(fileMenu);
	}
}
