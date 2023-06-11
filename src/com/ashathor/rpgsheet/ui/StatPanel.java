package com.ashathor.rpgsheet.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.controller.CharacterStatsController;

public class StatPanel extends JPanel {
	/**Statistic block for a RPG Game
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(StatPanel.class.getName());

	JLabel statLabel = new JLabel();
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

		this.stat = validateStat(stat);
		// Calculate Modifier based off statistic
		calcModifier(this.stat);

		
		// Setting to a readable font and size
		Font bigFontStyle = new Font("Arial", Font.BOLD, 14);
		Font smallFontStyle = new Font("Arial", Font.PLAIN, 12);

		this.setLayout(new GridBagLayout());
		

		// Create main statistic text area and set its values
		setLabels(this.stat);
		statLabel.setHorizontalAlignment(SwingConstants.CENTER);
		statLabel.setFont(smallFontStyle);
		this.add(statLabel, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		modifierLabel.setHorizontalAlignment(SwingConstants.CENTER);
		modifierLabel.setFont(bigFontStyle);
		this.add(modifierLabel, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Make and contain buttons
		Button plusButton = new Button("+");
		plusButton.setActionCommand(statName+"_plus");
		plusButton.setFont(smallFontStyle);
		this.add(plusButton, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		Button minusButton = new Button("-");
		minusButton.setActionCommand(statName+"_minus");
		minusButton.setFont(smallFontStyle);
		this.add(minusButton, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Comment this out when not debugging
		//statLabel.setBorder(blackline);
		//modifierLabel.setBorder(blackline);

		plusButton.addActionListener(controller);
		minusButton.addActionListener(controller);
	}

	private void calcModifier(Integer value) {
		modifier = Math.floorDiv((value-10), 2);
	}
	
	public void setLabels(Integer value) {
		statLabel.setText(String.valueOf(value));
		calcModifier(value);
		modifierLabel.setText(String.valueOf(modifier));
	}
	
	public void update() {
		this.revalidate();
		this.repaint();
		
	}
	private Integer validateStat(Integer stat) {

		if (stat > 20) {
			LOGGER.info("Stat exceeded max limit of 20, setting it to 20");
			stat = 20;
		} else if (stat < 0) {
			LOGGER.info("Stat subceeded min limit of 0, setting it to 0");
			stat = 0;
		}
		// Take initial statistic and add it to class variables
		return stat;
	}

}
