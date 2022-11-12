package com.ashathor.swing;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel();
	boolean msgSwitch = false;

	public StatsPanel() {
		GridLayout gridLayout = new GridLayout(6,1);
		this.setLayout(gridLayout);
		add(new StatHolder("Strength", 10));
		add(new StatHolder("Dexterity", 10));
		add(new StatHolder("Constitution", 10));
		add(new StatHolder("Intelligence", 10));
		add(new StatHolder("Wisdom", 10));
		add(new StatHolder("Charisma", 10));
		/*
		 * add(new StatHolder(10)); add(new StatHolder(12)); add(new StatHolder(13));
		 * add(new StatHolder(13)); add(new StatHolder(13));
		 */
	}

}
