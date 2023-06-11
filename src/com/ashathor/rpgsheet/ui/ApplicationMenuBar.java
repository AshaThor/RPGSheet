package com.ashathor.rpgsheet.ui;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.ashathor.rpgsheet.controller.FileMenuController;
import com.ashathor.rpgsheet.model.Character;

public class ApplicationMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationMenuBar(Character character) {
		FileMenuController fileMenuController = new FileMenuController(character, this);

		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenuItem load = new JMenuItem("Load");
		load.setActionCommand("load");
		load.addActionListener(fileMenuController);
		load.setMnemonic(KeyEvent.VK_L);
		JMenuItem save = new JMenuItem("Save");
		save.setActionCommand("save");
		save.addActionListener(fileMenuController);
		save.setMnemonic(KeyEvent.VK_S);
		JMenuItem exit = new JMenuItem("Exit");
		exit.setActionCommand("exit");
		exit.addActionListener(fileMenuController);
		exit.setMnemonic(KeyEvent.VK_E);
		JMenuItem about = new JMenuItem("About");
		about.setActionCommand("about");
		about.addActionListener(fileMenuController);
		about.setMnemonic(KeyEvent.VK_A);
		fileMenu.add(load);
		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(about);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		
		
		this.add(fileMenu);
	}
}
