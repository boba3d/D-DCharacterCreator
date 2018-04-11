package DDCharacterCreator;

import java.io.Serializable;
import java.util.ArrayList;

// getters and setters for character specific selected spells and number of spell slots, enums containing the spells
// lists and which classes can use them, methods to extract spell lists depending on the character's class,
// and methods to determine number of spells based on character's class and level

// Note: this means a character's CLASS and LEVEL must be selected first
public class
CharacterSpells extends Character implements Serializable {

    // Initialized with random values for testing purposes
    // to print out the array:
    //  System.out.println(Arrays.toString(mycharacter.getCharSpells().getCantrips())) (or getFirstSpells etc.);
    // to populate a list/drop down menu/whatever with spells for a character to select from (based on class) use:
    // getCantripsList(mycharacter)/getFirstSpellsList(mycharacter)/etc.
    private Cantrips[] cantrips = new Cantrips[]{Cantrips.ACIDSPLASH, Cantrips.BLADEWARD, Cantrips.CHILLTOUCH, Cantrips.DRUIDCRAFT};
    private FirstSpells[] firstSpells = new FirstSpells[] {FirstSpells.ALARM, FirstSpells.BANE, FirstSpells.BLESS, FirstSpells.ARMSOFHADAR};
    private SecondSpells[] secondSpells = new SecondSpells[] {SecondSpells.AID, SecondSpells.AUGURY, SecondSpells.BARKSKIN, SecondSpells.BLUR};
    private ThirdSpells[] thirdSpells = new ThirdSpells[] {ThirdSpells.BLINK, ThirdSpells.BESTOWCURSE, ThirdSpells.AURAOFVITALITY, ThirdSpells.CALLLIGHTNING};
    private FourthSpells[] fourthSpells = new FourthSpells[] {FourthSpells.AURAOFLIFE, FourthSpells.BLIGHT, FourthSpells.CONJUREMINORELEMENTALS, FourthSpells.CONTROLWATER};
    private FifthSpells[] fifthSpells = new FifthSpells[] {FifthSpells.AWAKEN, FifthSpells.COMMUNE, FifthSpells.DISPELEVILANDGOOD, FifthSpells.ANIMATEOBJECTS};
    private SixthSpells[] sixthSpells = new SixthSpells[] {SixthSpells.DRAWMIJSINSTANTSUMMONS, SixthSpells.GLOBEOFINVULNERABILITY, SixthSpells.ARCANEGATE, SixthSpells.CIRCLEOFDEATH};
    private SeventhSpells[] seventhSpells = new SeventhSpells[] {SeventhSpells.MORDENKAINENSMAGNIFICENTMANSION, SeventhSpells.SIMULACRUM, SeventhSpells.FINGEROFDEATH, SeventhSpells.DELAYEDBLASTFIREBALL};
    private EighthSpells[] eighthSpells = new EighthSpells[] {EighthSpells.ANIMALSHAPES, EighthSpells.TELEPATHY, EighthSpells.ANTIPATHYSYMPATHY, EighthSpells.INCENDIARYCLOUD};
    private NinthSpells[] ninthSpells = new NinthSpells[] {NinthSpells.ASTRALPROJECTION, NinthSpells.TRUERESURRECTION};

    // values initialized for testing
    private int numberOfCantrips = 4;
    private int numberOfFirstSpells = 4;
    private int numberOfSecondSpells = 4;
    private int numberOfThirdSpells = 4;
    private int numberOfFourthSpells = 4;
    private int numberOfFifthSpells = 4;
    private int numberOfSixthSpells = 4;
    private int numberOfSeventhSpells = 4;
    private int numberOfEighthSpells = 4;
    private int numberOfNinthSpells = 2;

    public Cantrips[] getCantrips() {return cantrips;}

    public void setCantrips(Cantrips[] cantrips) {this.cantrips = cantrips;}

    public FirstSpells[] getFirstSpells() {return firstSpells;}

    public void setFirstSpells(FirstSpells[] firstSpells) {this.firstSpells = firstSpells;}

    public SecondSpells[] getSecondSpells() {return secondSpells;}

    public void setSecondSpells(SecondSpells[] secondSpells) {this.secondSpells = secondSpells;}

    public ThirdSpells[] getThirdSpells() {return thirdSpells;}

    public void setThirdSpells(ThirdSpells[] thirdSpells) {this.thirdSpells = thirdSpells;}

    public FourthSpells[] getFourthSpells() {return fourthSpells;}

    public void setFourthSpells(FourthSpells[] fourthSpells) {this.fourthSpells = fourthSpells;}

    public FifthSpells[] getFifthSpells() {return fifthSpells;}

    public void setFifthSpells(FifthSpells[] fifthSpells) {this.fifthSpells = fifthSpells;}

    public SixthSpells[] getSixthSpells() {return sixthSpells;}

    public void setSixthSpells(SixthSpells[] sixthSpells) {this.sixthSpells = sixthSpells;}

    public SeventhSpells[] getSeventhSpells() {return seventhSpells;}

    public void setSeventhSpells(SeventhSpells[] seventhSpells) {this.seventhSpells = seventhSpells;}

    public EighthSpells[] getEighthSpells() {return eighthSpells;}

    public void setEighthSpells(EighthSpells[] eighthSpells) {this.eighthSpells = eighthSpells;}

    public NinthSpells[] getNinthSpells() {return ninthSpells;}

    public void setNinthSpells(NinthSpells[] ninthSpells) {this.ninthSpells = ninthSpells;}

    public int getNumberOfCantrips() {return numberOfCantrips;}

    public void setNumberOfCantrips(int numberOfCantrips) {this.numberOfCantrips = numberOfCantrips;}

    public int getNumberOfFirstSpells() {return numberOfFirstSpells;}

    public void setNumberOfFirstSpells(int numberOfFirstSpells) {this.numberOfFirstSpells = numberOfFirstSpells;}

    public int getNumberOfSecondSpells() {return numberOfSecondSpells;}

    public void setNumberOfSecondSpells(int numberOfSecondSpells) {this.numberOfSecondSpells = numberOfSecondSpells;}

    public int getNumberOfThirdSpells() {return numberOfThirdSpells;}

    public void setNumberOfThirdSpells(int numberOfThirdSpells) {this.numberOfThirdSpells = numberOfThirdSpells;}

    public int getNumberOfFourthSpells() {return numberOfFourthSpells;}

    public void setNumberOfFourthSpells(int numberOfFourthSpells) {this.numberOfFourthSpells = numberOfFourthSpells;}

    public int getNumberOfFifthSpells() {return numberOfFifthSpells;}

    public void setNumberOfFifthSpells(int numberOfFifthSpells) {this.numberOfFifthSpells = numberOfFifthSpells;}

    public int getNumberOfSixthSpells() {return numberOfSixthSpells;}

    public void setNumberOfSixthSpells(int numberOfSixthSpells) {this.numberOfSixthSpells = numberOfSixthSpells;}

    public int getNumberOfSeventhSpells() {return numberOfSeventhSpells;}

    public void setNumberOfSeventhSpells(int numberOfSeventhSpells) {this.numberOfSeventhSpells = numberOfSeventhSpells;}

    public int getNumberOfEighthSpells() {return numberOfEighthSpells;}

    public void setNumberOfEighthSpells(int numberOfEighthSpells) {this.numberOfEighthSpells = numberOfEighthSpells;}

    public int getNumberOfNinthSpells() {return numberOfNinthSpells;}

    public void setNumberOfNinthSpells(int numberOfNinthSpells) {this.numberOfNinthSpells = numberOfNinthSpells;}

    // List of cantrips and which classes can get them
    public enum Cantrips {
        ACIDSPLASH("Acid Splash", "Sorcerer", "Wizard"),
        BLADEWARD("Blade Ward", "Bard", "Sorcerer", "Warlock", "Wizard"),
        CHILLTOUCH("Chill Touch", "Sorcerer", "Warlock", "Wizard"),
        DANCINGLIGHTS("Dancing Lights", "Bard", "Sorcerer", "Wizard"),
        DRUIDCRAFT("Druidcraft", "Druid"),
        ELDRITCHBLAST("Eldritch Blast", "Warlock"),
        FIREBOLT("Fire Bolt", "Sorcerer", "Wizard"),
        FRIENDS("Friends", "Bard", "Sorcerer", "Warlock", "Wizard"),
        GUIDANCE("Guidance", "Cleric", "Druid"),
        LIGHT("Light", "Bard", "Cleric", "Sorcerer", "Wizard"),
        MAGEHAND("Mage Hand", "Bard", "Sorcerer", "Warlock", "Wizard"),
        MENDING("Mending", "Bard", "Cleric", "Druid", "Sorcerer", "Wizard"),
        MESSAGE("Message", "Bard", "Sorcerer", "Wizard"),
        MINORILLUSION("Minor Illusion", "Bard", "Sorcerer", "Warlock", "Wizard"),
        POISONSPRAY("Poison Spray", "Druid", "Sorcerer", "Warlock", "Wizard"),
        PRESTIDIGITATION("Prestidigitation", "Bard", "Sorcerer", "Warlock", "Wizard"),
        PRODUCEFLAME("Produce Flame", "Druid"),
        RAYOFFROST("Ray of Frost", "Sorcerer", "Wizard"),
        RESISTANCE("Resistance", "Cleric", "Druid"),
        SACREDFLAME("Sacred Flame", "Cleric"),
        SHILLELAGH("Shillelagh", "Druid"),
        SHOCKINGGRASP("Shocking Grasp", "Sorcerer", "Wizard"),
        SPARETHEDYING("Spare the Dying", "Cleric"),
        THAUMATURGY("Thaumaturgy", "Cleric"),
        THORNWHIP("Thorn Whip", "Druid"),
        TRUESTRIKE("True Strike", "Bard", "Sorcerer", "Warlock", "Wizard"),
        VICIOUSMOCKERY("Vicious Mockery", "Bard");

        private final String sCantrips;
        private String[] sClasses;

        // sCantrips is the toString name of the cantrip and sClasses is the array of class names as strings
        Cantrips(String sCantrips, String... sClasses) {
            this.sCantrips = sCantrips;
            this.sClasses = sClasses;
        }

        public String toString() {return sCantrips;}
        public String[] getClassCantrips() {return sClasses;}
    }

    // List of first level spells and what classes can get them
    public enum FirstSpells {
        ALARM("Alarm", "Ranger", "Wizard"),
        ANIMALFRIENDSHIP("Animal Friendship", "Bard", "Druid", "Ranger"),
        ARMOROFAGATHYS("Armor of Agathys", "Warlock"),
        ARMSOFHADAR("Arms of Hadar", "Warlock"),
        BANE("Bane", "Bard", "Cleric"),
        BLESS("Bless", "Cleric", "Paladin"),
        BURNINGHANDS("Burning Hands", "Sorcerer", "Wizard"),
        CHARMPERSON("Charm Person", "Bard", "Druid", "Sorcerer", "Warlock", "Wizard"),
        CHROMATICORB("Chromatic Orb", "Sorcerer", "Wizard"),
        COLORSPRAY("Color Spray", "Sorcerer", "Wizard"),
        COMMAND("Command", "Cleric", "Paladin"),
        COMPELLEDDUEL("Compelled Duel", "Paladin"),
        COMPREHENDLANGUAGES("Comprehend Languages", "Bard", "Sorcerer", "Warlock", "Wizard"),
        CREATEORDESTROYWATER("Create or Destroy Water", "Cleric", "Druid"),
        CUREWOUNDS("Cure Wounds", "Bard", "Cleric", "Druid", "Paladin", "Ranger"),
        DETECTEVILANDGOOD("Detect Evil and Good", "Cleric", "Paladin"),
        DETECTMAGIC("Detect Magic", "Bard", "Cleric", "Druid", "Paladin", "Ranger", "Sorcerer", "Wizard"),
        DETECTPOISONANDDISEASE("Detect Poison and Disease", "Cleric", "Druid", "Paladin", "Ranger"),
        DISGUISESELF("Disguise Self", "Bard", "Sorcerer", "Wizard"),
        DISSONANTWHISPERS("Dissonant Whispers", "Bard"),
        DIVINEFAVOR("Divine Favor", "Paladin"),
        ENSNARINGSTRIKE("Ensnaring Strike", "Ranger"),
        ENTANGLE("Entangle", "Druid"),
        EXPEDITIOUSRETREAT("Expeditious Retreat", "Sorcerer", "Warlock", "Wizard"),
        FAERIEFIRE("Faerie Fire", "Bard", "Druid"),
        FALSELIFE("False Life", "Sorcerer", "Wizard"),
        FEATHERFALL("Feather Fall", "Bard", "Sorcerer", "Wizard"),
        FINDFAMILIAR("Find Familiar", "Wizard"),
        FOGCLOUD("Fog Cloud", "Druid", "Ranger", "Sorcerer", "Wizard"),
        GOODBERRY("Goodberry", "Druid", "Ranger"),
        GREASE("Grease", "Wizard"),
        GUIDINGBOLT("Guiding Bolt", "Cleric"),
        HAILOFTHORNS("Hail of Thorns", "Ranger"),
        HEALINGWORD("Healing Word", "Bard", "Cleric", "Druid"),
        HELLISHREBUKE("Hellish Rebuke", "Warlock"),
        HEROISM("Heroism", "Bard", "Paladin"),
        HEX("Hex", "Warlock"),
        HUNTERSMARK("Hunter's Mark", "Ranger"),
        IDENTIFY("Identify", "Bard", "Wizard"),
        ILLUSORYSCRIPT("Illusory Script", "Bard", "Warlock", "Wizard"),
        INFLICTWOUNDS("Inflict Wounds", "Cleric"),
        JUMP("Jump", "Druid", "Ranger", "Sorcerer", "Wizard"),
        LONGSTRIDER("Longstrider", "Bard", "Druid", "Ranger", "Wizard"),
        MAGEARMOR("Mage Armor", "Sorcerer", "Wizard"),
        MAGICMISSILE("Magic Missile", "Sorcerer", "Wizard"),
        PROTECTIONFROMEVILANDGOOD("Protection from Evil and Good", "Cleric", "Paladin", "Warlock", "Wizard"),
        PURIFYFOODANDDRINK("Purify Food and Drink", "Cleric", "Druid", "Paladin"),
        RAYOFSICKNESS("Ray of Sickness", "Sorcerer", "Wizard"),
        SANCTUARY("Sanctuary", "Cleric"),
        SEARINGSMITE("Searing Smite", "Paladin"),
        SHIELD("Shield", "Sorcerer", "Wizard"),
        SHIELDOFFAITH("Shield of Faith", "Cleric", "Paladin"),
        SILENTIMAGE("Silent Image", "Bard", "Sorcerer", "Wizard"),
        SLEEP("Sleep", "Bard", "Sorcerer", "Wizard"),
        SPEAKWITHANIMALS("Speak with Animals", "Bard", "Druid", "Ranger"),
        TASHASHIDEOUSLAUGHTER("Tasha's Hideous Laughter", "Bard", "Wizard"),
        TENSERSFLOATINGDISK("Tenser's Floating Disk", "Wizard"),
        THUNDEROUSSMITE("Thunderous Smite", "Paladin"),
        THUNDERWAVE("Thunderwave", "Bard", "Druid", "Sorcerer", "Wizard"),
        UNSEENSERVANT("Unseen Servant", "Bard", "Warlock", "Wizard"),
        WITCHBOLT("Witch Bolt", "Sorcerer", "Warlock", "Wizard"),
        WRATHFULSMITE("Wrathful Smite", "Paladin");

        private final String sFirstSpells;
        private String[] sFirstSpellClasses;

        // sFirstSpells is the toString name of the spell and sFirstSpellClasses is the array of class names as strings
        FirstSpells(String sFirstSpells, String... sFirstSpellClasses) {
            this.sFirstSpells = sFirstSpells;
            this.sFirstSpellClasses = sFirstSpellClasses;
        }

        public String toString() {return sFirstSpells;}
        public String[] getFirstSpellClasses() {return sFirstSpellClasses;}
    }

    // List of second level spells and what classes can get them
    public enum SecondSpells {
        AID("Aid", "Cleric", "Paladin"),
        ALTERSELF("Alter Self", "Sorcerer", "Wizard"),
        ANIMALMESSENGER("Animal Messenger", "Bard", "Druid", "Ranger"),
        ARCANELOCK("Arcane Lock", "Wizard"),
        AUGURY("Augury", "Cleric"),
        BARKSKIN("Barkskin", "Druid", "Ranger"),
        BEASTSENSE("Beast Sense", "Druid", "Ranger"),
        BLINDNESSDEAFNESS("Blindness/Deafness", "Bard", "Cleric", "Sorcerer", "Wizard"),
        BLUR("Blur", "Sorcerer", "Wizard"),
        BRANDINGSMITE("Branding Smite", "Paladin"),
        CALMEMOTIONS("Calm Emotions", "Bard", "Cleric"),
        CLOUDOFDAGGERS("Cloud of Daggers", "Bard", "Sorcerer", "Warlock", "Wizard"),
        CONTINUALFLAME("Continual Flame", "Cleric", "Wizard"),
        CORDONOFARROWS("Cordon of Arrows", "Ranger"),
        CROWNOFMADNESS("Crown of Madness", "Bard", "Sorcerer", "Warlock", "Wizard"),
        DARKNESS("Darkness", "Sorcerer", "Warlock", "Wizard"),
        DARKVISION("Darkvision", "Druid", "Ranger", "Sorcerer", "Wizard"),
        DETECTTHOUGHTS("Detect Thoughts", "Bard", "Sorcerer", "Wizard"),
        ENHANCEABILITY("Enhance Ability", "Bard", "Cleric", "Druid", "Sorcerer"),
        ENLARGEREDUCE("Enlarge/Reduce", "Sorcerer", "Wizard"),
        ENTHRALL("Enthrall", "Bard", "Warlock"),
        FINDSTEED("Find Steed", "Paladin"),
        FINDTRAPS("Find Traps", "Cleric", "Druid", "Ranger"),
        FLAMEBLADE("Flame Blade", "Druid"),
        FLAMINGSPHERE("Flaming Sphere", "Druid", "Wizard"),
        GENTLEREPOSE("Gentle Repose", "Cleric", "Wizard"),
        GUSTOFWIND("Gust of Wind", "Druid", "Sorcerer", "Wizard"),
        HEATMETAL("Heat Metal", "Bard", "Druid"),
        HOLDPERSON("Hold Person", "Bard", "Cleric", "Druid", "Sorcerer", "Warlock", "Wizard"),
        INVISIBILITY("Invisibility", "Bard", "Sorcerer", "Warlock", "Wizard"),
        KNOCK("Knock", "Bard", "Sorcerer", "Wizard"),
        LESSERRESTORATION("Lesser Restoration", "Bard", "Cleric", "Druid", "Paladin", "Ranger"),
        LEVITATE("Levitate", "Sorcerer", "Wizard"),
        LOCATEANIMALSORPLANTS("Locate Animals or Plants", "Bard", "Druid", "Ranger"),
        LOCATEOBJECT("Locate Object", "Bard", "Cleric", "Druid", "Paladin", "Ranger", "Wizard"),
        MAGICMOUTH("Magic Mouth", "Bard", "Wizard"),
        MAGICWEAPON("Magic Weapon", "Paladin", "Wizard"),
        MELFSACIDARROW("Melf's Acid Arrow", "Wizard"),
        MIRRORIMAGE("Mirror Image", "Sorcerer", "Warlock", "Wizard"),
        MISTYSTEP("Misty Step", "Sorcerer", "Warlock", "Wizard"),
        MOONBEAM("Moonbeam", "Druid"),
        NYSTULSMAGICAURA("Nystul's Magic Aura", "Wizard"),
        PASSWITHOUTTRACE("Pass without Trace", "Druid", "Ranger"),
        PHANTASMALFORCE("Phantasmal Force", "Bard", "Sorcerer", "Wizard"),
        PRAYEROFHEALING("Prayer of Healing", "Cleric"),
        PROTECTIONFROMPOISON("Protection from Poison", "Cleric", "Druid", "Paladin", "Ranger"),
        RAYOFENFEEBLEMENT("Ray of Enfeeblement", "Warlock", "Wizard"),
        ROPETRICK("Rope Trick", "Wizard"),
        SCORCHINGRAY("Scorching Ray", "Sorcerer", "Wizard"),
        SEEINVISIBILITY("See Invisibility", "Bard", "Sorcerer", "Wizard"),
        SHATTER("Shatter", "Bard", "Sorcerer", "Warlock", "Wizard"),
        SILENCE("Silence", "Bard", "Cleric", "Ranger"),
        SPIDERCLIMB("Spider Climb", "Sorcerer", "Warlock", "Wizard"),
        SPIKEGROWTH("Spike Growth", "Druid", "Ranger"),
        SPIRITUALWEAPON("Spiritual Weapon", "Cleric"),
        SUGGESTION("Suggestion", "Bard", "Sorcerer", "Warlock", "Wizard"),
        WARDINGBOND("Warding Bond", "Cleric"),
        WEB("Web", "Sorcerer", "Wizard"),
        ZONEOFTRUTH("Zone of Truth", "Bard", "Cleric", "Paladin");

        private final String sSecondSpells;
        private String[] sSecondSpellClasses;

        // sSecondSpells is the toString name of the spell and sSecondSpellClasses is the array of class names as strings
        SecondSpells(String sSecondSpells, String... sSecondSpellClasses) {
            this.sSecondSpells = sSecondSpells;
            this.sSecondSpellClasses = sSecondSpellClasses;
        }

        public String toString() {return sSecondSpells;}
        public String[] getSecondSpellClasses() {return sSecondSpellClasses;}
    }

    // List of third level spells and what classes can get them
    public enum ThirdSpells {
        ANIMATEDEAD("Animate Dead", "Cleric", "Wizard"),
        AURAOFVITALITY("Aura of Vitality", "Paladin"),
        BEACONOFHOPE("Beacon of Hope", "Cleric"),
        BESTOWCURSE("Bestow Curse", "Bard", "Cleric", "Wizard"),
        BLINDINGSMITE("Blinding Smite", "Paladin"),
        BLINK("Blink", "Sorcerer", "Wizard"),
        CALLLIGHTNING("Call Lightning", "Druid"),
        CLAIRVOYANCE("Clairvoyance", "Bard", "Cleric", "Sorcerer", "Wizard"),
        CONJUREANIMALS("Conjure Animals", "Druid", "Ranger"),
        CONJUREBARRAGE("Conjure Barrage", "Ranger"),
        COUNTERSPELL("Counterspell", "Sorcerer", "Warlock", "Wizard"),
        CREATEFOODANDWATER("Create Food and Water", "Cleric", "Paladin"),
        CRUSADERSMANTLE("Crusader's Mantle", "Paladin"),
        DAYLIGHT("Daylight", "Cleric", "Druid", "Paladin", "Ranger", "Sorcerer"),
        DISPELMAGIC("Dispel Magic", "Bard", "Cleric", "Druid", "Paladin", "Sorcerer", "Warlock", "Wizard"),
        ELEMENTALWEAPON("Elemental Weapon", "Paladin"),
        FEAR("Fear", "Bard", "Sorcerer", "Warlock", "Wizard"),
        FEIGNDEATH("Feign Death", "Bard", "Cleric", "Druid", "Wizard"),
        FIREBALL("Fireball", "Sorcerer", "Wizard"),
        FLY("Fly", "Sorcerer", "Warlock", "Wizard"),
        GASEOUSFORM("Gaseous Form", "Sorcerer", "Warlock", "Wizard"),
        GLYPHOFWARDING("Glyph of Warding", "Bard", "Cleric", "Wizard"),
        HASTE("Haste", "Sorcerer", "Wizard"),
        HUNGEROFHADAR("Hunger of Hadar", "Warlock"),
        HYPNOTICPATTERN("Hypnotic Pattern", "Bard", "Sorcerer", "Warlock", "Wizard"),
        LEOMUNDSTINYHUT("Leomund's Tiny Hut", "Bard", "Wizard"),
        LIGHTNINGARROW("Lightning Arrow", "Ranger"),
        LIGHTNINGBOLT("Lightning Bolt", "Sorcerer", "Wizard"),
        MAGICCIRCLE("Magic Circle", "Cleric", "Paladin", "Warlock", "Wizard"),
        MAJORIMAGE("Major Image", "Bard", "Sorcerer", "Warlock", "Wizard"),
        MASSHEALINGWORD("Mass Healing Word", "Cleric"),
        MELDINTOSTONE("Meld into Stone", "Cleric", "Druid"),
        NONDETECTION("Nondetection", "Bard", "Ranger", "Wizard"),
        PHANTOMSTEED("Phantom Steed", "Wizard"),
        PLANTGROWTH("Plant Growth", "Bard", "Druid", "Ranger"),
        PROTECTIONFROMENERGY("Protection from Energy", "Cleric", "Druid", "Ranger", "Sorcerer", "Wizard"),
        REMOVECURSE("Remove Curse", "Cleric", "Paladin", "Warlock", "Wizard"),
        REVIVIFY("Revivify", "Cleric", "Paladin"),
        SENDING("Sending", "Bard", "Cleric", "Wizard"),
        SLEETSTORM("Sleet Storm", "Druid", "Sorcerer", "Wizard"),
        SLOW("Slow", "Sorcerer", "Wizard"),
        SPEAKWITHDEAD("Speak with Dead", "Bard", "Cleric"),
        SPEAKWITHPLANTS("Speak with Plants", "Bard", "Druid", "Ranger"),
        SPIRITGUARDIANS("Spirit Guardians", "Cleric"),
        STINKINGCLOUD("Stinking Cloud", "Bard", "Sorcerer", "Wizard"),
        TONGUES("Tongues", "Bard", "Cleric", "Sorcerer", "Warlock", "Wizard"),
        VAMPIRICTOUCH("Vampiric Touch", "Warlock", "Wizard"),
        WATERBREATHING("Water Breathing", "Druid", "Ranger", "Sorcerer", "Wizard"),
        WATERWALK("Water Walk", "Cleric", "Druid", "Ranger", "Sorcerer"),
        WINDWALL("Wind Wall", "Druid", "Ranger");

        private final String sThirdSpells;
        private String[] sThirdSpellClasses;

        // sThirdSpells is the toString name of the spell and sThirdSpellClasses is the array of class names as strings
        ThirdSpells(String sThirdSpells, String... sThirdSpellClasses) {
            this.sThirdSpells = sThirdSpells;
            this.sThirdSpellClasses = sThirdSpellClasses;
        }

        public String toString() {return sThirdSpells;}
        public String[] getThirdSpellClasses() {return sThirdSpellClasses;}
    }

    // List of fourth level spells and what classes can get them
    public enum FourthSpells {
        ARCANEEYE("Arcane Eye", "Wizard"),
        AURAOFLIFE("Aura of Life", "Paladin"),
        AURAOFPURITY("Aura of Purity", "Paladin"),
        BANISHMENT("Banishment", "Cleric", "Paladin", "Sorcerer", "Warlock", "Wizard"),
        BLIGHT("Blight", "Druid", "Sorcerer", "Warlock", "Wizard"),
        COMPULSION("Compulsion", "Bard"),
        CONFUSION("Confusion", "Bard", "Druid", "Sorcerer", "Wizard"),
        CONJUREMINORELEMENTALS("Conjure Minor Elementals", "Druid", "Wizard"),
        CONJUREWOODLANDBEINGS("Conjure Woodland Beings", "Druid", "Ranger"),
        CONTROLWATER("Control Water", "Cleric", "Druid", "Wizard"),
        DEATHWARD("Death Ward", "Cleric", "Paladin"),
        DIMENSIONDOOR("Dimension Door", "Bard", "Sorcerer", "Warlock", "Wizard"),
        DIVINATION("Divination", "Cleric"),
        DOMINATEBEAST("Dominate Beast", "Druid", "Sorcerer"),
        EVARDSBLACKTENTACLES("Evard's Black Tentacles", "Wizard"),
        FABRICATE("Fabricate", "Wizard"),
        FIRESHIELD("Fire Shield", "Wizard"),
        FREEDOMOFMOVEMENT("Freedom of Movement", "Bard", "Cleric", "Druid", "Ranger"),
        GIANTINSECT("Giant Insect", "Druid"),
        GRASPINGVINE("Grasping Vine", "Druid", "Ranger"),
        GREATERINVISIBILITY("Greater Invisibility", "Bard", "Sorcerer", "Wizard"),
        GUARDIANOFFAITH("Guardian of Faith", "Cleric"),
        HALLUCINATORYTERRAIN("Hallucinatory Terrain", "Bard", "Druid", "Warlock", "Wizard"),
        ICESTORM("Ice Storm", "Druid", "Sorcerer", "Wizard"),
        LEOMUNDSSECRETCHEST("Leomund's Secret Chest", "Wizard"),
        LOCATECREATURE("Locate Creature", "Bard", "Cleric", "Druid", "Paladin", "Ranger", "Wizard"),
        MORDENKAINENSFAITHFULHOUD("Mordenkainen's Faithful Hound", "Wizard"),
        MORDENKAINENSPRIVATESANCTUM("Mordenkainen's Private Sanctum", "Wizard"),
        OTILUKESRESILIENTSPHERE("Otiluke's Resilient Sphere", "Wizard"),
        PHANTASMALKILLER("Phantasmal Killer", "Wizard"),
        POLYMORPH("Polymorph", "Bard", "Druid", "Sorcerer", "Wizard"),
        STAGGERINGSMITE("Staggering Smite", "Paladin"),
        STONESHAPE("Stone Shape", "Cleric", "Druid", "Wizard"),
        STONESKIN("Stoneskin", "Druid", "Ranger", "Sorcerer", "Wizard"),
        WALLOFFIRE("Wall of Fire", "Druid", "Sorcerer", "Wizard");

        private final String sFourthSpells;
        private String[] sFourthSpellClasses;

        // sFourthSpells is the toString name of the spell and sFourthSpellClasses is the array of class names as strings
        FourthSpells(String sFourthSpells, String... sFourthSpellClasses) {
            this.sFourthSpells = sFourthSpells;
            this.sFourthSpellClasses = sFourthSpellClasses;
        }

        public String toString() {return sFourthSpells;}
        public String[] getFourthSpellClasses() {return sFourthSpellClasses;}
    }

    // List of fifth level spells and what classes can get them
    public enum FifthSpells {
        ANIMATEOBJECTS("Animate Objects", "Bard", "Sorcerer", "Wizard"),
        ANTILIFESHELL("Antilife Shell", "Druid"),
        AWAKEN("Awaken", "Bard", "Druid"),
        BANISHINGSMITE("Banishing Smite", "Paladin"),
        BIGBYSHAND("Bigby's Hand", "Wizard"),
        CIRCLEOFPOWER("Circle of Power", "Paladin"),
        CLOUDKILL("Cloudkill", "Sorcerer", "Wizard"),
        COMMUNE("Commune", "Cleric"),
        COMMUNEWITHNATURE("Commune with Nature", "Druid", "Ranger"),
        CONEOFCOLD("Cone of Cold", "Sorcerer", "Wizard"),
        CONJUREELEMENTAL("Conjure Elemental", "Druid", "Wizard"),
        CONJUREVOLLEY("Conjure Volley", "Ranger"),
        CONTACTOTHERPLANE("Contact Other Plane", "Warlock", "Wizard"),
        CONTAGION("Contagion", "Cleric", "Druid"),
        CREATION("Creation", "Sorcerer", "Wizard"),
        DESTRUCTIVESMITE("Destructive Smite", "Paladin"),
        DISPELEVILANDGOOD("Dispel Evil and Good", "Cleric", "Paladin"),
        DOMINATEPERSON("Dominate Person", "Bard", "Sorcerer", "Wizard"),
        DREAM("Dream", "Bard", "Warlock", "Wizard"),
        FLAMESTRIKE("Flame Strike", "Cleric"),
        GEAS("Geas", "Bard", "Cleric", "Druid", "Paladin", "Wizard"),
        GREATERRESTORATION("Greater Restoration", "Bard", "Cleric", "Druid"),
        HALLOW("Hallow", "Cleric"),
        HOLDMONSTER("Hold Monster", "Bard", "Sorcerer", "Warlock", "Wizard"),
        INSECTPLAGUE("Insect Plague", "Cleric", "Druid", "Sorcerer"),
        LEGENDLORE("Legend Lore", "Bard", "Cleric", "Wizard"),
        MASSCUREWOUNDS("Mass Cure Wounds", "Bard", "Cleric", "Druid"),
        MISLEAD("Mislead", "Bard", "Wizard"),
        MODIFYMEMORY("Modify Memory", "Bard", "Wizard"),
        PASSWALL("Passwall", "Wizard"),
        PLANARBINDING("Planar Binding", "Bard", "Cleric", "Druid", "Wizard"),
        RAISEDEAD("Raise Dead", "Bard", "Cleric", "Paladin"),
        RARYSTELEPATHICBOND("Rary's Telepathic Bond", "Wizard"),
        REINCARNATE("Reincarnate", "Druid"),
        SCRYING("Scrying", "Bard", "Cleric", "Druid", "Warlock", "Wizard"),
        SEEMING("Seeming", "Bard", "Sorcerer", "Wizard"),
        SWIFTQUIVER("Swift Quiver", "Ranger"),
        TELEKINESIS("Telekinesis", "Sorcerer", "Wizard"),
        TELEPORTATIONCIRCLE("Teleportation Circle", "Bard", "Sorcerer", "Wizard"),
        TREESTRIDE("Tree Stride", "Druid", "Ranger"),
        WALLOFFORCE("Wall of Force", "Wizard"),
        WALLOFSTONE("Wall of Stone", "Druid", "Sorcerer");

        private final String sFifthSpells;
        private String[] sFifthSpellClasses;

        // sFifthSpells is the toString name of the spell and sFifthSpellClasses is the array of class names as strings
        FifthSpells(String sFifthSpells, String... sFifthSpellClasses) {
            this.sFifthSpells = sFifthSpells;
            this.sFifthSpellClasses = sFifthSpellClasses;
        }

        public String toString() {return sFifthSpells;}
        public String[] getFifthSpellClasses() {return sFifthSpellClasses;}
    }

    // List of sixth level spells and what classes can get them
    public enum SixthSpells {
        ARCANEGATE("Arcane Gate", "Sorcerer", "Warlock", "Wizard"),
        BLADEBARRIER("Blade Barrier", "Cleric"),
        CHAINLIGHTNING("Chain Lightning", "Sorcerer", "Wizard"),
        CIRCLEOFDEATH("Circle of Death", "Sorcerer", "Warlock", "Wizard"),
        CONJUREFEY("Conjure Fey", "Druid", "Warlock"),
        CONTINGENCY("Contingency", "Wizard"),
        CREATEUNDEAD("Create Undead", "Cleric", "Warlock", "Wizard"),
        DISINTEGRATE("Disintegrate", "Sorcerer", "Wizard"),
        DRAWMIJSINSTANTSUMMONS("Drawmij's Instant Summons", "Wizard"),
        EYEBITE("Eyebite", "Bard", "Sorcerer", "Warlock", "Wizard"),
        FINDTHEPATH("Find the Path", "Bard", "Cleric", "Druid"),
        FLESHTOSTONE("Flesh to Stone", "Warlock", "Wizard"),
        FORBIDDANCE("Forbiddance", "Cleric"),
        GLOBEOFINVULNERABILITY("Globe of Invulnerability", "Sorcerer", "Wizard"),
        GUARDSANDWARDS("Guards and Wards", "Bard", "Wizard"),
        HARM("Harm", "Cleric"),
        HEAL("Heal", "Cleric", "Druid"),
        HEROESFEAST("Heroes' Feast", "Cleric", "Druid"),
        MAGICJAR("Magic Jar", "Wizard"),
        MASSSUGGESTION("Mass Suggestion", "Bard", "Sorcerer", "Warlock", "Wizard"),
        MOVEEARTH("Move Earth", "Druid", "Sorcerer", "Wizard"),
        OTILUKESFREEZINGSPHERE("Otiluke's Freezing Sphere", "Wizard"),
        OTTOSIRRESISTIBLEDANCE("Otto's Irresistible Dance", "Bard", "Wizard"),
        PLANARALLY("Planar Ally", "Cleric"),
        PROGRAMMEDILLUSION("Programmed Illusion", "Bard", "Wizard"),
        SUNBEAM("Sunbeam", "Druid", "Sorcerer", "Wizard"),
        TRANSPORTVIAPLANTS("Transport via Plants", "Druid"),
        TRUESEEING("True Seeing", "Bard", "Cleric", "Sorcerer", "Warlock", "Wizard"),
        WALLOFICE("Wall of Ice", "Wizard"),
        WALLOFTHORNS("Wall of Thorns", "Druid"),
        WINDWALK("Wind Walk", "Druid"),
        WORDOFRECALL("Word of Recall", "Cleric");

        private final String sSixthSpells;
        private String[] sSixthSpellClasses;

        // sSixthSpells is the toString name of the spell and sSixthSpellClasses is the array of class names as strings
        SixthSpells(String sSixthSpells, String... sSixthSpellClasses) {
            this.sSixthSpells = sSixthSpells;
            this.sSixthSpellClasses = sSixthSpellClasses;
        }

        public String toString() {return sSixthSpells;}
        public String[] getSixthSpellClasses() {return sSixthSpellClasses;}
    }

    // List of seventh level spells and what classes can get them
    public enum SeventhSpells {
        CONJURECELESTIAL("Conjure Celestial", "Cleric"),
        DELAYEDBLASTFIREBALL("Delayed Blast Fireball", "Sorcerer", "Wizard"),
        DIVINEWORD("Divine Word", "Cleric"),
        ETHEREALNESS("Etherealness", "Bard", "Cleric", "Sorcerer", "Warlock", "Wizard"),
        FINGEROFDEATH("Finger of Death", "Sorcerer", "Warlock", "Wizard"),
        FIRESTORM("Fire Storm", "Cleric", "Druid", "Sorcerer"),
        FORCECAGE("Forcecage", "Bard", "Warlock", "Wizard"),
        MIRAGEARCANE("Mirage Arcane", "Bard", "Druid", "Wizard"),
        MORDENKAINENSMAGNIFICENTMANSION("Mordenkainen's Magnificent Mansion", "Bard", "Wizard"),
        MORDENKAINENSSWORD("Mordenkainen's Sword", "Bard", "Wizard"),
        PLANESHIFT("Plane Shift", "Cleric", "Druid", "Sorcerer", "Warlock", "Wizard"),
        PRISMATICSPRAY("Prismatic Spray", "Sorcerer", "Wizard"),
        PROJECTIMAGE("Project Image", "Bard", "Wizard"),
        REGENERATE("Regenerate", "Bard", "Cleric", "Druid"),
        RESURRECTION("Resurrection", "Bard", "Cleric"),
        REVERSEGRAVITY("Reverse Gravity", "Druid", "Sorcerer", "Wizard"),
        SEQUESTER("Sequester", "Wizard"),
        SIMULACRUM("Simulacrum", "Wizard"),
        SYMBOL("Symbol", "Bard", "Cleric", "Wizard"),
        TELEPORT("Teleport", "Bard", "Sorcerer", "Wizard");

        private final String sSeventhSpells;
        private String[] sSeventhSpellClasses;

        // sSeventhSpells is the toString name of the spell and sSeventhSpellClasses is the array of class names as strings
        SeventhSpells(String sSeventhSpells, String... sSeventhSpellClasses) {
            this.sSeventhSpells = sSeventhSpells;
            this.sSeventhSpellClasses = sSeventhSpellClasses;
        }

        public String toString() {return sSeventhSpells;}
        public String[] getSeventhSpellClasses() {return sSeventhSpellClasses;}
    }

    // List of eighth level spells and what classes can get them
    public enum EighthSpells {
        ANIMALSHAPES("Animal Shapes", "Druid"),
        ANTIMAGICFIELD("Antimagic Field", "Cleric", "Wizard"),
        ANTIPATHYSYMPATHY("Antipathy/Sympathy", "Druid", "Wizard"),
        CLONE("Clone", "Wizard"),
        CONTROLWEATHER("Control Weather", "Cleric", "Druid", "Wizard"),
        DEMIPLANE("Demiplane", "Warlock", "Wizard"),
        DOMINATEMONSTER("Dominate Monster", "Bard", "Sorcerer", "Warlock", "Wizard"),
        EARTHQUAKE("Earthquake", "Cleric", "Druid", "Sorcerer"),
        FEEBLEMIND("Feeblemind", "Bard", "Druid", "Warlock", "Wizard"),
        GLIBNESS("Glibness", "Bard", "Warlock"),
        HOLYAURA("Holy Aura", "Cleric"),
        INCENDIARYCLOUD("Incendiary Cloud", "Sorcerer", "Wizard"),
        MAZE("Maze", "Wizard"),
        MINDBLANK("Mind Blank", "Bard", "Wizard"),
        POWERWORDSTUN("Power Word Stun", "Bard", "Sorcerer", "Warlock", "Wizard"),
        SUNBURST("Sunburst", "Druid", "Sorcerer", "Wizard"),
        TELEPATHY("Telepathy", "Wizard"),
        TRAPTHESOUL("Trap the Soul", "Wizard"),
        TSUNAMI("Tsunami", "Druid");

        private final String sEighthSpells;
        private String[] sEighthSpellClasses;

        // sEighthSpells is the toString name of the spell and sEighthSpellClasses is the array of class names as strings
        EighthSpells(String sEighthSpells, String... sEighthSpellClasses) {
            this.sEighthSpells = sEighthSpells;
            this.sEighthSpellClasses = sEighthSpellClasses;
        }

        public String toString() {return sEighthSpells;}
        public String[] getEighthSpellClasses() {return sEighthSpellClasses;}
    }

    // List of ninth level spells and which classes can get them
    public enum NinthSpells {
        ASTRALPROJECTION("Astral Projection", "Cleric", "Warlock", "Wizard"),
        FORESIGHT("Foresight", "Bard", "Druid", "Warlock", "Wizard"),
        GATE("Gate", "Cleric", "Sorcerer", "Wizard"),
        IMPRISONMENT("Imprisonment", "Warlock", "Wizard"),
        MASSHEAL("Mass Heal", "Cleric"),
        METEORSWARM("Meteor Swarm", "Sorcerer", "Wizard"),
        POWERWORDHEAL("Power Word Heal", "Bard"),
        POWERWORDKILL("Power Word Kill", "Bard", "Sorcerer", "Warlock", "Wizard"),
        PRISMATICWALL("Prismatic Wall", "Wizard"),
        SHAPECHANGE("Shapechange", "Druid", "Wizard"),
        STORMOFVENGEANCE("Storm of Vengeance", "Druid"),
        TIMESTOP("Time Stop", "Sorcerer", "Wizard"),
        TRUEPOLYMORPH("True Polymorph", "Bard", "Warlock", "Wizard"),
        TRUERESURRECTION("True Resurrection", "Cleric", "Druid"),
        WEIRD("Weird", "Wizard"),
        WISH("Wish", "Sorcerer", "Wizard");

        private final String sNinthSpells;
        private String[] sNinthSpellClasses;

        // sNinthSpells is the toString name of the spell and sNinthSpellClasses is the array of class names as strings
        NinthSpells(String sNinthSpells, String... sNinthSpellClasses) {
            this.sNinthSpells = sNinthSpells;
            this.sNinthSpellClasses = sNinthSpellClasses;
        }

        public String toString() {return sNinthSpells;}
        public String[] getNinthSpellClasses() {return sNinthSpellClasses;}
    }

    /**
     * Gets character's list of cantrip choices
     * Note: A character's class must already be determined
     * @param character
     * @return List of possible cantrips the character can choose from
     */
    public static ArrayList<Cantrips> getCantripsList(Character character) {
        ArrayList<Cantrips> cantrips = new ArrayList<>();
        for (Cantrips c : Cantrips.values()) {
            for (int i = 0; i < c.getClassCantrips().length; i++) {
                if (c.getClassCantrips()[i].equals(character.getCharClass().toString())) {
                    cantrips.add(c);
                }
            }
        }
        return cantrips;
    }

    /**
     * Gets character's list of first level spell choices
     * Note: A character's class must already be determined
     * @param character
     * @return List of possible first level spells the character can choose from
     */
    public static ArrayList<FirstSpells> getFirstSpellsList(Character character) {
        ArrayList<FirstSpells> firstspells = new ArrayList<>();
        for (FirstSpells f : FirstSpells.values()) {
            for (int i = 0; i < f.getFirstSpellClasses().length; i++) {
                if (f.getFirstSpellClasses()[i].equals(character.getCharClass().toString())) {
                    firstspells.add(f);
                }
            }
        }
        return firstspells;
    }

    /**
     * Gets character's list of second level spell choices
     * Note: A character's class must already be determined
     * @param character
     * @return List of possible second level spells the character can choose from
     */
    public static ArrayList<SecondSpells> getSecondSpellsList(Character character) {
        ArrayList<SecondSpells> secondspells = new ArrayList<>();
        for (SecondSpells s : SecondSpells.values()) {
            for (int i = 0; i < s.getSecondSpellClasses().length; i++) {
                if (s.getSecondSpellClasses()[i].equals(character.getCharClass().toString())) {
                    secondspells.add(s);
                }
            }
        }
        return secondspells;
    }

    /**
     * Gets character's list of third level spell choices
     * Note: A character's class must already be determined
     * @param character
     * @return List of possible third level spells the character can choose from
     */
    public static ArrayList<ThirdSpells> getThirdSpellsList(Character character) {
        ArrayList<ThirdSpells> thirdspells = new ArrayList<>();
        for (ThirdSpells t : ThirdSpells.values()) {
            for (int i = 0; i < t.getThirdSpellClasses().length; i++) {
                if (t.getThirdSpellClasses()[i].equals(character.getCharClass().toString())) {
                    thirdspells.add(t);
                }
            }
        }
        return thirdspells;
    }

    public static ArrayList<FourthSpells> getFourthSpellsList(Character character) {
        ArrayList<FourthSpells> fourthspells = new ArrayList<>();
        for (FourthSpells t : FourthSpells.values()) {
            for (int i = 0; i < t.getFourthSpellClasses().length; i++) {
                if (t.getFourthSpellClasses()[i].equals(character.getCharClass().toString())) {
                    fourthspells.add(t);
                }
            }
        }
        return fourthspells;
    }

    public static ArrayList<FifthSpells> getFifthSpellsList(Character character) {
        ArrayList<FifthSpells> fifthspells = new ArrayList<>();
        for (FifthSpells t : FifthSpells.values()) {
            for (int i = 0; i < t.getFifthSpellClasses().length; i++) {
                if (t.getFifthSpellClasses()[i].equals(character.getCharClass().toString())) {
                    fifthspells.add(t);
                }
            }
        }
        return fifthspells;
    }

    public static ArrayList<SixthSpells> getSixthSpellsList(Character character) {
        ArrayList<SixthSpells> sixthspells = new ArrayList<>();
        for (SixthSpells t : SixthSpells.values()) {
            for (int i = 0; i < t.getSixthSpellClasses().length; i++) {
                if (t.getSixthSpellClasses()[i].equals(character.getCharClass().toString())) {
                    sixthspells.add(t);
                }
            }
        }
        return sixthspells;
    }

    public static ArrayList<SeventhSpells> getSeventhSpellsList(Character character) {
        ArrayList<SeventhSpells> seventhspells = new ArrayList<>();
        for (SeventhSpells t : SeventhSpells.values()) {
            for (int i = 0; i < t.getSeventhSpellClasses().length; i++) {
                if (t.getSeventhSpellClasses()[i].equals(character.getCharClass().toString())) {
                    seventhspells.add(t);
                }
            }
        }
        return seventhspells;
    }

    public static ArrayList<EighthSpells> getEighthSpellsList(Character character) {
        ArrayList<EighthSpells> eighthspells = new ArrayList<>();
        for (EighthSpells t : EighthSpells.values()) {
            for (int i = 0; i < t.getEighthSpellClasses().length; i++) {
                if (t.getEighthSpellClasses()[i].equals(character.getCharClass().toString())) {
                    eighthspells.add(t);
                }
            }
        }
        return eighthspells;
    }

    public static ArrayList<NinthSpells> getNinthSpellsList(Character character) {
        ArrayList<NinthSpells> ninthspells = new ArrayList<>();
        for (NinthSpells t : NinthSpells.values()) {
            for (int i = 0; i < t.getNinthSpellClasses().length; i++) {
                if (t.getNinthSpellClasses()[i].equals(character.getCharClass().toString())) {
                    ninthspells.add(t);
                }
            }
        }
        return ninthspells;
    }

    // Number of cantrip spells by level
    public static int getNumberOfCantrips(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel < 4) {
                    return 2;
                }
                else if (charLevel > 3 && charLevel < 10) {
                    return 3;
                }
                else {
                    return 4;
                }
        }
    }

    public static int getNumberOfFirstSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel < 4) {
                    return 3;
                }

                else if (charLevel > 3 && charLevel < 10) {
                    return 4;
                }

                else {
                    return 5;
                }
        }
    }

    public static int getNumberOfSecondSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel > 3) {
                    return 3;
                }
                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfThirdSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel > 4) {
                    return 3;
                }

                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfFourthSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel > 7) {
                    return 3;
                }
                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfFifthSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            default:
                if (charLevel > 9) {
                    return 3;
                }
                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfSixthSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            case PALADIN:
                return 0;

            case RANGER:
                return 0;

            default:
                if (charLevel > 11) {
                    return 2;
                }
                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfSeventhSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            case PALADIN:
                return 0;

            case RANGER:
                return 0;

            default:
                if (charLevel > 13) {
                    return 1;
                }

                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfEighthSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            case PALADIN:
                return 0;

            case RANGER:
                return 0;

            default:
                if (charLevel > 15) {
                    return 1;
                }
                else {
                    return 0;
                }
        }
    }

    public static int getNumberOfNinthSpells(Character character) {
        int charLevel = character.getCharLevel();
        Enum.Class charClass = character.getCharClass();

        switch (charClass) {
            case BARBARIAN:
                return 0;

            case FIGHTER:
                return 0;

            case MONK:
                return 0;

            case ROGUE:
                return 0;

            case PALADIN:
                return 0;

            case RANGER:
                return 0;

            default:
                if (charLevel > 17) {
                    return 1;
                }
                else {
                    return 0;
                }
        }
    }
}
