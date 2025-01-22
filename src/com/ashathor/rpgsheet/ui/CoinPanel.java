package com.ashathor.rpgsheet.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.ashathor.rpgsheet.model.Character;

public class CoinPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// http://dnd5e.wikidot.com/currency
	private static final String PLATINUM = "Platinum";
	private static final String GOLD = "Gold"; 
	private static final String ELECTRUM = "Electrum";
	private static final String SILVER = "Silver";
	private static final String COPPER = "Copper";

	public CoinPanel(Character character) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		
		JLabel platinumLabel = new JLabel(PLATINUM, SwingConstants.CENTER);
		//Limit this to only numbers 
		JTextField platinumField = new JTextField(character.getPlatinum());
		JLabel goldLabel = new JLabel(GOLD, SwingConstants.CENTER);
		JTextField goldField = new JTextField(2);
		JLabel electrumLabel = new JLabel(ELECTRUM, SwingConstants.CENTER);
		JTextField electrumField = new JTextField(2);
		JLabel silverLabel = new JLabel(SILVER, SwingConstants.CENTER);
		JTextField silverField = new JTextField(2);
		JLabel copperLabel = new JLabel(COPPER, SwingConstants.CENTER);
		JTextField copperField = new JTextField(2);
		
		//Change this to be prettier
		
		add(platinumLabel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(platinumField, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(goldLabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(goldField, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(electrumLabel, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(electrumField, new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(silverLabel, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(silverField, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(copperLabel, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(copperField, new GridBagConstraints(1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
	}
}
