package DDCharacterCreator;


import com.couchbase.lite.Context;
import com.couchbase.lite.JavaContext;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application implements ControlledScreen {
    ScreensController myController;
    Character mycharacter;
    Database DB;
    Context context;

    //set location and names for FXML screens
        public static String Welcome = "Welcome";
        public static String WelcomeFile = "/Welcome.fxml";

    @Override
    public void start(Stage primaryStage) {

        ScreensController mainContainer = new ScreensController();
        //load all screens in
            mainContainer.loadScreen(Main.Welcome, Main.WelcomeFile);

        //set first screen
        mainContainer.setScreen(Main.Welcome);
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle(" D&D character creator");
        //add icon if wanted
        //primaryStage.getIcons().add(new Image("https://ae01.alicdn.com/kf/HTB1Dbv8HFXXXXXNaFXXq6xXFXXXd/22-5CM-PLANE-SILHOUETTE-Car-Sticker-Decal-Cartoon-Plane-Motorcycle-Car-Styling-Black-Silver-C2-0193.jpg"));
        primaryStage.show();

        //initialize character
            mycharacter = new Character();
            mycharacter.setCharSkills(new CharacterSkills());


        //Start Database
            DB = new Database();
            //context = new JavaContext("Data");
            //DB.StartDatabase(context);
        //print character
            Print print = new Print();
            testChar();
            print.printChar(mycharacter);
    }


    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void testChar(){
        mycharacter.setCharName("Test");
        mycharacter.setCharAge(20);
        mycharacter.setCharPlayerName("DDGroup");
    }
}
