package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HpAndArmourPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField armourClass = new JTextField("14");
	JTextField inititive = new JTextField("1");
	JTextField speed = new JTextField("1");
	JTextField temporaryHitPoints = new JTextField("yeeet");

	public HpAndArmourPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);

		armourClass.setHorizontalAlignment(JTextField.CENTER);
		inititive.setHorizontalAlignment(JTextField.CENTER);
		speed.setHorizontalAlignment(JTextField.CENTER);
		temporaryHitPoints.setHorizontalAlignment(JTextField.CENTER);
		
		// armourClass.setEditable(false);
		armourClass.setBorder(formatTitle("Armour Class"));
		inititive.setBorder(formatTitle("Inititive"));
		speed.setBorder(formatTitle("Speed"));
		temporaryHitPoints.setBorder(formatTitle("Temporary Hit Points"));
		this.add(armourClass, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(inititive, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(speed, new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(currentHitPoints(), new GridBagConstraints(0, 1, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		this.add(temporaryHitPoints, new GridBagConstraints(0, 2, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	}

	private TitledBorder formatTitle(String titleText) {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, titleText);
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		return title;
	}

	private JPanel currentHitPoints() {
		JPanel jPanel = new JPanel();
		JLabel hpMax = new JLabel("Hit Point Maximum");
		JTextField hpMaxValue = new JTextField("90");
		JTextField currentHpValue = new JTextField("12");
		
		hpMaxValue.setHorizontalAlignment(JTextField.CENTER);
		currentHpValue.setHorizontalAlignment(JTextField.CENTER);

		hpMax.setFont(new Font("Arial", Font.PLAIN, 10));
		hpMax.setForeground(Color.GRAY);

		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);

		jPanel.add(hpMax, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		jPanel.add(hpMaxValue, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
		jPanel.add(currentHpValue, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

		jPanel.setBorder(formatTitle("Current Hit Points"));
		return jPanel;

	}

}
