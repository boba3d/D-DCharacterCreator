package DDCharacterCreator.Utilities;

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
}
