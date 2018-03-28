package DDCharacterCreator.Utilities;

import java.util.Random;

public class Randomizer {

    /*
    TO DO:
    * Add sequence capability (enter one seed for entire character/page gen)
     */

    final private static double K = 100.00;
    private static long seed;
    private static Random random;

    /**
     * Initializes random with a given seed.
     *
     * @param seed The seed used for random generation.
     */
    private static void initializeRandom(long seed) {
        Randomizer.seed = seed;
        random = new Random(Randomizer.seed);
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
        return randomize(min, max, System.nanoTime());
    }

    /**
     * Returns a random int in the inclusive range of [min, max],
     * using a given seed.
     *
     * @param min  The minimum int value.
     * @param max  The maximum int value.
     * @param seed The seed used for random generation.
     * @return Random int in the inclusive range of [min, max].
     */
    public static int randomize(int min, int max, long seed) {
        if (min > max)
            throw new IllegalArgumentException("Max must be at least min!");

        initializeRandom(seed);

        return random.nextInt(max - min + 1) + min;
    }

    /* GETTERS */

    public static long getSeed() {
        return seed;
    }

}
