/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.ui.utlis.ScrollAreaFactory;

/**
 * @author Ash Dev
 *
 */
public class TraitsPanel extends JPanel {

	/**
	 * 
	 */
	
	static final String PERSONAL_TRAITS = "Personal Traits";
	static final String IDEALS = "Ideals";
	static final String BONDS = "Bonds";
	static final String FLAWS = "Flaws";
	
	private static final long serialVersionUID = 1L;
	
	public TraitsPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		this.setLayout(gridBagLayout);
		
		JScrollPane personalTraits = ScrollAreaFactory.create(PERSONAL_TRAITS);
		JScrollPane ideals = ScrollAreaFactory.create(IDEALS);
		JScrollPane bonds = ScrollAreaFactory.create(BONDS);
		JScrollPane flaws = ScrollAreaFactory.create(FLAWS);
		
		this.add(personalTraits, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(ideals, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(bonds, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(flaws, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
	}
	

}
