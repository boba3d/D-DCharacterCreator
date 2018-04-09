package DDCharacterCreator.Controller;


import DDCharacterCreator.Character;
import DDCharacterCreator.Dice;
import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

public class DiceController extends ControlledScreen implements Initializable, MenuController{

    @FXML
    public JFXTextArea DiceBox,RollBox;
    @FXML
    public JFXButton diceButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setInfoBoxText("Dice Rolls for Stats!\n "+"Here we will roll 6 sets of 4-Sided Die!");
        diceButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                rollDie(Main.getChar());
                RollBox.setText("Your stats are:!\n"+"Strength: "+Main.getChar().getCharStrength()+"\nDexterity:"+Main.getChar().getCharDexterity()+"Constitution: "+Main.getChar().getCharConstitution()+"Intelligence: "+Main.getChar().getCharIntelligence()+"Wisdom: "+Main.getChar().getCharWisdom()+"Charisma: "+Main.getChar().getCharCharisma());
            }
        });
    }
    @Override
    public void forwardFunction() { getScreenParent().setScene(ScreensController.CLASS); }

    @Override
    public void randomizeAll() {
        System.out.println("Rand test");
    }
    /**
     * Test function.
     */

    public void setInfoBoxText(String text) {
        DiceBox.setText(text);
    }
    public void rollDie(Character character){
        Dice die = new Dice();
        double temp;
        temp=die.Roll(6,3);
        character.setCharStrength(((int)temp-10)/2);
        temp=die.Roll(6,3);
        character.setCharDexterity(((int)temp-10)/2);
        temp=die.Roll(6,3);
        character.setCharConstitution(((int)temp-10)/2);
        temp=die.Roll(6,3);
        character.setCharIntelligence(((int)temp-10)/2);
        temp=die.Roll(6,3);
        character.setCharWisdom(((int)temp-10)/2);
        temp=die.Roll(6,3);
        character.setCharCharisma(((int)temp-10)/2);
        temp=die.Roll(6,3);
    }




    /* GETTERS */

}
