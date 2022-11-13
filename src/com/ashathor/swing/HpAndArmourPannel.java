package com.ashathor.swing;

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

public class HpAndArmourPannel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel armourClass = new JLabel("1");
	JLabel inititive = new JLabel("1");
	JLabel speed = new JLabel("1");
	JLabel temporaryHitPoints = new JLabel("yeeet");
	public HpAndArmourPannel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		armourClass.setBorder(formatTitle("Armour Class"));
		inititive.setBorder(formatTitle("Inititive"));
		speed.setBorder(formatTitle("Speed"));
		temporaryHitPoints.setBorder(formatTitle("Temporary Hit Points"));
		this.add(armourClass, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(inititive, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(speed, new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(currentHitPoints(), new GridBagConstraints(0, 1, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(temporaryHitPoints, new GridBagConstraints(0, 2, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
	}
	
	private TitledBorder formatTitle(String titleText) {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, titleText);
		title.setTitlePosition(TitledBorder.BELOW_BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		return title;
	}
	private JPanel currentHitPoints() {
		JPanel jPanel = new JPanel();
		JLabel hpMax = new JLabel("Hit Point Maximum");
		JLabel hpMaxValue = new JLabel("90");
		JLabel currentHpValue = new JLabel("12");
		
		
		hpMax.setFont(new Font("Arial", Font.PLAIN, 10));
		hpMax.setForeground(Color.GRAY);
		

		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		
		jPanel.add(hpMax, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		jPanel.add(hpMaxValue, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		jPanel.add(currentHpValue, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
		jPanel.setBorder(formatTitle("Current Hit Points"));
		return jPanel;
		
	}

}
