package com.ashathor.rpgsheet.ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.ashathor.rpgsheet.controller.ProficencyController;
import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.utils.Skill;
import com.ashathor.rpgsheet.utils.Stat;

@SuppressWarnings("deprecation")
public class SkillsPanel extends JPanel implements Observer {

	/**
	 * Skills Panel creation class
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(SkillsPanel.class.getName());

	final static int GRID_COLS = 1;

	Character character;

	// 2D array used to store panels in sets of Stat values. This makes it easier to
	// traverse when updating the UI.
	ProficientStatPanel[][] panels = new ProficientStatPanel[Stat.values().length][Skill.values().length];

	public SkillsPanel(Character character, ProficencyController proficencyController) {

		this.character = character;
		this.character.addObserver(this);

		// Bit of design
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Skills");
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		GridLayout gridLayout = new GridLayout(Skill.values().length, GRID_COLS);
		this.setLayout(gridLayout);

		// Get all stats
		int[] stats = character.getStats();
		// Get the proficiency status of the character
		boolean[] skillProficencies = character.getSkillProficencies();

		// Dynamically making the UI based on the Stat and Skill ENUM
		for (Skill skill : Skill.values()) {
			// Get the current proficiency of the current skill
			boolean procicent = skillProficencies[skill.ordinal()];
			// Make a new panel and put it in the 2D array in the right place
			panels[skill.getStat().ordinal()][skill.ordinal()] = (new ProficientStatPanel(skill.getTitle(),
					stats[skill.getStat().ordinal()], skill.getStat().getAbbreviation(), proficencyController,
					procicent, false));
			// Now add this to the UI
			this.add(panels[skill.getStat().ordinal()][skill.ordinal()]);

		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// Get what Stat has changed then go find all the skills that the stat changes
		Stat statArg = Stat.valueOf(arg.toString());

		switch (statArg) {
		case STRENGTH:
			LOGGER.fine(Stat.STRENGTH.getTitle() + " skills are being updated");
			ProficientStatPanel[] stenghtPanelSet = panels[Stat.STRENGTH.ordinal()];
			for (ProficientStatPanel individualPanel : stenghtPanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getStrength());
					individualPanel.update();
				}
			}
			break;
		case DEXTERITY:
			LOGGER.fine(Stat.DEXTERITY.getTitle() + " skills are being updated");
			ProficientStatPanel[] dexterityPanelSet = panels[Stat.DEXTERITY.ordinal()];
			for (ProficientStatPanel individualPanel : dexterityPanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getDexterity());
					individualPanel.update();
				}
			}
			break;
		case CONSTITUTION:
			LOGGER.fine(Stat.CONSTITUTION.getTitle() + " skills are being updated");
			ProficientStatPanel[] constitutionPanelSet = panels[Stat.CONSTITUTION.ordinal()];
			for (ProficientStatPanel individualPanel : constitutionPanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getConstitution());
					individualPanel.update();
				}
			}
			break;
		case INTELLIGENCE:
			LOGGER.fine(Stat.INTELLIGENCE.getTitle() + " skills are being updated");
			ProficientStatPanel[] intelligencePanelSet = panels[Stat.INTELLIGENCE.ordinal()];
			for (ProficientStatPanel individualPanel : intelligencePanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getIntelligence());
					individualPanel.update();
				}
			}
			break;
		case WISDOM:
			LOGGER.fine(Stat.WISDOM.getTitle() + " skills are being updated");
			ProficientStatPanel[] wisdomPanelSet = panels[Stat.WISDOM.ordinal()];
			for (ProficientStatPanel individualPanel : wisdomPanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getWisdom());
					individualPanel.update();
				}
			}
			break;
		case CHARISMA:
			LOGGER.fine(Stat.CHARISMA.getTitle() + " skills are being updated");
			ProficientStatPanel[] charismaPanelSet = panels[Stat.CHARISMA.ordinal()];
			for (ProficientStatPanel individualPanel : charismaPanelSet) {
				if (null != individualPanel) {
					individualPanel.setLabel(character.getCharisma());
					individualPanel.update();
				}
			}
			break;
		}
	}
}
