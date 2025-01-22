package com.ashathor.rpgsheet.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.ashathor.rpgsheet.model.Character;

public class WornEquipmentPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// http://dnd5e.wikidot.com/currency
	private static final String HEAD = "Head";
	private static final String LEFT_ARM = "Left Arm"; 
	private static final String RIGHT_ARM = "Right Arm";
	private static final String TORSO = "Torso";
	private static final String LEGS = "Legs";

	public WornEquipmentPanel(Character character) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		//Limit this to only numbers 
		JLabel headLabel = new JLabel(HEAD, SwingConstants.CENTER);
		JTextField headField = new JTextField();
		JLabel leftArmLabel = new JLabel(LEFT_ARM, SwingConstants.CENTER);
		JTextField leftArmField = new JTextField(2);
		JLabel rightArmLabel = new JLabel(RIGHT_ARM, SwingConstants.CENTER);
		JTextField rightArmField = new JTextField(2);
		JLabel torsoLabel = new JLabel(TORSO, SwingConstants.CENTER);
		JTextField torsoField = new JTextField(2);
		JLabel legsLabel = new JLabel(LEGS, SwingConstants.CENTER);
		JTextField legsField = new JTextField(2);
		
		//Change this to be prettier
		
		add(headLabel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(headField, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(leftArmLabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(leftArmField, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(rightArmLabel, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(rightArmField, new GridBagConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(torsoLabel, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(torsoField, new GridBagConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		add(legsLabel, new GridBagConstraints(0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		add(legsField, new GridBagConstraints(1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
	}
}
