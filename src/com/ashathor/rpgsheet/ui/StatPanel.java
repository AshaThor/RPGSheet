package com.ashathor.rpgsheet.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.model.Character;

public class StatPanel extends JPanel {
	/**Statistic block for a RPG Game
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(StatPanel.class.getName());

	JTextField statLabel = new JTextField();
	JLabel modifierLabel = new JLabel();
	int stat;
	int modifier;

	/**Initialisation
	 * @param statName - Name and title of the statistic
	 * */
	public StatPanel(String statName, int stat, CharacterStatsController controller) {

		//Setting up the Title for the statistic
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, statName);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);

		if (stat > 20) {
			LOGGER.info("Stat exceeded max limit of 20, setting it to 20");
			stat = 20;
		} else if (stat < 0) {
			LOGGER.info("Stat subceeded min limit of 0, setting it to 0");
			stat = 0;
		}
		// Take initial statistic and add it to class variables
		stat = stat;
		// Calculate Modifier based off statistic
		calcModifier();

		
		// Setting to a readable font and size
		Font fontStyle = new Font("Arial", Font.BOLD, 10);

		this.setLayout(new GridBagLayout());
		

		// Create main statistic text area and set its values
		statLabel.setText(String.valueOf(stat));
		statLabel.setHorizontalAlignment(SwingConstants.CENTER);
		statLabel.setFont(fontStyle);
		this.add(statLabel, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		modifierLabel.setText(String.valueOf(modifier));
		modifierLabel.setHorizontalAlignment(SwingConstants.CENTER);
		modifierLabel.setFont(fontStyle);
		this.add(modifierLabel, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Make and contain buttons
		Button plusButton = new Button("+");
		plusButton.setActionCommand(statName.toLowerCase()+"_plus");
		plusButton.setFont(fontStyle);
		this.add(plusButton, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		Button minusButton = new Button("-");
		minusButton.setActionCommand(statName.toLowerCase()+"_minus");
		minusButton.setFont(fontStyle);
		this.add(minusButton, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Comment this out when not debugging
		statLabel.setBorder(blackline);
		modifierLabel.setBorder(blackline);

		plusButton.addActionListener(controller);
		minusButton.addActionListener(controller);
	}

	private void calcModifier() {
		modifier = ((stat - 10) / 2);
	}

	private void Calc(String operator) {
		if (operator.equals("+") && stat < 20) {
			stat++;
			statLabel.setText(String.valueOf(stat));

		} else if (operator.equals("-") && stat >= 1) {
			stat--;
			statLabel.setText(String.valueOf(stat));
		}
		calcModifier();
		modifierLabel.setText(String.valueOf(modifier));
	}

}
