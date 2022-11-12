package com.ashathor.swing;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ProficientStatFactory extends JPanel{
	private static final long serialVersionUID = 1L;

	/**
	 * Create a JPanel that contains a radio button as well as a label for number
	 * and name of statistic
	 * 
	 * @param String name - name of statistic
	 * @param int    statistic - Number of given statistic
	 * @return 
	 * @return JPanel
	 */
	public JPanel ProficientStatFactory(String name, int stat) {
		JPanel panel = new JPanel();
		JRadioButton radioButton = new JRadioButton();
		JLabel numberlabel = new JLabel(String.valueOf(stat));
		JLabel nameLabel = new JLabel(name);

		panel.add(radioButton, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(numberlabel, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		panel.add(nameLabel, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		return panel;
	}
	
	public JPanel ProficientStatFactory(String name, int stat, String skill) {
		JPanel panel = ProficientStatFactory(name, stat);
		JLabel skillLabel = new JLabel();
		panel.add(skillLabel, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		return panel;
		
	}

}
