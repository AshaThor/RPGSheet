/**
 * 
 */
package com.ashathor.swing;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ash Dev
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(() -> {
			var frame = new StatsFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}
}

class StatsFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 200;
	private static final int DEFAULT_HEIGHT = 700;
	private static final String DEFAULT_TITLE = "Lil Calc";

	JLabel text = new JLabel();
	boolean msgSwitch = false;

	public StatsFrame() {
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
		pack();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle(DEFAULT_TITLE);
	}
}
