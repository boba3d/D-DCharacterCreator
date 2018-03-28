package DDCharacterCreator.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class NameController extends ControlledScreen implements MenuController {

    @FXML
    public JFXTextField characterNameField, playerNameField;

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
        System.out.println("Character Name: " + getCharacterName() + "\n" +
                "Player Name: " + getPlayerName());
    }

    /* GETTERS */

    public String getCharacterName() {
        return characterNameField.textProperty().getValue();
    }

    public String getPlayerName() {
        return playerNameField.textProperty().getValue();
    }
}
