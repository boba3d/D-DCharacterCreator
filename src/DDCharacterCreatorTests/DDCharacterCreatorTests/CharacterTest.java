package DDCharacterCreatorTests;

import DDCharacterCreator.Character;
import DDCharacterCreator.Enum;
import org.junit.*;

public class CharacterTest {

    private Character c;

    @Before
    public void Init(){ c = new Character();
    }

    @Test
    public void CharacterTest() {

        c.setCharBackground(Enum.Background.ACOLYTE);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.ACOLYTE,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.OUTLANDER);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.OUTLANDER,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.SAGE);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.SAGE,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.SAILOR);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.SAILOR,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.CRIMINAL);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.CRIMINAL,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.HERMIT);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.HERMIT,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.ENTERTAINER);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.ENTERTAINER,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.NOBLE);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.NOBLE,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.CHARLATAN);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.CHARLATAN,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.GUILDARTISAN);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.GUILDARTISAN,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.MONK);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.MONK,c.getCharClass());

        Assert.assertEquals(8,(int)c.getCharHitDice());
        Assert.assertTrue(true);

<<<<<<< HEAD
        c.setCharClass(Enum.Class.WARLOCK);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.WARLOCK,c.getCharClass());
        Assert.assertEquals(8,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.SORCERER);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.SORCERER,c.getCharClass());
        Assert.assertEquals(6,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.BARD);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.BARD,c.getCharClass());
        Assert.assertEquals(8,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.FIGHTER);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.FIGHTER,c.getCharClass());
        Assert.assertEquals(10,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.PALADIN);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.PALADIN,c.getCharClass());
        Assert.assertEquals(10,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.RANGER);
        Enum.checkClass(c);
        Assert.assertEquals(Enum.Class.RANGER,c.getCharClass());
        Assert.assertEquals(10,(int)c.getCharHitDice());
        Assert.assertTrue(true);

        c.setCharRace(Enum.Race.HUMAN);
        Enum.checkRace(c);
        Assert.assertEquals(Enum.Race.HUMAN, c.getCharRace());
        Assert.assertTrue(true);

=======
        c.setCharRace(Enum.Race.HUMAN);
        Enum.checkRace(c);
        Assert.assertEquals(Enum.Race.HUMAN,c.getCharRace());
>>>>>>> origin/master
    }
}

