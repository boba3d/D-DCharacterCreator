package DDCharacterCreator.FXML;

import DDCharacterCreator.ControlledScreen;
import DDCharacterCreator.ScreensController;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable, ControlledScreen {
    ScreensController myController;

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
