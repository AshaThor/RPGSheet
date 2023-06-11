/**
 * 
 */
package com.ashathor.rpgsheet.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.model.Character;
import com.ashathor.rpgsheet.ui.ProficiencyPanel;
import com.ashathor.rpgsheet.utils.SkillNames;
import com.ashathor.rpgsheet.utils.StatNames;

/**
 * @author Ash Dev
 *
 */
public class ProficencyController implements ActionListener{
	
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
		proficencySelect(e.getActionCommand().toString());
	}
	
	private void proficencySelect(String identifier){
		switch(identifier){
		case StatNames.STRENGTH:
			model.setStrengthProf(!model.isStrengthProf());
			break;
		case StatNames.DEXTERITY:
			model.setDeceptionProf(!model.isDexterityProf());
			break;
		case StatNames.CONSTITUTION:
			model.setConstitutionProf(!model.isConstitutionProf());
			break;
		case StatNames.INTELLIGENCE:
			model.setIntelligenceProf(!model.isIntelligenceProf());
			break;
		case StatNames.WISDOM:
			model.setWisdomProf(!model.isWisdomProf());
			break;
		case StatNames.CHARISMA:
			model.setCharismaProf(!model.isCharismaProf());
			break;
		case SkillNames.ACROBATICS:
			model.setAcrobaticsProf(!model.isAcrobaticsProf());
			break;
		case SkillNames.ANIMAL_HANDLING:
			model.setAnimalHandlingProf(!model.isAnimalHandlingProf());
			break;
		case SkillNames.ARCANA:
			model.setArcanaProf(!model.isArcanaProf());
			break;
		case SkillNames.ATHLETICS:
			model.setAthleticsProf(!model.isAthleticsProf());
			break;
		case SkillNames.DECEPTION:
			model.setDeceptionProf(!model.isDeceptionProf());
			break;
		case SkillNames.HISTORY:
			model.setHistoryProf(!model.isHistoryProf());
			break;
		case SkillNames.INSIGHT:
			model.setInsightProf(!model.isInsightProf());
			break;
		case SkillNames.INTIMIDATION:
			model.setIntimidationProf(!model.isIntimidationProf());
			break;
		case SkillNames.INVESTIGATION:
			model.setInvestigationProf(!model.isInvestigationProf());
			break;
		case SkillNames.MEDICINE:
			model.setMedicineProf(!model.isMedicineProf());
			break;
		case SkillNames.NATURE:
			model.setNatureProf(!model.isNatureProf());
			break;
		case SkillNames.PERCEPTION:
			model.setPerceptionProf(!model.isPerceptionProf());
			break;
		case SkillNames.PERFORMANCE:
			model.setPerfomanceProf(!model.isPerfomanceProf());
			break;
		case SkillNames.PERSUASION:
			model.setPersuationProf(!model.isPersuationProf());
			break;
		case SkillNames.RELIGION:
			model.setReligionProf(!model.isReligionProf());
			break;
		case SkillNames.SLIGHT_OF_HAND:
			model.setSlightOfHandProf(!model.isSlightOfHandProf());
			break;
		case SkillNames.STEALTH:
			model.setStealthProf(!model.isStealthProf());
			break;
		case SkillNames.SURVIVAL:
			model.setSurvivalProf(!model.isSurvivalProf());
			break;
		}
	}

}
