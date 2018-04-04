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
        c.setCharRace(Enum.Race.WOODELF);
        Enum.checkRace(c);
        Assert.assertEquals(2,(int)c.getCharDexterity());
        Assert.assertTrue(true);

        c.setCharBackground(Enum.Background.ACOLYTE);
        Enum.checkBackground(c);
        Assert.assertEquals(Enum.Background.ACOLYTE,c.getCharBackground());
        Assert.assertTrue(true);

        c.setCharClass(Enum.Class.MONK);
        Enum.checkClass(c);

        Assert.assertEquals(Enum.Class.MONK,c.getCharClass());
        Assert.assertEquals(8,(int)c.getCharHitDice());
        Assert.assertTrue(true);
    }
}

