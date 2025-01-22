package com.ashathor.rpgsheet.ui.utlis;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class ScrollAreaFactory extends JScrollPane {
	private static final long serialVersionUID = 1L;

	public static JScrollPane create( String titleText) {
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

