package com.ashathor.rpgsheet.ui;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JToolBar;

import com.ashathor.rpgsheet.controller.FileMenuController;
import com.ashathor.rpgsheet.model.Character;

public class ApplicationMenuBar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationMenuBar(Character character) {
		this.setFloatable(false);
		FileMenuController fileMenuController = new FileMenuController(character, this);

		JButton load = new JButton("Load");
		load.setMinimumSize(new Dimension(100,10));
		load.setPreferredSize(new Dimension(100,50));
		load.setActionCommand("load");
		load.addActionListener(fileMenuController);
		load.setMnemonic(KeyEvent.VK_L);
		
		JButton save = new JButton("Save");
		save.setMinimumSize(new Dimension(100,10));
		save.setPreferredSize(new Dimension(100,50));
		save.setActionCommand("save");
		save.addActionListener(fileMenuController);
		save.setMnemonic(KeyEvent.VK_S);
		
		JButton about = new JButton("About");
		save.setMinimumSize(new Dimension(100,10));
		save.setPreferredSize(new Dimension(100,50));
		about.setActionCommand("about");
		about.addActionListener(fileMenuController);
		about.setMnemonic(KeyEvent.VK_A);
		
		this.add(load);
		this.add(save);
		this.add(about);
	}
}
