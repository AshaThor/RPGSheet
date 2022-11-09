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
			var frame = new SimpleFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

		});
	}
}

class SimpleFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 700;
	private static final int DEFAULT_HEIGHT = 700;
	private static final String DEFAULT_TITLE = "Lil Calc";

	JLabel text = new JLabel();
	boolean msgSwitch = false;

	public SimpleFrame() {
		GridLayout gLayout = new GridLayout(2, 0);
		text.setText("Old msg");
		this.setLayout(gLayout);
		add(text);
		Button testB = new Button();
		testB.addActionListener(e -> ButtonPressed());
		add(testB);
		add(new StatHolder(15));
		pack();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle(DEFAULT_TITLE);
	}

	public void ButtonPressed() {
		System.out.println("This is a message");
		if (msgSwitch) {
			text.setText("Hello this is great");
			msgSwitch = false;
		} else {
			text.setText("this is a different bit of text");
			msgSwitch = true;
		}
	}
}
