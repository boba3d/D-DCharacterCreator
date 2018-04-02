package DDCharacterCreatorTests;

import DDCharacterCreator.Dice;
import org.junit.*;


public class DiceTest {
    private Dice d;

    @Before
    public void Init(){
        d = new Dice();
    }

    @Test
    public void RollTest(){
        try{ // bound check for faces
            d.Roll(1, 1);
            Assert.fail();
        }
        catch(IllegalArgumentException e){ Assert.assertTrue(true); }
        try{ // bound check for die count
            d.Roll(6, -1);
            Assert.fail();
        }
        catch(IllegalArgumentException e) { Assert.assertTrue(true); }

        // 0 die count
        Assert.assertTrue(d.Roll(6, 0) == 0);

        for(int i = 0; i < 10; i++){ // 1d6
            Integer x = d.Roll(6, 1);
            Assert.assertTrue(x <= 6 && x >= 1);
        }

        for(int i = 0; i < 10; i++){ // 1d4
            Integer x = d.Roll(4, 1);
            Assert.assertTrue(x <= 4 && x >= 1);
        }

        for(int i = 0; i < 10; i++){ // 4d6
            Integer x = d.Roll(6, 4);
            Assert.assertTrue(x <= 24 && x >= 4);
        }

        for(int i = 0; i < 10; i++){
            Integer x = d.Roll(20, 5);
            Assert.assertTrue(x <= 100 && x >= 20);
        }
    }
}
