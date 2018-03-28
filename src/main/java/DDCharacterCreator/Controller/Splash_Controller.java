package DDCharacterCreator.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DDCharacterCreator.ScreensController;
import javafx.fxml.Initializable;


public class Splash_Controller extends ControlledScreen implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void NextScreen(){
        getScreenParent().setScene(ScreensController.AGEWEIGHTHEIGHT);
    }
}
