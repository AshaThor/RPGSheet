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
import com.ashathor.rpgsheet.utils.Stat;

public class SavingThrowsPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(SavingThrowsPanel.class.getName());

	Character character;

	ProficientStatPanel[] panels = new ProficientStatPanel[Stat.values().length];

	/**
	 * Saving throws creates a JPanel that contains more panels of each statistic
	 */
	public SavingThrowsPanel(Character character, ProficencyController proficencyController) {

		this.character = character;
		this.character.addObserver(this);

		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = new TitledBorder(blackline);
		title = BorderFactory.createTitledBorder(blackline, "Saving Throws");
		title.setTitlePosition(TitledBorder.BOTTOM);
		title.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(title);
		GridLayout gridLayout = new GridLayout(6, 1);
		this.setLayout(gridLayout);

		for (Stat stat : Stat.values()) {
			int[] stats = character.getStats();
			int statValue = stats[stat.ordinal()];
			boolean[] statProf = character.getSavingThrows();
			boolean proficient = statProf[stat.ordinal()];
			panels[stat.ordinal()] = (new ProficientStatPanel(stat.getTitle(), statValue, proficencyController,
					proficient, true));
			this.add(panels[stat.ordinal()]);
		}

	}

	@Override
	public void update(Observable o, Object arg) {
		Stat stat = Stat.valueOf(arg.toString());
		ProficientStatPanel panel = null;
		switch (stat) {
		case STRENGTH:
			panel = panels[Stat.STRENGTH.ordinal()];
			panel.setLabel(character.getStrength());
			break;
		case DEXTERITY:
			panel = panels[Stat.DEXTERITY.ordinal()];
			panel.setLabel(character.getDexterity());
			break;
		case CONSTITUTION:
			panel = panels[Stat.CONSTITUTION.ordinal()];
			panel.setLabel(character.getConstitution());
			break;
		case INTELLIGENCE:
			panel = panels[Stat.INTELLIGENCE.ordinal()];
			panel.setLabel(character.getIntelligence());
			break;
		case WISDOM:
			panel = panels[Stat.WISDOM.ordinal()];
			panel.setLabel(character.getWisdom());
			break;
		case CHARISMA:
			panel = panels[Stat.CHARISMA.ordinal()];
			panel.setLabel(character.getCharisma());
			break;
		}
		if (null != panel) {
			panel.update();
			}
	}

}
