package DDCharacterCreator.FXML;

import DDCharacterCreator.ControlledScreen;
import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class levelController extends ControlledScreen implements Initializable {

    @FXML
    public JFXSlider levelSlider;

    final private int MINLEVEL = 1;
    final private int MAXLEVEL = 25;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setMinLevel(MINLEVEL);
        setMaxLevel(MAXLEVEL);
        resetLevelSlider();
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
