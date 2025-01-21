/**
 * 
 */
package com.ashathor.rpgsheet.app;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyleConstants.CharacterConstants;

import com.ashathor.rpgsheet.ui.ApplicationMenuBar;
import com.ashathor.rpgsheet.ui.HpAndArmourPanel;
import com.ashathor.rpgsheet.ui.InspirationPanel;
import com.ashathor.rpgsheet.ui.MainFrame;
import com.ashathor.rpgsheet.ui.OtherProfsAndLangsPanel;
import com.ashathor.rpgsheet.ui.PassiveWisdomPanel;
import com.ashathor.rpgsheet.ui.ProficencyBonusPanel;
import com.ashathor.rpgsheet.ui.SavingThrowsPanel;
import com.ashathor.rpgsheet.ui.SkillsPanel;
import com.ashathor.rpgsheet.ui.StatsPanel;
import com.ashathor.rpgsheet.ui.TabbedPanel;
import com.ashathor.rpgsheet.ui.TitleBar;
import com.ashathor.rpgsheet.controller.FileMenuController;
import com.ashathor.rpgsheet.model.Character;

/**
 * @author Ash Dev
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
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
			character.setDexterity(9);
			character.setConstitution(9);
			character.setIntelligence(9);
			character.setWisdom(9);
			character.setCharisma(9);
			
			character.setPassiveWisdom(9);
			character.setInspiration(0);
			character.setProficiencyBonus(1);
			
			character.setArmourClass(12);
			
			character.setAcrobaticsProf(true);
			character.setPlatinum(99);
		}
}
