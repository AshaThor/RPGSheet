package com.ashathor.swing;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ApplicationMenuBar extends JMenuBar {

	public ApplicationMenuBar() {
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenuItem save = new JMenuItem("Save");
		fileMenu.add(save);
		this.add(fileMenu);
	}
}
