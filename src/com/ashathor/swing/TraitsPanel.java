/**
 * 
 */
package com.ashathor.swing;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Ash Dev
 *
 */
public class TraitsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TraitsPanel() {
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JTextArea textArea = new JTextArea(25,25);
		scrollArea.add(textArea);
		this.add(textArea);
	}

}
