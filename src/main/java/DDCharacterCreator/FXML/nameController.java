package DDCharacterCreator.FXML;

import DDCharacterCreator.ControlledScreen;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class nameController extends ControlledScreen {

    @FXML
    public JFXTextField characterNameField, playerNameField;

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
