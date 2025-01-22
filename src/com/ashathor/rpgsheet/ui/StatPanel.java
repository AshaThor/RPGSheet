package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.controller.CharacterStatsController;
import com.ashathor.rpgsheet.utils.Modifier;
import com.ashathor.rpgsheet.utils.Stat;

public class StatPanel extends JPanel {
	/**
	 * Statistic block for a RPG Game
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(StatPanel.class.getName());

	JLabel statLabel = new JLabel();
	JLabel modifierLabel = new JLabel();

	/**
	 * Initialisation
	 * 
	 * @param statName - Name and title of the statistic
	 */
	public StatPanel(Stat statName, int stat, CharacterStatsController controller) {

		// Setting up the Title for the statistic
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, statName.getTitle());
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);

		// Setting to a readable font and size
		Font bigFontStyle = new Font("Arial", Font.BOLD, 14);
		Font smallFontStyle = new Font("Arial", Font.PLAIN, 12);

		this.setLayout(new GridBagLayout());

		setLabels(stat);

		// Create main statistic text area and set its values
		statLabel.setHorizontalAlignment(SwingConstants.CENTER);
		statLabel.setFont(smallFontStyle);
		this.add(statLabel, new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		modifierLabel.setHorizontalAlignment(SwingConstants.CENTER);
		modifierLabel.setFont(bigFontStyle);
		this.add(modifierLabel, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Make and contain buttons
		JButton plusButton = new JButton("+");
		plusButton.setActionCommand(statName + "_plus");
		plusButton.setFont(smallFontStyle);
		this.add(plusButton, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		JButton minusButton = new JButton("-");
		minusButton.setActionCommand(statName + "_minus");
		minusButton.setFont(smallFontStyle);
		this.add(minusButton, new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		// Comment this out when not debugging
		// statLabel.setBorder(blackline);
		// modifierLabel.setBorder(blackline);

		plusButton.addActionListener(controller);
		minusButton.addActionListener(controller);
	}

	public void setLabels(Integer value) {
		LOGGER.fine("Updating stat label");
		statLabel.setText(String.valueOf(value));
		modifierLabel.setText(String.valueOf(Modifier.calc(value)));
	}

	public void update() {
		this.revalidate();
		this.repaint();
	}
}
