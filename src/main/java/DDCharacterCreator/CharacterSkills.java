package DDCharacterCreator;

import java.io.Serializable;

public class CharacterSkills implements Serializable{

    private Integer charAcrobatics;
    private Integer charAnimalHandling;
    private Integer charArcana;
    private Integer charAthletics;
    private Integer charDeception;
    private Integer charHistory;
    private Integer charInsight;
    private Integer charIntimidation;
    private Integer charInvestigation;
    private Integer charMedicine;
    private Integer charNature;
    private Integer charPerception;
    private Integer charPerformance;
    private Integer charPersuasion;
    private Integer charReligion;
    private Integer charSleightOfHand;
    private Integer charStealth;
    private Integer charSurvival;

    public Integer getCharAcrobatics() {
        return charAcrobatics;
    }

    public void setCharAcrobatics(Integer charAcrobatics) {
        this.charAcrobatics = charAcrobatics;
    }

    public Integer getCharAnimalHandling() { return charAnimalHandling; }

    public void setCharAnimalHandling(Integer charAnimalHandling) {
        this.charAnimalHandling = charAnimalHandling;
    }

    public Integer getCharArcana() {
        return charArcana;
    }

    public void setCharArcana(Integer charArcana) {
        this.charArcana = charArcana;
    }

    public Integer getCharAthletics() {
        return charAthletics;
    }

    public void setCharAthletics(Integer charAthletics) {
        this.charAthletics = charAthletics;
    }

    public Integer getCharDeception() {
        return charDeception;
    }

    public void setCharDeception(Integer charDeception) {
        this.charDeception = charDeception;
    }

    public Integer getCharHistory() {
        return charHistory;
    }

    public void setCharHistory(Integer charHistory) {
        this.charHistory = charHistory;
    }

    public Integer getCharInsight() {
        return charInsight;
    }

    public void setCharInsight(Integer charInsight) {
        this.charInsight = charInsight;
    }

    public Integer getCharIntimidation() {
        return charIntimidation;
    }

    public void setCharIntimidation(Integer charIntimidation) {
        this.charIntimidation = charIntimidation;
    }

    public Integer getCharInvestigation() {
        return charInvestigation;
    }

    public void setCharInvestigation(Integer charInvestigation) {
        this.charInvestigation = charInvestigation;
    }

    public Integer getCharMedicine() {
        return charMedicine;
    }

    public void setCharMedicine(Integer charMedicine) {
        this.charMedicine = charMedicine;
    }

    public Integer getCharNature() {
        return charNature;
    }

    public void setCharNature(Integer charNature) {
        this.charNature = charNature;
    }

    public Integer getCharPerception() {
        return charPerception;
    }

    public void setCharPerception(Integer charPerception) {
        this.charPerception = charPerception;
    }

    public Integer getCharPerformance() {
        return charPerformance;
    }

    public void setCharPerformance(Integer charPerformance) {
        this.charPerformance = charPerformance;
    }

    public Integer getCharPersuasion() {
        return charPersuasion;
    }

    public void setCharPersuasion(Integer charPersuasion) {
        this.charPersuasion = charPersuasion;
    }

    public Integer getCharReligion() {
        return charReligion;
    }

    public void setCharReligion(Integer charReligion) {
        this.charReligion = charReligion;
    }

    public Integer getCharSleightOfHand() {
        return charSleightOfHand;
    }

    public void setCharSleightOfHand(Integer charSleightOfHand) {
        this.charSleightOfHand = charSleightOfHand;
    }

    public Integer getCharStealth() {
        return charStealth;
    }

    public void setCharStealth(Integer charStealth) {
        this.charStealth = charStealth;
    }

    public Integer getCharSurvival() {
        return charSurvival;
    }

    public void setCharSurvival(Integer charSurvival) {
        this.charSurvival = charSurvival;
    }

    public static CharacterSkills getSkills(Character c) {
        CharacterSkills s = new CharacterSkills();
        Integer dex, intel, wis, chr;

        // set default values
        s.setCharAthletics(c.getCharStrength());
        s.setCharAcrobatics(c.getCharDexterity());
        s.setCharSleightOfHand(c.getCharDexterity());
        s.setCharStealth(c.getCharDexterity());
        s.setCharArcana(c.getCharIntelligence());
        s.setCharHistory(c.getCharIntelligence());
        s.setCharInvestigation(c.getCharIntelligence());
        s.setCharNature(c.getCharIntelligence());
        s.setCharReligion(c.getCharIntelligence());
        s.setCharAnimalHandling(c.getCharWisdom());
        s.setCharInsight(c.getCharWisdom());
        s.setCharMedicine(c.getCharWisdom());
        s.setCharPerception(c.getCharWisdom());
        s.setCharSurvival(c.getCharWisdom());
        s.setCharDeception(c.getCharCharisma());
        s.setCharIntimidation(c.getCharCharisma());
        s.setCharPerformance(c.getCharCharisma());
        s.setCharPersuasion(c.getCharCharisma());

        // character specific bonuses
        switch (c.getCharRace()) {
            case HILLDWARF:
                wis = getModifiers(c.getCharWisdom(), c.getCharLevel(), 1);
                s.setCharAnimalHandling(wis);
                s.setCharInsight(wis);
                s.setCharMedicine(wis);
                s.setCharPerception(wis);
                s.setCharSurvival(wis);
                break;
            case MOUNTAINDWARF:
                s.setCharAthletics(getModifiers(c.getCharStrength(), c.getCharLevel(), 2));
                break;
            case HIGHELF:
                intel = getModifiers(c.getCharIntelligence(), c.getCharLevel(), 1);
                s.setCharArcana(intel);
                s.setCharHistory(intel);
                s.setCharInvestigation(intel);
                s.setCharNature(intel);
                s.setCharReligion(intel);
                break;
            case WOODELF:
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 2);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                wis = getModifiers(c.getCharWisdom(), c.getCharLevel(), 1);
                s.setCharAnimalHandling(wis);
                s.setCharInsight(wis);
                s.setCharMedicine(wis);
                s.setCharPerception(wis);
                s.setCharSurvival(wis);
                break;
            case DARKELF:
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 2);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                break;
            case LIGHTFOOTHALFLING:
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 2);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                chr = getModifiers(c.getCharCharisma(), c.getCharLevel(), 1);
                s.setCharDeception(chr);
                s.setCharIntimidation(chr);
                s.setCharPerformance(chr);
                s.setCharPersuasion(chr);
                break;
            case STOUTHALFLING:
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 2);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                break;
            case HUMAN:
                s.setCharAthletics(getModifiers(c.getCharStrength(), c.getCharLevel(), 1));
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 1);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                intel = getModifiers(c.getCharIntelligence(), c.getCharLevel(), 1);
                s.setCharArcana(intel);
                s.setCharHistory(intel);
                s.setCharInvestigation(intel);
                s.setCharNature(intel);
                s.setCharReligion(intel);
                wis = getModifiers(c.getCharWisdom(), c.getCharLevel(), 1);
                s.setCharAnimalHandling(wis);
                s.setCharInsight(wis);
                s.setCharMedicine(wis);
                s.setCharPerception(wis);
                s.setCharSurvival(wis);
                chr = getModifiers(c.getCharCharisma(), c.getCharLevel(), 1);
                s.setCharDeception(chr);
                s.setCharIntimidation(chr);
                s.setCharPerformance(chr);
                s.setCharPersuasion(chr);
                break;
            case DRAGONBORN:
                s.setCharAthletics(getModifiers(c.getCharStrength(), c.getCharLevel(), 2));
                chr = getModifiers(c.getCharCharisma(), c.getCharLevel(), 1);
                s.setCharDeception(chr);
                s.setCharIntimidation(chr);
                s.setCharPerformance(chr);
                s.setCharPersuasion(chr);
                break;
            case FORESTGNOME:
                dex = getModifiers(c.getCharDexterity(), c.getCharLevel(), 1);
                s.setCharAcrobatics(dex);
                s.setCharSleightOfHand(dex);
                s.setCharStealth(dex);
                intel = getModifiers(c.getCharIntelligence(), c.getCharLevel(), 2);
                s.setCharArcana(intel);
                s.setCharHistory(intel);
                s.setCharInvestigation(intel);
                s.setCharNature(intel);
                s.setCharReligion(intel);
                break;
            case ROCKGNOME:
                break;
            case HALFELF:
                chr = getModifiers(c.getCharCharisma(), c.getCharLevel(), 2);
                s.setCharDeception(chr);
                s.setCharIntimidation(chr);
                s.setCharPerformance(chr);
                s.setCharPersuasion(chr);
                break;
            case HALFORC:
                s.setCharAthletics(getModifiers(c.getCharStrength(), c.getCharLevel(), 2));
                break;
            case TIEFLING:
                intel = getModifiers(c.getCharIntelligence(), c.getCharLevel(), 1);
                s.setCharArcana(intel);
                s.setCharHistory(intel);
                s.setCharInvestigation(intel);
                s.setCharNature(intel);
                s.setCharReligion(intel);
                chr = getModifiers(c.getCharCharisma(), c.getCharLevel(), 2);
                s.setCharDeception(chr);
                s.setCharIntimidation(chr);
                s.setCharPerformance(chr);
                s.setCharPersuasion(chr);
                break;
        }
        return s;
    }

    private static Integer getModifiers(Integer score, Integer level, Integer mod){
        return score + Enum.getProficiencyBonus(level) + mod;
    }
}
