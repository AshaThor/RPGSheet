package com.ashathor.swing;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatHolder extends JPanel {
	JLabel statLabel = new JLabel();
	JLabel modifierLabel = new JLabel();
	int stat;
	int modifier;

	public StatHolder(int initStat) {

		stat = initStat;
		
		this.setLayout(new GridBagLayout());

		statLabel.setText(String.valueOf(stat));
		this.add(statLabel, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Make and contain buttons
		Button plusButton = new Button("+");
		this.add(plusButton, new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));

		Button minusButton = new Button("-");
		this.add(minusButton, new GridBagConstraints(1, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
		calcModifier();
		modifierLabel.setText(String.valueOf(modifier));
		this.add(modifierLabel);

		plusButton.addActionListener(e -> Calc("+"));
		minusButton.addActionListener(e -> Calc("-"));
	}

	private void calcModifier() {
		modifier = ((stat - 10)/2);
	}

	private void Calc(String operator) {
		if (operator.equals("+")) {
			stat++;
			statLabel.setText(String.valueOf(stat));
			
		} else {
			stat--;
			statLabel.setText(String.valueOf(stat));
		}
		calcModifier();
		modifierLabel.setText(String.valueOf(modifier));
	}

}
