package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.ashathor.rpgsheet.controller.ProficencyController;

public class ProficientStatFactory{
	private static final long serialVersionUID = 1L;

	/**
	 * Create a JPanel that contains a radio button as well as a label for number
	 * and name of statistic
	 * 
	 * @param String name - name of statistic
	 * @param int    statistic - Number of given statistic
	 * @return 
	 * @return 
	 * @return 
	 * @return JPanel
	 */
	JPanel create(String name, int stat, ProficencyController proficencyController) {
		JPanel panel = new JPanel();
		JRadioButton radioButton = new JRadioButton();
		JLabel numberlabel = new JLabel(String.valueOf(stat));
		JLabel nameLabel = new JLabel(name);
		
		radioButton.setActionCommand(name);
		radioButton.addActionListener(proficencyController);

		panel.add(radioButton, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(numberlabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(nameLabel, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		return panel;
	}
	
	JPanel create(String name, int stat, String skill, ProficencyController proficencyController) {
		JPanel panel = create(name, stat, proficencyController);
		JLabel skillLabel = new JLabel(skill);
		
		skillLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		skillLabel.setForeground(Color.GRAY);
		panel.add(skillLabel, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		return panel;
	}

}
