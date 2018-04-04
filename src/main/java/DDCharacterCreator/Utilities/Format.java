package DDCharacterCreator.Utilities;

import DDCharacterCreator.Enum;

import java.text.DecimalFormat;

public class Format {

    final private static DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    final private static double KILOGRAMS_IN_POUND = 0.453592;
    final private static double METERS_IN_INCH = 0.0254;

    /**
     * Converts an input in inches to the format of ft'in".
     *
     * @param inches
     * @return A string in the format of ft'in".
     */
    public static String convertInchesToFtIn(int inches) {
        try {
            if (inches < 0)
                throw new IllegalArgumentException("Input must be non-negative.");

            int feet = inches / 12;
            inches = inches - (feet * 12);

            return feet + "'" + inches + '"';
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return "0'0" + '"';
        }
    }

    /**
     * Converts an input in pounds to its equivalent in kilograms,
     * in the format # kg.
     *
     * @param pounds
     * @return
     */
    public static String convertPoundsToKilograms(int pounds) {
        return DECIMAL_FORMAT.format((double) pounds * KILOGRAMS_IN_POUND) + " kg";
    }

    /**
     * Converts an input in inches to its equivalent in meters,
     * in the format # m.
     *
     * @param inches
     * @return
     */
    public static String convertInchesToMeters(int inches) {
        return DECIMAL_FORMAT.format((double) inches * METERS_IN_INCH) + " m";
    }

    /**
     * Converts an input in pounds to the format # lb.
     *
     * @param pounds
     * @return
     */
    public static String formatPounds(int pounds) {
        return pounds + " lb";
    }


    /**
     * Gets all Backgrounds and their descriptions from Enum.Background, splits the array
     * into an identifier and a description.
     *
     * @return returnArrays[0] is the array of getName(), returnArrays[1] is the array of Background info
     */
    public static String[][] formatBackgroundEnum() {
        Enum.Background[] backgrounds = Enum.Background.values();
        String[][] returnArrays = new String[2][backgrounds.length];

        for (int i = 0; i < backgrounds.length; i++) {
            returnArrays[0][i] = backgrounds[i].getName();
            returnArrays[1][i] = "Number of Languages: " + backgrounds[i].getLanguages() +
                    "\nNumber of Musical Instruments: " + backgrounds[i].getMusical_instruments() +
                    "\nStarting Gold: " + backgrounds[i].getGold() +
                    "\nEquipment: " + backgrounds[i].getEquipment();
        }

        return returnArrays;
    }

    /**
     * Gets all Classes and their descriptions from Enum.Class, splits the array
     * into an identifier and a description.
     *
     * @return returnArrays[0] is the array of toString(), returnArrays[1] is the array of getDescrip()
     */
    public static String[][] formatClassEnum() {
        Enum.Class[] classes = Enum.Class.values();
        String[][] returnArrays = new String[2][classes.length];

        for (int i = 0; i < classes.length; i++) {
            returnArrays[0][i] = classes[i].toString();
            returnArrays[1][i] = classes[i].getDescrip();
        }

        return returnArrays;
    }

    /**
     * Gets all Races and their descriptions from Enum.Race, splits the array
     * into an identifier and a description.
     *
     * @return returnArrays[0] is the array of toString(), returnArrays[1] is the array of getDescrip()
     */
    public static String[][] formatRaceEnum() {
        Enum.Race[] races = Enum.Race.values();
        String[][] returnArrays = new String[2][races.length];

        for (int i = 0; i < races.length; i++) {
            returnArrays[0][i] = races[i].toString();
            returnArrays[1][i] = "Size: " + races[i].getSize() +
                    " Speed: " + races[i].getSpeed() +
                    "\nSTR: " + races[i].getStr() +
                    " DEX: " + races[i].getDex() +
                    " CON: " + races[i].getCon() +
                    " INT: " + races[i].getIntel() +
                    " WIS: " + races[i].getWis() +
                    " CHA: " + races[i].getCha() +
                    "\nDescription: " + races[i].getDescrip();
        }

        return returnArrays;
    }
}
