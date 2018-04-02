package DDCharacterCreatorTests;

import DDCharacterCreator.Utilities.Randomizer;
import DDCharacterCreator.Enum;
import org.junit.*;

import java.util.Arrays;

public class RandomizerTests {
    @Test
    public void randomizeTest() {
        try { // min/max exception
            Randomizer.randomize(5, 2);
            Assert.fail();
        } catch (IllegalArgumentException e) { Assert.assertTrue(true); }

        for(int i = 0; i < 10; i++){
            Integer x = Randomizer.randomize(5);
            Assert.assertTrue(x >= 0 && x <= 5);
        }

        for(int i = 0; i < 10; i++){
            Integer x = Randomizer.randomize(1, 5);
            Assert.assertTrue(x >= 1 && x <= 5);
        }

        for(int i = 0; i < 10; i++){
            Double x = Randomizer.randomize(1.0, 5.0);
            Assert.assertTrue(x >= 1 && x <= 5);
        }
    }

    @Test
    public void nameTest(){
        String n;

        try{
            n = Randomizer.getCharName(Enum.Race.DRAGONBORN, Enum.Gender.M);
            Enum.maleDragonbornNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.DRAGONBORN, Enum.Gender.F);
            Enum.femaleDragonbornNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.WOODELF, Enum.Gender.M);
            Enum.maleElfNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.WOODELF, Enum.Gender.F);
            Enum.femaleElfNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.FORESTGNOME, Enum.Gender.M);
            Enum.maleGnomeNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.FORESTGNOME, Enum.Gender.F);
            Enum.femaleGnomeNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.HALFELF, Enum.Gender.M);
            Enum.maleHalfElfNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.HALFELF, Enum.Gender.F);
            Enum.femaleHalfElfNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.HILLDWARF, Enum.Gender.M);
            Enum.maleDwarfNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.HILLDWARF, Enum.Gender.F);
            Enum.femaleDwarfNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.HUMAN, Enum.Gender.M);
            Enum.maleHumanNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.HUMAN, Enum.Gender.F);
            Enum.femaleHumanNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.HALFORC, Enum.Gender.M);
            Enum.maleHalfOrcNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.HALFORC, Enum.Gender.F);
            Enum.femaleHalfOrcNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.STOUT, Enum.Gender.M);
            Enum.maleHalflingNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.STOUT, Enum.Gender.F);
            Enum.femaleHalflingNames.valueOf(n);

            n = Randomizer.getCharName(Enum.Race.TIEFLING, Enum.Gender.M);
            Enum.maleTieflingNames.valueOf(n);
            n = Randomizer.getCharName(Enum.Race.TIEFLING, Enum.Gender.F);
            Enum.femaleTieflingNames.valueOf(n);
        }
        catch(Exception e){ // valueOf will throw an exception on fail
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void raceTest(){
        Enum.Race r;
        try{
            for(int i = 0; i < 10; i++){
                r = Randomizer.getCharRace();
                Assert.assertNotNull(r);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void levelTest(){
        Integer l;
        for(int i = 0; i < 30; i++){
            l = Randomizer.getCharLevel();
            Assert.assertTrue(l <= 20 && l >= 1);
        }
    }

    @Test
    public void classTest(){
        Enum.Class c;
        try{
            for(int i = 0; i < 10; i++){
                c = Randomizer.getCharClass();
                Assert.assertNotNull(c);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void alignmentTest(){
        Enum.Alignment a;
        try{
            for(int i = 0; i < 10; i++){
                a = Randomizer.getCharAlignment();
                Assert.assertNotNull(a);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void genderTest(){
        Enum.Gender g;
        try{
            for(int i = 0; i < 7; i++){
                g = Randomizer.getCharGender();
                Assert.assertNotNull(g);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void personalityTest(){
        String[] bg;
        Integer n;

        for(int i = 0; i < 10; i++){
            bg = Randomizer.getPersonality();
            System.out.println(bg[0]);
            n = Arrays.asList(Enum.backgrounds).indexOf(bg);
            Assert.assertNotSame(n, -1);
            Assert.assertSame(bg[1].split("\n"), Enum.traits[n]);
            Assert.assertSame(bg[2].split("\n"), Enum.ideals[n]);
            Assert.assertSame(bg[3].split("\n"), Enum.bonds[n]);
            Assert.assertSame(bg[4].split("\n"), Enum.flaws[n]);
        }
    }
}
