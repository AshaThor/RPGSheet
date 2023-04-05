package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TitleBar extends JPanel {
	
	static final String CHARACTER_NAME = "Character Name";
	static final String CLASS_AND_LEVEL = "Class and Level";
	static final String BACKGROUND = "Background";
	static final String PLAYER_NAME = "Player Name";
	static final String RACE = "Race";
	static final String ALIGNMENT = "Alignment";
	static final String EXPERENCE_POINTS = "Experence Points";

	public TitleBar() {
		JLabel name = new JLabel("Throom Pending");
		JLabel classAndLevel = new JLabel("Artificer 4");
		JLabel background = new JLabel("Guild Artisan");
		JLabel playerName = new JLabel("Ashley");
		JLabel race = new JLabel("Loxidon");
		JLabel alignment = new JLabel("Lawful Good");
		JLabel experencePoints = new JLabel("18");
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		

		Font nameFormat = new Font("Arial", Font.BOLD, 25);
		
		name.setFont(nameFormat);
		
		name.setBorder(formatTitle(CHARACTER_NAME));
		classAndLevel.setBorder(formatTitle(CLASS_AND_LEVEL));
		background.setBorder(formatTitle(BACKGROUND));
		playerName.setBorder(formatTitle(PLAYER_NAME));
		race.setBorder(formatTitle(RACE));
		alignment.setBorder(formatTitle(ALIGNMENT));
		experencePoints.setBorder(formatTitle(EXPERENCE_POINTS));
		
		this.add(name, new GridBagConstraints(0, 0, 1, 2, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(classAndLevel, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(background, new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(playerName, new GridBagConstraints(3, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(race, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(alignment, new GridBagConstraints(2, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(experencePoints, new GridBagConstraints(3, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	}
	
	private TitledBorder formatTitle(String titleText) {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, titleText);
		title.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		//title.setTitleJustification(TitledBorder.CENTER);
		return title;
	}
}
