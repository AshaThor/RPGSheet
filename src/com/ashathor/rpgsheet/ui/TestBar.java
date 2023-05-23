/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * @author Ash Dev
 *
 */
public class TestBar extends JPanel {
	private static final long serialVersionUID = 1L;
	JLabel stat = new JLabel();
	JButton testButton = new JButton("The Button");
	JLabel passiveWisdom = new JLabel("Test");
	public TestBar() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		this.setBorder(blackline);
		this.add(stat,new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(passiveWisdom, new GridBagConstraints(1, 0, 4, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(testButton, new GridBagConstraints(1, 1, 4, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
	}

}
