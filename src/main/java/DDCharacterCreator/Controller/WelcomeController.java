package DDCharacterCreator.Controller;


import DDCharacterCreator.Character;
import DDCharacterCreator.Enum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WelcomeController extends ControlledScreen implements Initializable {
    //Character myChar = new Character();
    //ArrayList<Cantrips> myCantrips = new ArrayList<>();

    //@FXML
    //private Button raceSubmit, classSubmit, nextButton, cantripSubmit;

    //@FXML
    //private ComboBox<Enum.Race> raceBox;

   // @FXML
    //private ComboBox<Enum.Class> classBox;

    //@FXML
    //private ComboBox<Enum.Cantrips> cantripBox;

    //@FXML
   // private ListView<Enum.Cantrips> cantripList;

    //@FXML
    //private Label raceDescrip, classDescrip;


    //@FXML
    //private ObservableList<Enum.Race> raceBoxData = FXCollections.observableArrayList(Enum.Race.values());

    //@FXML
    //private ObservableList<Enum.Class> classBoxData = FXCollections.observableArrayList(Enum.Class.values());


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //raceBox.setItems(raceBoxData);
        //classBox.setItems(classBoxData);
    }

    //@FXML
    //public void setRaceDescrip() {
        //raceDescrip.setText(raceBox.getSelectionModel().getSelectedItem().getDescrip());
    //}

    //@FXML
    //public void setClassDescrip() {
        //classDescrip.setText(classBox.getSelectionModel().getSelectedItem().getDescrip());
    //}

    //@FXML
    //public void readRaceSubmit() {
       // myChar.setCharRace(raceBox.getSelectionModel().getSelectedItem());
       // System.out.println(myChar.getCharRace());
    //}

   // @FXML
    //public void readClassSubmit() {
      //  myChar.setCharClass(classBox.getSelectionModel().getSelectedItem());
       // System.out.println(myChar.getCharClass());

       // cantripBox.setItems(getClassCantripsList());
    //}

    //@FXML
    //public void readCantripSubmit() {
      //  myCantrips.add(cantripBox.getSelectionModel().getSelectedItem());
      //  ObservableList<Enum.Cantrips> oListMyCantrips = FXCollections.observableArrayList(myCantrips);
       // cantripList.setItems(oListMyCantrips);
    //}

    //private ObservableList<Enum.Cantrips> getClassCantripsList() {
       // ObservableList<Enum.Cantrips> classCantripList;
        //classCantripList = FXCollections.observableArrayList(Enum.getCantripsList(myChar));
        //return classCantripList;
    //}

}
