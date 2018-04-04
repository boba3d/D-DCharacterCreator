package DDCharacterCreator.Controller;

import DDCharacterCreator.Character;
import DDCharacterCreator.Main;
import DDCharacterCreator.ScreensController;
import com.jfoenix.controls.JFXButton;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;


public class CharacterAppearnace_Controller extends ControlledScreen implements Initializable, MenuController{

    @FXML private GridPane PictureGrid;
    @FXML private JFXButton btnUploadAppearance;

    Character MyCharacter;
    Boolean NodeSelected = false;
    Object NodeSource;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        MyCharacter = Main.getChar();

        LinkedList<String> dbimg = Main.getDB().getImages(MyCharacter);
        Iterator<String> imgIter = dbimg.iterator();

        //add all objects to grid
        for(int i =0; i <4; i++){
            for(int j =0; j < 3; j++){
                if(imgIter.hasNext()) {
                    String URL = imgIter.next();
                    Image image = new Image(URL);
                    ImageView pic = new ImageView();
                    pic.setPreserveRatio(true);
                    pic.setFitWidth(125);
                    pic.setFitHeight(250);
                    pic.setImage(image);
                    pic.setUserData(URL);
                    pic.setOnMouseClicked(event -> {
                        ProcessImage(event.getSource());
                        for (Node node : PictureGrid.getChildren()) {
                                node.setOpacity(0.2);
                        }
                        pic.setOpacity(1.0);
                    });
                    pic.setOnMouseEntered((javafx.scene.input.MouseEvent t) -> {
                        if(NodeSource != t.getSource()) {
                            if (NodeSelected) {
                                pic.setOpacity(1.0);
                            } else {
                                pic.setOpacity(0.2);
                            }
                        }
                    });

                    pic.setOnMouseExited((javafx.scene.input.MouseEvent t) -> {
                        if(NodeSource != t.getSource()) {
                            if (NodeSelected) {
                                pic.setOpacity(0.2);
                            } else {
                                pic.setOpacity(1.0);
                            }
                        }
                    });

                    PictureGrid.setHalignment(pic, HPos.CENTER);
                    PictureGrid.setValignment(pic, VPos.CENTER);
                    PictureGrid.add(pic, j, i);
                }
            }
        }
        btnUploadAppearance.setOnMouseEntered((javafx.scene.input.MouseEvent t) -> {
            if(NodeSource != t.getSource()) {
                if (NodeSelected) {
                    btnUploadAppearance.setOpacity(1.0);
                } else {
                    btnUploadAppearance.setOpacity(0.2);
                }
            }
            });

        btnUploadAppearance.setOnMouseExited((javafx.scene.input.MouseEvent t) -> {
            if(NodeSource != t.getSource()) {
                if (NodeSelected) {
                    btnUploadAppearance.setOpacity(0.2);
                } else {
                    btnUploadAppearance.setOpacity(1.0);
                }
            }
        });
    }

    @Override
    public void backFunction() {
        System.out.println("Back Test");
    }

    @Override
    public void forwardFunction() {
        try {
                Main.getDB().SaveCharacter(MyCharacter);
            }catch (Exception e){
                System.out.println(e);
            }
            Main.PrintCharacter();
    }

    @Override
    public void randomizeAll() {
        System.out.println("Rand test");
    }

    @FXML
    void uploadAppearance(ActionEvent event) {
        //choose file
            FileChooser imgPicker = new FileChooser();
            imgPicker.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("JPEG", "*.jpg, *.jpeg"),
                    new FileChooser.ExtensionFilter("PNG", "*.png")
            );
            imgPicker.setTitle("Select custom appearance");
            File file = imgPicker.showOpenDialog(new Stage());
        //handle file
            if(file != null){
                for (Node node : PictureGrid.getChildren()) {
                    node.setOpacity(0.2);
                }
                btnUploadAppearance.setOpacity(1.0);
                NodeSelected = true;
                NodeSource = event.getSource();
                MyCharacter.setCharAppearance(file.getAbsolutePath());
            }
    }

    private void ProcessImage(Object source){
        NodeSelected = true;
        NodeSource = source;
        btnUploadAppearance.setOpacity(0.2);
        String clickedImgUrl = (String)((ImageView)source).getUserData();
        MyCharacter.setCharAppearance(clickedImgUrl);
    }

}
