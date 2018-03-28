package DDCharacterCreator.Controller;

import com.jfoenix.controls.JFXSlider;
import javafx.fxml.FXML;

public class AgeHeightWeightController extends ControlledScreen implements MenuController {

    /*
    TO DO:
    * Slider value shows double value for height/weight and unit (years, in -> ft'in"/m, lbs/kg)
    * Auto-grab min/max values from race database, include deviation? (some people live to 120, avg. is 80s)
     */

    @FXML
    public JFXSlider ageSlider, heightSlider, weightSlider;

    @Override
    public void backFunction() {
        System.out.println("Back Test");
    }

    @Override
    public void forwardFunction() {
        System.out.println("Forward Test");
    }

    @Override
    public void randomizeAll() {
        System.out.println("Rand test");
    }

    /**
     * Test function.
     */
    public void printValues() {
        System.out.println(("Age: " + getAge() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Weight: " + getWeight()));

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
