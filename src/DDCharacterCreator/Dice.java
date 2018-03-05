package DDCharacterCreator;

import java.util.Random;

/**
 * @author Michael MacLean
 * @version 1.0
 * @since 1.0
 *
 * A class for rolling a die
 */
public class Dice {
    private Random r;

    public Dice(){
        r = new Random();
    }

    /**
     * Roll the dice.
     * @param faces The number of faces on each die
     * @param dieCount The number of die to use.
     * @return The total sum of all die rolled.
     */
    public Integer Roll(int faces, int dieCount){
        int ans = 0;
        if(faces < 2) throw new IllegalArgumentException("Must be more than one face!");
        if(dieCount < 0) throw new IllegalArgumentException("Die count must be non-negative!");
        for(int i = 0; i < dieCount; i++)
            ans += r.nextInt(faces) + 1; // from 1 to faces
        return ans;
    }
}
