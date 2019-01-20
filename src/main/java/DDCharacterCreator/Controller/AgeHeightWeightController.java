package DDCharacterCreator.Controller;

import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import DDCharacterCreator.Utilities.*;
import com.jfoenix.controls.JFXSlider;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AgeHeightWeightController extends ControlledScreen implements Initializable, MenuController {

    @FXML
    public JFXSlider ageSlider, heightSlider, weightSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Grab Character, get race min/max for age height and weight. Set.
        ageSlider.setMin(1);

        switch(Main.getChar().getCharRace()){
            case WOODELF: case DARKELF: case HIGHELF:
                ageSlider.setMax(750);
                heightSlider.setMin(48);
                heightSlider.setMax(84);
                weightSlider.setMin(80);
                weightSlider.setMax(180);
                break;
            case HALFELF:
                ageSlider.setMax(180);
                heightSlider.setMin(48);
                heightSlider.setMax(84);
                weightSlider.setMin(80);
                weightSlider.setMax(180);
                break;
            case DRAGONBORN:
                ageSlider.setMax(80);
                heightSlider.setMin(72);
                heightSlider.setMax(96);
                weightSlider.setMin(200);
                weightSlider.setMax(400);
                break;
            case HUMAN:
                ageSlider.setMax(100);
                heightSlider.setMin(55);
                heightSlider.setMax(78);
                weightSlider.setMin(120);
                weightSlider.setMax(250);
                break;
            case STOUTHALFLING: case LIGHTFOOTHALFLING:
                ageSlider.setMax(250);
                heightSlider.setMin(24);
                heightSlider.setMax(48);
                weightSlider.setMin(20);
                weightSlider.setMax(50);
                break;
            case TIEFLING:
                ageSlider.setMax(125);
                heightSlider.setMin(55);
                heightSlider.setMax(78);
                weightSlider.setMin(120);
                weightSlider.setMax(250);
                break;
            case FORESTGNOME: case ROCKGNOME:
                ageSlider.setMax(500);
                heightSlider.setMin(36);
                heightSlider.setMax(48);
                weightSlider.setMin(30);
                weightSlider.setMax(50);
                break;
            case HILLDWARF: case MOUNTAINDWARF:
                ageSlider.setMax(350);
                heightSlider.setMin(48);
                heightSlider.setMax(60);
                weightSlider.setMin(120);
                weightSlider.setMax(180);
                break;
            case HALFORC:
                ageSlider.setMax(75);
                heightSlider.setMin(60);
                heightSlider.setMax(84);
                weightSlider.setMin(150);
                weightSlider.setMax(300);
                break;
            default:
                ageSlider.setMax(100);
                heightSlider.setMin(36);
                heightSlider.setMax(108);
                weightSlider.setMin(50);
                weightSlider.setMax(400);
                break;
        }

        // set indicators
        heightSlider.setValueFactory(s -> Bindings.createStringBinding(() -> Format.convertInchesToFtIn((int)s.getValue())));
        weightSlider.setValueFactory(s -> Bindings.createStringBinding(() -> Format.formatPounds((int)s.getValue())));
        ageSlider.setValueFactory(s -> Bindings.createStringBinding(() -> (int)s.getValue() + " years"));
    }

    @Override
    public void forwardFunction() {
        Main.getChar().setCharAge((int) getAge());
        Main.getChar().setCharHeight((int) getHeight());
        Main.getChar().setCharWeight((int) getWeight());
        //getScreenParent().setScene(ScreensController.CHARAPPEARANCE);
        Main.PrintCharacter();
        Platform.exit();
    }

    @Override
    public void randomizeAll() {
        randomizeAge();
        randomizeHeight();
        randomizeWeight();
    }

    /**
     * Set the age slider to a random age based on the selected race
     */
    public void randomizeAge(){
        ageSlider.setValue(Randomizer.getAge(Main.getChar().getCharRace()));
    }

    /**
     * Set the height slider to a random height based on the selected race
     */
    public void randomizeHeight(){
        heightSlider.setValue(Randomizer.getHeight(Main.getChar().getCharRace()));
    }

    /**
     * Set the weight slider to a random weight based on the selected race
     */
    public void randomizeWeight(){
        weightSlider.setValue(Randomizer.getWeight(Main.getChar().getCharRace()));
    }

    /* GETTERS */

    public double getAge() {
        return ageSlider.getValue();
    }

    public double getHeight() {
        return heightSlider.getValue();
    }

    public double getWeight() {
        return weightSlider.getValue();
    }
}
