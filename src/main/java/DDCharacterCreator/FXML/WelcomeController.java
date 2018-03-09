package DDCharacterCreator.FXML;


import DDCharacterCreator.ControlledScreen;
import DDCharacterCreator.ScreensController;
import DDCharacterCreator.Character;
import DDCharacterCreator.Enum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable, ControlledScreen {
    ScreensController myController;
    Character myChar = new Character();

    @FXML
    private Button raceSubmit;

    @FXML
    private ComboBox<Enum.Race> raceBox;
    //private ComboBox<Enum.Class> classBox;

    @FXML
    private Label raceDescrip;
    //private Label classDescrip;


    @FXML
    private ObservableList<Enum.Race> raceBoxData = FXCollections.observableArrayList(Enum.Race.values());
    //private ObservableList<Enum.Class> classBoxData = FXCollections.observableArrayList(Enum.Class.values());

    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        raceBox.setItems(raceBoxData);
    }

    @FXML
    public void setRaceDescrip() {
        raceDescrip.setText(raceBox.getSelectionModel().getSelectedItem().getDescrip());
    }
    //public void setClassDescrip() {
    //    classDescrip.setText(classBox.getSelectionModel().getSelectedItem().getDescrip());
    //}

    @FXML
    public void readRaceSubmit() {
        myChar.setCharRace(raceBox.getSelectionModel().getSelectedItem());
        System.out.println(myChar.getCharRace());
    }
}
