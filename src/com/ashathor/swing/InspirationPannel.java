/**
 * 
 */
package com.ashathor.swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
public class InspirationPannel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InspirationPannel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline);
		this.setBorder(title);
		JLabel inspirationTitle = new JLabel("Inspiration", SwingConstants.CENTER);
		JLabel inspirationValue = new JLabel("1",SwingConstants.CENTER);
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		this.add(inspirationValue,new GridBagConstraints(0, 0, 1, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(inspirationTitle,new GridBagConstraints(1, 0, 1, 1, 1.0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		
	}

}
