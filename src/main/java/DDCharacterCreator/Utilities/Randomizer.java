package DDCharacterCreator.Utilities;

import java.util.Arrays;
import java.util.Random;
import DDCharacterCreator.Enum;
import DDCharacterCreator.Dice;
import DDCharacterCreator.Character;

/**
 * A class used to randomly generate character sheet values.
 * The class contains a static Random instance. Its seed can be modified
 * using randomize(Integer, Integer, Long) or by calling setSeed().
 */
public class Randomizer {

    final private static double K = 100.00;
    private static long seed = System.nanoTime();
    private static Random random;
    private static Dice dice = new Dice();

    /**
     * Initializes random with a given seed.
     *
     * @param seed The seed used for random generation.
     */
    private static void initializeRandom(long seed) {
        Randomizer.seed = seed;
        random = new Random(Randomizer.seed);
        dice = new Dice(seed + 1 );
    }


    private static void initializeRandom(){
        if(seed == 0){
            random = new Random();
            dice = new Dice();
        }
        else{
            random = new Random(seed);
            dice = new Dice(seed);
        }
    }

    /**
     * Returns a random double in the inclusive range of [min, max].
     * <p>
     * The input for both min and max, right of the decimal, is
     * assumed to be only to the hundredths place.
     * (i.e. 0.00 is acceptable, for input 0.001, the 1 in the
     * thousandths place is ignored)
     *
     * @param min The minimum double value.
     * @param max The maximum double value.
     * @return Random double in the inclusive range of [min, max].
     */
    public static double randomize(double min, double max) {
        return randomize(min, max, System.nanoTime());
    }

    /**
     * Returns a random double in the inclusive range of [min, max],
     * using a given seed.
     * <p>
     * The input for both min and max, right of the decimal, is
     * assumed to be only to the hundredths place.
     * (i.e. 0.00 is acceptable, for input 0.001, the 1 in the
     * thousandths place is ignored)
     *
     * @param min  The minimum double value.
     * @param max  The maximum double value.
     * @param seed The seed used for random generation.
     * @return Random double in the inclusive range of [min, max].
     */
    public static double randomize(double min, double max, long seed) {
        return ((double) randomize((int) (min * K), (int) (max * K), seed)) / K;
    }

    /**
     * Returns a random int in the inclusive range of [min, max].
     *
     * @param min The minimum int value.
     * @param max The maximum int value.
     * @return Random int in the inclusive range of [min, max].
     */
    public static int randomize(int min, int max) {
        if(random == null)
            initializeRandom();
        return randomize(min, max, seed);
    }

    /**
     * Returns a random int in the inclusive range of [0, max].
     * @param max The maximum int value.
     * @return Random int in the range of [0, max].
     */
    public static int randomize(int max) { return randomize(0, max); }

    /**
     * Returns a random int in the inclusive range of [min, max],
     * using a given seed.
     *
     * @param min  The minimum int value.
     * @param max  The maximum int value.
     * @param seed The new seed used for random generation.
     * @return Random int in the inclusive range of [min, max].
     */
    public static int randomize(int min, int max, long seed) {
        if (min > max)
            throw new IllegalArgumentException("Max must be at least min!");

        if(random == null || seed != Randomizer.seed)
            initializeRandom(seed);

        return random.nextInt(max - min + 1) + min;
    }

    /* GETTERS */

    public static long getSeed() {
        return seed;
    }

    public static void setSeed(long value) { initializeRandom(value); }
    public static void setSeed() { initializeRandom(System.nanoTime()); }

    /**
     * @return A random character race.
     */
    public static Enum.Race getCharRace(){
        return Enum.Race.values()[randomize(Enum.Race.values().length - 1)];
    }

    /** TODO
     * @param race The race to base the name off of
     * @return Random name based on race given.
     */
    public static String getCharName(Enum.Race race, Enum.Gender gender){
        boolean male;
        if(gender == Enum.Gender.M || (gender == Enum.Gender.NB && randomize(1) == 0))
            male = true;
        else male = false;

        Object[] values; // the values to choose from

        switch(race){
            case MOUNTAINDWARF: case HILLDWARF:
                if(male) values = Enum.maleDwarfNames.values();
                else values = Enum.femaleDwarfNames.values();
                break;
            case DARKELF: case HIGHELF: case WOODELF:
                if(male) values = Enum.maleElfNames.values();
                else values = Enum.femaleElfNames.values();
                break;
            case STOUTHALFLING:
            case LIGHTFOOTHALFLING:
                if(male) values = Enum.maleHalflingNames.values();
                else values = Enum.femaleHalflingNames.values();
                break;
            case HUMAN:
                if(male) values = Enum.maleHumanNames.values();
                else values = Enum.femaleHumanNames.values();
                break;
            case DRAGONBORN:
                if(male) values = Enum.maleDragonbornNames.values();
                else values = Enum.femaleDragonbornNames.values();
                break;
            case FORESTGNOME: case ROCKGNOME:
                if(male) values = Enum.maleGnomeNames.values();
                else values = Enum.femaleGnomeNames.values();
                break;
            case HALFELF:
                if(male) values = Enum.maleHalfElfNames.values();
                else values = Enum.femaleHalfElfNames.values();
                break;
            case HALFORC:
                if(male) values = Enum.maleHalfOrcNames.values();
                else values = Enum.femaleHalfOrcNames.values();
                break;
            case TIEFLING:
                if(male) values = Enum.maleTieflingNames.values();
                else values = Enum.femaleTieflingNames.values();
                break;
            default: return "Bobby No-name";
        }
        return values[randomize(values.length - 1)].toString();
    }

    /**
     * @return Random character level.
     */
    public static Integer getCharLevel(){
        return randomize(1, 20);
    }

    public static Enum.Background getCharBackground(Enum.Race race, Enum.Class clss) { return null; }

    /**
     * @return A random character class.
     */
    public static Enum.Class getCharClass(){
        return Enum.Class.values()[randomize(Enum.Class.values().length - 1)];
    }

    /**
     * @return A random character alignment.
     */
    public static Enum.Alignment getCharAlignment(){
        return Enum.Alignment.values()[randomize(Enum.Alignment.values().length - 1)];
    }

    /**
     * @return A random gender
     */
    public static Enum.Gender getCharGender(){
        switch(randomize(0, 2)){
            case 0:
                return Enum.Gender.M;
            case 1:
                return Enum.Gender.F;
            default:
                return Enum.Gender.NB;
        }
    }

    /**
     * Generates an ability score for use in strength, dexterity, constitution,
     * intelligence, wisdom, and stamina.
     * Calculated by rolling 4d6 and adding the highest three.
     * @return A random ability score.
     */
    public static Integer getAbilityScore(){
        Dice d = new Dice(seed);
        Integer[] rolls = new Integer[4];
        for(int i = 0; i < 4; i++)
            rolls[i] = d.Roll(6, 1);
        Arrays.sort(rolls);
        return rolls[1]+rolls[2]+rolls[3];
    }


    /**
     * @param race The race to base the age on.
     * @return A random age.
     */
    public static Integer getAge(Enum.Race race){
        switch(race){
            case WOODELF: case DARKELF:  case HIGHELF:
                return randomize(750);
            case HALFELF:
                return randomize(180);
            case DRAGONBORN:
                return randomize(80);
            case HUMAN:
                return randomize(100);
            case STOUTHALFLING:
            case LIGHTFOOTHALFLING:
                return randomize(250);
            case TIEFLING:
                return randomize(125);
            case FORESTGNOME: case ROCKGNOME:
                return randomize(500);
            case HILLDWARF: case MOUNTAINDWARF:
                return randomize(350);
            case HALFORC:
                return randomize(75);
            default:
                return randomize(100);
        }
    }

    /**
     * @param race The race to base the height on.
     * @return A random height, in inches.
     */
    public static Integer getHeight(Enum.Race race){
        switch(race){
            case WOODELF: case DARKELF: case HIGHELF: case HALFELF:
                return randomize(48, 84);
            case DRAGONBORN:
                return randomize(72, 96);
            case HUMAN: case TIEFLING:
                return randomize(55, 78);
            case STOUTHALFLING:
            case LIGHTFOOTHALFLING:
                return randomize(24, 48);
            case FORESTGNOME: case ROCKGNOME:
                return randomize(36, 48);
            case HILLDWARF: case MOUNTAINDWARF:
                return randomize(48, 60);
            case HALFORC:
                return randomize(60, 84);
            default:
                return randomize(36, 108);
        }
    }

    /**
     * @param race The race to base the weight on.
     * @return A random weight, in pounds.
     */
    public static Integer getWeight(Enum.Race race){
        switch(race){
            case WOODELF: case DARKELF: case HIGHELF: case HALFELF:
                return randomize(80, 180);
            case DRAGONBORN:
                return randomize(200, 400);
            case HUMAN: case TIEFLING:
                return randomize(120, 250);
            case STOUTHALFLING:
            case LIGHTFOOTHALFLING:
                return randomize(20, 50);
            case FORESTGNOME: case ROCKGNOME:
                return randomize(30, 50);
            case HILLDWARF: case MOUNTAINDWARF:
                return randomize(120, 180);
            case HALFORC:
                return randomize(150, 300);
            default:
                return randomize(50, 400);
        }
    }

    /**
     * @return A random eye color.
     */
    public static Enum.EyeColor getEyeColor(){
        return Enum.EyeColor.values()[randomize(Enum.EyeColor.values().length - 1)];
    }

    /**
     * Generate personality information about the character.
     * (Marsol already did this, albeit in a lot more code, oops)
     * @return A string array formatted: [Background, Traits, Ideals, Bonds, Flaws]
     */
    public static String[] getPersonality(){
        String[] ret = new String[5];
        Integer bg = randomize(Enum.backgrounds.length);

        ret[0] = Enum.backgrounds[bg];
        ret[1] = String.join("\n", Enum.traits[bg]);
        ret[2] = String.join("\n", Enum.ideals[bg]);
        ret[3] = String.join("\n", Enum.bonds[bg]);
        ret[4] = String.join("\n", Enum.flaws[bg]);
        return ret;
    }

    /**
     * @return A randomly generated character sheet.
     */
    public static Character getCharacter(){
        Character c = new Character();
        // Basic info
        c.setCharClass(getCharClass());
        c.setCharLevel(getCharLevel());
        c.setCharExperiencePoints(Enum.getExperiencePoints(c.getCharLevel()));
        c.setCharGender(getCharGender());
        c.setCharRace(getCharRace());
        c.setCharAlignment(getCharAlignment());
        c.setCharName(getCharName(c.getCharRace(), c.getCharGender()));

        // Saving throws
        c.setCharStrength(getAbilityScore());
        c.setCharDexterity(getAbilityScore());
        c.setCharConstitution(getAbilityScore());
        c.setCharIntelligence(getAbilityScore());
        c.setCharWisdom(getAbilityScore());
        c.setCharCharisma(getAbilityScore());

        // TODO Character skills, equipment, attacks & spellcasting, treasure, symbol, backstory, addt'l features
        c.setCharArmorClass(Enum.getArmorClass(c.getCharDexterity()));
        c.setCharInitiative(c.getCharDexterity());
        c.setCharSpeed(c.getCharRace().getSpeed());
        c.setCharHitPointMaximum(Enum.getHitPoints(c.getCharClass(),  c.getCharLevel(), c.getCharConstitution()));

        // appearance
        c.setCharAge(getAge(c.getCharRace()));
        c.setCharHeight(getHeight(c.getCharRace()));
        c.setCharWeight(getWeight(c.getCharRace()));
        c.setCharEyeColor(getEyeColor());

        String[] personality = getPersonality();
        c.setCharBackground(Enum.Background.valueOf(personality[0]));
        c.setCharIdeals(personality[1]);
        c.setCharBonds(personality[2]);
        c.setCharFlaws(personality[3]);

        Enum.checkBackground(c);
        Enum.checkClass(c);
        return c;
    }

    /**
     * @param player The player's name
     * @return A randomly generated character sheet.
     */
    public static Character getCharacter(String player){
        Character c = getCharacter();
        c.setCharPlayerName(player);
        return c;
    }

}
