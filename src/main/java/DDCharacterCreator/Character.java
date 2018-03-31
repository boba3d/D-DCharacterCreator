package DDCharacterCreator;

public class Character{
    //Basic info
        private String charName;
        private Enum.Class charClass;
        private Integer charLevel;
        private String charGender;
        private Enum.Background charBackground;
        private Enum.Race charRace;
        private Enum.Alignment charAlignment;
        private Integer charExperiencePoints;
        private String charPlayerName;

    //Saving Throws
        private Integer charStrength;
        private Integer charDexterity;
        private Integer charConstitution;
        private Integer charIntelligence;
        private Integer charWisdom;
        private Integer charCharisma;

        private DDCharacterCreator.CharacterSkills charSkills;

        private Integer charArmorClass;
        private Integer charInitiative;
        private Integer charSpeed;
        private Integer charHitPointMaximum;
        private Integer charHitDice;

    //Attacks & spellcasting
        private String charATKName;
        private Integer charATKBonus;
        private String charATKDamageType;

    //Equipment
        private Integer charCP;
        private Integer charSP;
        private Integer charEP;
        private Integer charGP;
        private Integer charPP;
        private String charEquipment;

    //Character appearance
        private String charAppearance; //reference to db
        private Integer charAge;
        private String charHeight;
        private String charWeight;
        private Enum charEyeColor;
        private Enum charSkin;
        private Enum charHair;
        private String charSymbol;
        private String charBackstory;
        private String charAdditionalFeaturesTraits;
        private String Treasure;

        //**************************************************************** GETTER AND SETTERS ***************************************

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharGender() { return charGender; }

    public String getCharEquipment() { return charEquipment;}

    public void setCharEquipment() { this.charEquipment = charEquipment;}

    public void setCharGender() { this.charGender = charGender;  }

    public Enum.Class getCharClass() { return charClass; }

    public void setCharClass(Enum.Class charClass) {
        this.charClass = charClass;
    }

    public Integer getCharLevel() {
        return charLevel;
    }

    public void setCharLevel(Integer charLevel) {
        this.charLevel = charLevel;
    }

    public Enum.Background getCharBackground() {
        return charBackground;
    }

    public void setCharBackground(Enum.Background charBackground) {
        this.charBackground = charBackground;
    }

    public Enum.Race getCharRace() {
        return charRace;
    }

    public void setCharRace(Enum.Race charRace) {
        this.charRace = charRace;
    }

    public Enum.Alignment getCharAlignment() {
        return charAlignment;
    }

    public void setCharAlignment(Enum.Alignment charAlignment) {
        this.charAlignment = charAlignment;
    }

    public Integer getCharExperiencePoints() {
        return charExperiencePoints;
    }

    public void setCharExperiencePoints(Integer charExperiencePoints) {
        this.charExperiencePoints = charExperiencePoints;
    }

    public String getCharPlayerName() {
        return charPlayerName;
    }

    public void setCharPlayerName(String charPlayerName) {
        this.charPlayerName = charPlayerName;
    }

    public Integer getCharStrength() {
        return charStrength;
    }

    public void setCharStrength(Integer charStrength) {
        this.charStrength = charStrength;
    }

    public Integer getCharDexterity() {
        return charDexterity;
    }

    public void setCharDexterity(Integer charDexterity) {
        this.charDexterity = charDexterity;
    }

    public Integer getCharConstitution() {
        return charConstitution;
    }

    public void setCharConstitution(Integer charConstitution) {
        this.charConstitution = charConstitution;
    }

    public Integer getCharIntelligence() {
        return charIntelligence;
    }

    public void setCharIntelligence(Integer charIntelligence) {
        this.charIntelligence = charIntelligence;
    }

    public Integer getCharWisdom() {
        return charWisdom;
    }

    public void setCharWisdom(Integer charWisdom) {
        this.charWisdom = charWisdom;
    }

    public Integer getCharCharisma() {
        return charCharisma;
    }

    public void setCharCharisma(Integer charCharisma) {
        this.charCharisma = charCharisma;
    }

    public DDCharacterCreator.CharacterSkills getCharSkills() {
        return charSkills;
    }

    public void setCharSkills(DDCharacterCreator.CharacterSkills charSkills) {
        this.charSkills = charSkills;
    }

    public Integer getCharArmorClass() {
        return charArmorClass;
    }

    public void setCharArmorClass(Integer charArmorClass) {
        this.charArmorClass = charArmorClass;
    }

    public Integer getCharInitiative() {
        return charInitiative;
    }

    public void setCharInitiative(Integer charInitiative) {
        this.charInitiative = charInitiative;
    }

    public Integer getCharSpeed() {
        return charSpeed;
    }

    public void setCharSpeed(Integer charSpeed) {
        this.charSpeed = charSpeed;
    }

    public Integer getCharHitPointMaximum() {
        return charHitPointMaximum;
    }

    public void setCharHitPointMaximum(Integer charHitPointMaximum) {
        this.charHitPointMaximum = charHitPointMaximum;
    }

    public Integer getCharHitDice() {
        return charHitDice;
    }

    public void setCharHitDice(Integer charHitDice) {
        this.charHitDice = charHitDice;
    }

    public String getCharATKName() {
        return charATKName;
    }

    public void setCharATKName(String charATKName) {
        this.charATKName = charATKName;
    }

    public Integer getCharATKBonus() {
        return charATKBonus;
    }

    public void setCharATKBonus(Integer charATKBonus) {
        this.charATKBonus = charATKBonus;
    }

    public String getCharATKDamageType() {
        return charATKDamageType;
    }

    public void setCharATKDamageType(String charATKDamageType) {
        this.charATKDamageType = charATKDamageType;
    }

    public Integer getCharCP() {
        return charCP;
    }

    public void setCharCP(Integer charCP) {
        this.charCP = charCP;
    }

    public Integer getCharSP() {
        return charSP;
    }

    public void setCharSP(Integer charSP) {
        this.charSP = charSP;
    }

    public Integer getCharEP() {
        return charEP;
    }

    public void setCharEP(Integer charEP) {
        this.charEP = charEP;
    }

    public Integer getCharGP() {
        return charGP;
    }

    public void setCharGP(Integer charGP) {
        this.charGP = charGP;
    }

    public Integer getCharPP() {
        return charPP;
    }

    public void setCharPP(Integer charPP) {
        this.charPP = charPP;
    }

    public String getCharAppearance() {
        return charAppearance;
    }

    public void setCharAppearance(String charAppearance) {
        this.charAppearance = charAppearance;
    }

    public Integer getCharAge() {
        return charAge;
    }

    public void setCharAge(Integer charAge) {
        this.charAge = charAge;
    }

    public String getCharHeight() {
        return charHeight;
    }

    public void setCharHeight(String charHeight) {
        this.charHeight = charHeight;
    }

    public String getCharWeight() {
        return charWeight;
    }

    public void setCharWeight(String charWeight) {
        this.charWeight = charWeight;
    }

    public Enum getCharEyeColor() {
        return charEyeColor;
    }

    public void setCharEyeColor(Enum charEyeColor) {
        this.charEyeColor = charEyeColor;
    }

    public Enum getCharSkin() {
        return charSkin;
    }

    public void setCharSkin(Enum charSkin) {
        this.charSkin = charSkin;
    }

    public Enum getCharHair() {
        return charHair;
    }

    public void setCharHair(Enum charHair) {
        this.charHair = charHair;
    }

    public String getCharSymbol() {
        return charSymbol;
    }

    public void setCharSymbol(String charSymbol) {
        this.charSymbol = charSymbol;
    }

    public String getCharBackstory() {
        return charBackstory;
    }

    public void setCharBackstory(String charBackstory) {
        this.charBackstory = charBackstory;
    }

    public String getCharAdditionalFeaturesTraits() {
        return charAdditionalFeaturesTraits;
    }

    public void setCharAdditionalFeaturesTraits(String charAdditionalFeaturesTraits) {
        this.charAdditionalFeaturesTraits = charAdditionalFeaturesTraits;
    }

    public String getTreasure() {
        return Treasure;
    }

    public void setTreasure(String treasure) {
        Treasure = treasure;
    }
}
