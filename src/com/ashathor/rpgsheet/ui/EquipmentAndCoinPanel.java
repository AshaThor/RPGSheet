package com.ashathor.rpgsheet.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.utlis.ScrollAreaFactory;

public class EquipmentAndCoinPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	static final String EQUIPMENT = "Equipment";
	
	public EquipmentAndCoinPanel(Character character) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		CoinPanel coinPanel = new CoinPanel(character);
		WornEquipmentPanel wornEquipmentPanel = new WornEquipmentPanel(character);
		JScrollPane equipmentScrollPane = ScrollAreaFactory.create(EQUIPMENT);
		this.add(coinPanel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(wornEquipmentPanel, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(equipmentScrollPane, new GridBagConstraints(0, 1, 2, 1, 1.0, 9.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
	}

}

