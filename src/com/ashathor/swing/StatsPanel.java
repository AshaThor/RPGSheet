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
		add(new StatPanel("Strength", 10));
		add(new StatPanel("Dexterity", 10));
		add(new StatPanel("Constitution", 10));
		add(new StatPanel("Intelligence", 10));
		add(new StatPanel("Wisdom", 10));
		add(new StatPanel("Charisma", 10));
		/*
		 * add(new StatHolder(10)); add(new StatHolder(12)); add(new StatHolder(13));
		 * add(new StatHolder(13)); add(new StatHolder(13));
		 */
	}

}
