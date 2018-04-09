package DDCharacterCreator.Controller;

import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import DDCharacterCreator.Utilities.Randomizer;
import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AgeHeightWeightController extends ControlledScreen implements Initializable, MenuController {

    /*
    TO DO:
    * Slider value shows double value for height/weight and unit (years, in -> ft'in"/m, lbs/kg)
    * Auto-grab min/max values from race
     */

    final private int MINLEVEL = 1;
    final private int MAXLEVEL = 25;

    @FXML
    public JFXSlider ageSlider, heightSlider, levelSlider, weightSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Grab Character, get race min/max for age height and weight. Set.
        //levelSlider.setMin(MINLEVEL);
        //levelSlider.setMax(MAXLEVEL);
    }

    @Override
    public void forwardFunction() {
        Main.getChar().setCharAge((int) getAge());
        Main.getChar().setCharHeight((int) getHeight());
        Main.getChar().setCharWeight((int) getWeight());
        getScreenParent().setScene(ScreensController.CHARAPPEARANCE);
    }

    @Override
    public void randomizeAll() {
        randomizeAge();
        randomizeHeight();
        randomizeWeight();
    }

    /**
     * Sets the ageSlider to a random value.
     */
    public void randomizeAge() {
        ageSlider.setValue(Randomizer.randomize(ageSlider.getMin(), ageSlider.getMax()));
    }

    /**
     * Sets the heightSlider to a random value.
     */
    public void randomizeHeight() {
        heightSlider.setValue(Randomizer.randomize(heightSlider.getMin(), heightSlider.getMax()));
    }

    /**
     * Sets the levelSlider to a random value.
     */
    public void randomizeLevel() {
        //levelSlider.setValue(Randomizer.randomize(levelSlider.getMin(), levelSlider.getMax()));
    }

    /**
     * Sets the weightSlider to a random value.
     */
    public void randomizeWeight() {
        weightSlider.setValue(Randomizer.randomize(weightSlider.getMin(), weightSlider.getMax()));
    }

    /* GETTERS */

    public double getAge() {
        return ageSlider.getValue();
    }

    public double getHeight() {
        return heightSlider.getValue();
    }

    public int getLevel() {
        //return (int) levelSlider.getValue();
        return 0;
    }

    public double getWeight() {
        return weightSlider.getValue();
    }

    /* SETTERS */

    public void setMinAge(double minAge) {
        ageSlider.setMin(minAge);
    }

    public void setMaxAge(double maxAge) {
        ageSlider.setMax(maxAge);
    }

    public void setMinHeight(double minHeight) {
        heightSlider.setMin(minHeight);
    }

    public void setMaxHeight(double maxHeight) {
        heightSlider.setMax(maxHeight);
    }

    public void setMinLevel(int minLevel) {
        //levelSlider.setMin(minLevel);
    }

    public void setMaxLevel(int maxLevel) {
        //levelSlider.setMax(maxLevel);
    }

    public void setMinWeight(double minWeight) {
        weightSlider.setMin(minWeight);
    }

    public void setMaxWeight(double maxWeight) {
        weightSlider.setMax(maxWeight);
    }
}
