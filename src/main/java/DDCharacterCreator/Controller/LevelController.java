package DDCharacterCreator.Controller;

import DDCharacterCreator.Utilities.Randomizer;
import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class LevelController extends ControlledScreen implements Initializable, MenuController {

    final private int MINLEVEL = 1;
    final private int MAXLEVEL = 25;
    @FXML
    public JFXSlider levelSlider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setMinLevel(MINLEVEL);
        setMaxLevel(MAXLEVEL);
        resetLevelSlider();
    }

    @Override
    public void forwardFunction() {
        System.out.println("Forward Test");
    }

    @Override
    public void randomizeAll() {
        randomizeLevel();
    }

    /**
     * Sets the levelSlider to a random value.
     */
    public void randomizeLevel() {
        levelSlider.setValue(Randomizer.randomize(levelSlider.getMin(), levelSlider.getMax()));
    }

    /**
     * Test function.
     */
    public void printValue() {
        System.out.println("Level Selected: " + getLevel());
    }

    public void resetLevelSlider() {
        levelSlider.setValue(levelSlider.getMin());
    }

    /* GETTERS */

    public int getLevel() {
        return (int) levelSlider.getValue();
    }

    /* SETTERS */

    public void setMinLevel(int minLevel) {
        levelSlider.setMin(minLevel);
    }

    public void setMaxLevel(int maxLevel) {
        levelSlider.setMax(maxLevel);
    }
}
