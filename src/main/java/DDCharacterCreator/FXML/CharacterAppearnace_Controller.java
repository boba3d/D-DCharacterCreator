package DDCharacterCreator.FXML;

import DDCharacterCreator.ControlledScreen;
import DDCharacterCreator.ScreensController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;


public class CharacterAppearnace_Controller extends ControlledScreen implements Initializable {
    @FXML
    private Pane imgScrollPane;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        GridPane gridpane = new GridPane();
        gridpane.setMinSize(400, 200);
        gridpane.setVgap(5);
        gridpane.setHgap(5);
        gridpane.setAlignment(Pos.CENTER_LEFT);
        Image image = new Image("https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/WE5.jpg");
        Image image2 = new Image("https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/WE5.jpg");
        Image image3 = new Image("https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/WE5.jpg");
        gridpane.add(new ImageView(image),0,0);
        gridpane.add(new ImageView(image2),1,0);
        gridpane.add(new ImageView(image3), 0,1);
        imgScrollPane.getChildren().add(gridpane);

    }

    public void NextScreen(){

        getScreenParent().setScreen("ageWeightHeight_menu");
    }
}
