package DDCharacterCreator.Controller;


import DDCharacterCreator.Character;
import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import DDCharacterCreator.Utilities.Randomizer;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import jfxtras.labs.dialogs.DialogFX;

import java.net.URL;
import java.util.ResourceBundle;

public class DiceController extends ControlledScreen implements Initializable, MenuController{

    @FXML public JFXTextArea DiceBox,RollBox;
    @FXML public JFXButton diceButton;
    @FXML public JFXSlider levelSlider;
    final private int MINLEVEL = 1;
    final private int MAXLEVEL = 25;
    private boolean rolled;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setInfoBoxText("Dice Rolls for Stats!\n "+"Here we will roll 3 6-Sided Die six times!");
        diceButton.setOnAction(event -> {
            rollDie(Main.getChar());
            RollBox.setText("Your stats are: \n"
                    +"Strength: "+Main.getChar().getCharStrength()
                    +"\nDexterity: "+Main.getChar().getCharDexterity()
                    +"\nConstitution: "+Main.getChar().getCharConstitution()
                    +"\nIntelligence: "+Main.getChar().getCharIntelligence()
                    +"\nWisdom: "+Main.getChar().getCharWisdom()
                    +"\nCharisma: "+Main.getChar().getCharCharisma());
        });
        levelSlider.setMin(MINLEVEL);
        levelSlider.setMax(MAXLEVEL);
        levelSlider.setValue((MINLEVEL + MAXLEVEL)/2);
    }
    @Override
    public void forwardFunction() {
        if(!rolled){
            DialogFX d = new DialogFX(DialogFX.Type.INFO);
            d.setTitleText("Roll the die");
            d.setMessage("You haven't rolled for your abilities yet!");
            d.showDialog();
            return;
        }

        Main.getChar().setCharLevel((int) levelSlider.getValue());
        getScreenParent().setScene(ScreensController.CLASS);
    }

    @Override
    public void randomizeAll() {
        randomizeLevel();
    }

    /**
     * Sets the levelSlider to a random value.
     */
    public void randomizeLevel() {
        levelSlider.setValue(Randomizer.randomize(MINLEVEL, MAXLEVEL));
    }

    /**
     * Test function.
     */

    public void setInfoBoxText(String text) {
        DiceBox.setText(text);
    }

    /**
     * Set the ability scores at random
     * @param c The character to set the scores on
     */
    public void rollDie(Character c){
        rolled = true;
        c.setCharStrength(Randomizer.getAbilityScore());
        c.setCharDexterity(Randomizer.getAbilityScore());
        c.setCharConstitution(Randomizer.getAbilityScore());
        c.setCharIntelligence(Randomizer.getAbilityScore());
        c.setCharWisdom(Randomizer.getAbilityScore());
        c.setCharCharisma(Randomizer.getAbilityScore());
    }




    /* GETTERS */

}
