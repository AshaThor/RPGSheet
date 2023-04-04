package com.ashathor.swing;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TabbedPanel extends JTabbedPane {
	/**Tabbed Panel
	 * This panel is made so that the user can tab between parts of the character sheet
	 */
	private static final long serialVersionUID = 1L;

	public TabbedPanel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline);
		this.setBorder(title);
		
		TraitsPanel one = new TraitsPanel();
		JPanel two = new JPanel();
		JPanel three = new JPanel();
		JPanel four = new JPanel();
		addTab("Traits", one);
		addTab("Atk & Cast", two);
		addTab("Equipment & Coin", three);
		addTab("Features & Traits", four);
	}
}
