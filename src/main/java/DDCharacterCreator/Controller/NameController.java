package DDCharacterCreator.Controller;

import DDCharacterCreator.Main;
import DDCharacterCreator.Utilities.Randomizer;
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
        randomizeCharacterName();
        randomizePlayerName();
    }

    /**
     * Get a random character name based on race and gender
     * Note: here we also have to choose a race and gender!
     */
    public void randomizeCharacterName(){
        Main.getChar().setCharRace(Randomizer.getCharRace());
        Main.getChar().setCharGender(Randomizer.getCharGender());
        String name = Randomizer.getCharName(Main.getChar().getCharRace(), Main.getChar().getCharGender());
        characterNameField.textProperty().setValue(name);
    }

    /**
     * Set the player's name to the current user's name
     */
    public void randomizePlayerName(){
        playerNameField.textProperty().setValue(System.getProperty("user.name"));
    }


    /* GETTERS */

    public String getCharacterName() {
        return characterNameField.textProperty().getValue();
    }

    public String getPlayerName() {
        return playerNameField.textProperty().getValue();
    }
}
