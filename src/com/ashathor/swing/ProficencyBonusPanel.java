/**
 * 
 */
package com.ashathor.swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @author Ash Dev
 *
 */
public class ProficencyBonusPanel extends JPanel {

	/**
	 * 
	 */
	public ProficencyBonusPanel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline);
		this.setBorder(title);
		JLabel proficencyTitle = new JLabel("Proficency Bonus", SwingConstants.CENTER);
		JLabel proficencyValue = new JLabel("1",SwingConstants.CENTER);
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		this.add(proficencyValue,new GridBagConstraints(0, 0, 1, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(proficencyTitle,new GridBagConstraints(1, 0, 1, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
	}
}
