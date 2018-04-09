package DDCharacterCreator.Controller;

import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public class NameController extends ControlledScreen implements MenuController {

    @FXML
    public JFXTextField characterNameField, playerNameField;

    @Override
    public void forwardFunction() {
        if (!getCharacterName().isEmpty() && !getPlayerName().isEmpty()) {
            if (getCharacterName().length() < 15)
                Main.mycharacter.setCharName(getCharacterName());
            if (getPlayerName().length() < 15)
                Main.mycharacter.setCharPlayerName(getPlayerName());
            getScreenParent().setScene(ScreensController.DICE);
        }
    }
    @Override
    public void randomizeAll() {
        System.out.println("Rand test");
    }


    /* GETTERS */

    public String getCharacterName() {
        return characterNameField.textProperty().getValue();
    }

    public String getPlayerName() {
        return playerNameField.textProperty().getValue();
    }
}
