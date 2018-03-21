package DDCharacterCreator.FXML;

import DDCharacterCreator.Character;
import DDCharacterCreator.ControlledScreen;
import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;

import java.text.DecimalFormat;

public class ageHeightWeightController implements ControlledScreen {

    /*
    TO DO:
    * Slider value shows double value for height/weight and unit (years, in -> ft'in"/m, lbs/kg)
    * Fix slider value display (is behind text)
    * Move all styling to .css
    * Auto-grab min/max values from race database, include deviation? (some people live to 120, avg. is 80s)
    * Replace labels with graphics (- age)
     */

    ScreensController screensController;

    @FXML
    public JFXSlider ageSlider, heightSlider, weightSlider;

    /**
     * Test function. Assigned to button with label value 'Test'.
     */
    public void printValues() {
        DecimalFormat df = new DecimalFormat();
        System.out.println(("Age: " + getAge() + "\n" +
                "Height: " + String.format("%.2f",getHeight()) + "\n" +
                "Weight: " + String.format("%.2f",getWeight())));
        Character MyChar = Main.getChar();
        MyChar.setCharAge((int) getAge());
        MyChar.setCharHeight(String.format("%.2f",getHeight()));
        MyChar.setCharWeight(String.format("%.2f",getWeight()));
        Main.PrintCharacter();
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        screensController = screenPage;
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

    public void setMinWeight(double minWeight) {
        weightSlider.setMin(minWeight);
    }

    public void setMaxWeight(double maxWeight) {
        weightSlider.setMax(maxWeight);
    }
}
