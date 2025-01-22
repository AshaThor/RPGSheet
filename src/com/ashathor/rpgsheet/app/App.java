/**
 * 
 */
package com.ashathor.rpgsheet.app;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.MainFrame;
import com.formdev.flatlaf.FlatDarculaLaf;

/**
 * @author Ash Dev
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FlatDarculaLaf.setup();
		try {
			UIManager.setLookAndFeel(new FlatDarculaLaf());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Character character = new Character();
		setupCharacter(character);
		MainFrame frame = new MainFrame(character);
		EventQueue.invokeLater(() -> {
			frame.setVisible(true);
		});
		
		
	}
		private static void setupCharacter(Character character){
			character.setName("Throom Pending");
			character.setCla55("Artificer");
			character.setLevel("3");
			character.setBackground("Background");
			character.setPlayerName("Ashley");
			character.setRace("Ele");
			character.setAlignment("yes");
			character.setExp("number");
			
			character.setStrength(9);
			character.setDexterity(10);
			character.setConstitution(9);
			character.setIntelligence(9);
			character.setWisdom(9);
			character.setCharisma(9);
			
			character.setAcrobaticsProf(true);
			
			//character.setPassiveWisdom(9);
			//character.setInspiration(0);
			//character.setProficiencyBonus(1);
			
			character.setPlatinum(99);
			character.setArmourClass("12");
		}
}
