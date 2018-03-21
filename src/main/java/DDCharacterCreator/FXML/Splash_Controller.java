package DDCharacterCreator.FXML;

import java.net.URL;
import java.util.ResourceBundle;

import DDCharacterCreator.ControlledScreen;
import DDCharacterCreator.ScreensController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class Splash_Controller implements Initializable, ControlledScreen {
    ScreensController myController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //NextScreen();
        //myController.setScreen(AirAxel.Welcome);
    }
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public void NextScreen(){

        myController.setScreen("ageWeightHeight_menu");
    }
}
