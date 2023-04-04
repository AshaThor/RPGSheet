/**
 * 
 */
package com.ashathor.swing;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @author Ash Dev
 *
 */
public class OtherProfsAndLangsPanel extends JPanel {
	public OtherProfsAndLangsPanel() {
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Other Proficencies and Languages");
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JTextArea textArea = new JTextArea(10,10);
		textArea.setLineWrap(true);
		scrollArea.add(textArea);
		this.add(scrollArea);
		
	}

}
