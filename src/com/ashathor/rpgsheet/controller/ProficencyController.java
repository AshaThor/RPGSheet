/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.ProficiencyPanel;
import com.ashathor.rpgsheet.utils.Skill;
import com.ashathor.rpgsheet.utils.Stat;

/**
 * @author Ash Dev
 *
 */
public class ProficencyController implements ActionListener {

	private static final Logger LOGGER = Logger.getLogger(ProficencyController.class.getName());

	Character model;
	ProficiencyPanel view;

	/**
	 * 
	 */
	public ProficencyController(Character character, ProficiencyPanel proficencyPanel) {
		super();
		this.model = character;
		this.view = proficencyPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LOGGER.warning(e.getActionCommand().toString());
		//Splitting on _ as in ProficentStatFactory action command is given 2 bits of data with a _ to sepperate
		String[] identifiers = e.getActionCommand().split("_");
		proficencySelect(identifiers);
	}

	private void proficencySelect(String[] identifiers) {
		if (identifiers[1].equalsIgnoreCase("true")) {
			Stat stat = Stat.valueOf(identifiers[0].toUpperCase());
			switch (stat) {
			case STRENGTH:
				model.setStrengthProf(!model.isStrengthProf());
				break;
			case DEXTERITY:
				model.setDeceptionProf(!model.isDexterityProf());
				break;
			case CONSTITUTION:
				model.setConstitutionProf(!model.isConstitutionProf());
				break;
			case INTELLIGENCE:
				model.setIntelligenceProf(!model.isIntelligenceProf());
				break;
			case WISDOM:
				model.setWisdomProf(!model.isWisdomProf());
				break;
			case CHARISMA:
				model.setCharismaProf(!model.isCharismaProf());
				break;
			}
		} else if (identifiers[1].equalsIgnoreCase("false")) {
			//Because Animal Handling and Sleight of Hand just had to use spaces.
			identifiers[0] = identifiers[0].replace(" ", "_");
			Skill skill = Skill.valueOf(identifiers[0].toUpperCase());
			
			switch (skill) {
			case ACROBATICS:
				model.setAcrobaticsProf(!model.isAcrobaticsProf());
				break;
			case ANIMAL_HANDLING:
				model.setAnimalHandlingProf(!model.isAnimalHandlingProf());
				break;
			case ARCANA:
				model.setArcanaProf(!model.isArcanaProf());
				break;
			case ATHLETICS:
				model.setAthleticsProf(!model.isAthleticsProf());
				break;
			case DECEPTION:
				model.setDeceptionProf(!model.isDeceptionProf());
				break;
			case HISTORY:
				model.setHistoryProf(!model.isHistoryProf());
				break;
			case INSIGHT:
				model.setInsightProf(!model.isInsightProf());
				break;
			case INTIMIDATION:
				model.setIntimidationProf(!model.isIntimidationProf());
				break;
			case INVESTIGATION:
				model.setInvestigationProf(!model.isInvestigationProf());
				break;
			case MEDICINE:
				model.setMedicineProf(!model.isMedicineProf());
				break;
			case NATURE:
				model.setNatureProf(!model.isNatureProf());
				break;
			case PERCEPTION:
				model.setPerceptionProf(!model.isPerceptionProf());
				break;
			case PERFORMANCE:
				model.setPerfomanceProf(!model.isPerfomanceProf());
				break;
			case PERSUASION:
				model.setPersuationProf(!model.isPersuationProf());
				break;
			case RELIGION:
				model.setReligionProf(!model.isReligionProf());
				break;
			case SLEIGHT_OF_HAND:
				model.setSlightOfHandProf(!model.isSlightOfHandProf());
				break;
			case STEALTH:
				model.setStealthProf(!model.isStealthProf());
				break;
			case SURVIVAL:
				model.setSurvivalProf(!model.isSurvivalProf());
				break;
			}
		}
	}

}
