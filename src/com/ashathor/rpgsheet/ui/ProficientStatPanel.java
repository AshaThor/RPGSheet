package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.ashathor.rpgsheet.controller.ProficencyController;
import com.ashathor.rpgsheet.utils.Modifier;

public class ProficientStatPanel extends JPanel{
	private static final long serialVersionUID = 1L;

	JRadioButton radioButton;
	
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
	public ProficientStatPanel(String name, int stat, ActionListener controller, boolean profficent, boolean savingOrSkill) {
		//Create is "" text as we don't need to have text here as we make a Label. Refactor?
		radioButton = new JRadioButton(" " + String.valueOf(Modifier.calc(stat)),profficent);
		//JLabel numberlabel = new JLabel(String.valueOf(stat));
		JLabel nameLabel = new JLabel(name);
		radioButton.setActionCommand(name + "_" + savingOrSkill);
		radioButton.addActionListener(controller);

		this.add(radioButton, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		//panel.add(numberlabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(nameLabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	}
	
	/**
	 * @param name
	 * @param stat
	 * @param skill
	 * @param proficencyController
	 * @param profficent
	 * @param savingOrSkill true if saving throw false if skill
	 * @return
	 */
	public ProficientStatPanel(String name, int stat, String skill, ProficencyController proficencyController, boolean profficent, boolean savingOrSkill) {
		this(name, stat, proficencyController, profficent, savingOrSkill);
		JLabel skillLabel = new JLabel(skill);
		
		skillLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		skillLabel.setForeground(Color.GRAY);
		this.add(skillLabel, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	}
	
	public void setLabel(Integer value) {
		radioButton.setText(String.valueOf(Modifier.calc(value)));
	}
	
	public void update() {
		this.revalidate();
		this.repaint();
	}

}
