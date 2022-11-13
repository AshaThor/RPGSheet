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

		final int DEFAULT_WIDTH = 1900;
		final int DEFAULT_HEIGHT = 1000;
		final String DEFAULT_TITLE = "RPG Sheet";

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame();
			
			GridBagLayout gridBagLayout = new GridBagLayout();
			
			frame.setLayout(gridBagLayout);
			frame.add(new ApplicationMenuBar(), new GridBagConstraints(0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new TitleBar(), new GridBagConstraints(0, 1, 4, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new StatsPanel(), new GridBagConstraints(0, 2, 1, 2, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new SavingThrows(), new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new SkillsPannel(), new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new PassiveWisdomPannel(), new GridBagConstraints(0, 4, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.add(new TabbedPannel(), new GridBagConstraints(2, 2, 2, 2, 1.0, 1.0, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			frame.pack();
			frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			frame.setTitle(DEFAULT_TITLE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}
}
