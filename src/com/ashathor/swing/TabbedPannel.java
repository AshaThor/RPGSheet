package com.ashathor.swing;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPannel extends JTabbedPane {
	public TabbedPannel() {
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		JPanel three = new JPanel();
		JPanel four = new JPanel();
		JPanel five = new JPanel();
		JPanel six = new JPanel();
		addTab("HP & Armour", new HpAndArmourPannel());
		addTab("Traits", two);
		addTab("Atk & Cast", three);
		addTab("Equipment & Coin", four);
		addTab("Features & Traits", five);
		addTab("Proficiencies & Languages", six);
	}
}
