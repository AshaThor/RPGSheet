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

		final int DEFAULT_WIDTH = 200;
		final int DEFAULT_HEIGHT = 700;
		final String DEFAULT_TITLE = "Lil Calc";
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame();
			GridLayout gridLayout = new GridLayout(1,2);
			frame.setLayout(gridLayout);
			frame.add(new StatsPanel());
			frame.add(new SavingThrows());
			frame.pack();
			frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			frame.setTitle(DEFAULT_TITLE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}
}
