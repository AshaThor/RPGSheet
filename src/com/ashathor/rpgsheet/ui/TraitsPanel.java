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
		
		JScrollPane personalTraits = makeScrollArea(PERSONAL_TRAITS);
		JScrollPane ideals = makeScrollArea(IDEALS);
		JScrollPane bonds = makeScrollArea(BONDS);
		JScrollPane flaws = makeScrollArea(FLAWS);
		
		this.add(personalTraits, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(ideals, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(bonds, new GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		this.add(flaws, new GridBagConstraints(0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
	}
	
	private JScrollPane makeScrollArea(String titleText) 
	{
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, titleText);
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		
		JTextArea textArea = new JTextArea(9,170);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		JScrollPane scrollArea = new JScrollPane(textArea);
		scrollArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		scrollArea.setBorder(title);
		
		return scrollArea;
	}

}
