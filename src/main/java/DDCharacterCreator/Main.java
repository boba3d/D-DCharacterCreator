package DDCharacterCreator;


import com.couchbase.lite.Context;
import com.couchbase.lite.JavaContext;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application implements ControlledScreen {
    ScreensController myController;
    static Character mycharacter;
    static CharacterDatabase DB;
    Context context;

    //set location and names for FXML screens
    private static final String Splash = "Splash";
    private static final String SplashFile = "/Splash.fxml";
    private static final String Welcome = "Welcome";
    private static final String WelcomeFile = "/Welcome.fxml";
    private static final String AGEWEIGHTHEIGHT_MENU = "ageWeightHeight_menu";
    private static final String AGEWEIGHTHEIGHT_MENUFILE = "/ageHeightWeight_menu.fxml";

    @Override
    public void start(Stage primaryStage) {

        ScreensController mainContainer = new ScreensController();
        //load all screens in
        mainContainer.loadScreen(Main.Splash, Main.SplashFile);
            mainContainer.loadScreen(Main.Welcome, Main.WelcomeFile);
            mainContainer.loadScreen(Main.AGEWEIGHTHEIGHT_MENU, Main.AGEWEIGHTHEIGHT_MENUFILE);

        //set first screen
        mainContainer.setScreen(Main.Splash);
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle(" D&D character creator");
        //add icon if wanted
        primaryStage.getIcons().add(new Image("/SplashPicture.png"));
        primaryStage.show();

        //initialize character
            mycharacter = new Character();
            mycharacter.setCharSkills(new CharacterSkills());


        //Start Database
            DB = new CharacterDatabase();
            //context = new JavaContext("Data");
            //DB.StartDatabase(context);
        //print character

    }


    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Character getChar(){
        return mycharacter;
    }
    static public void PrintCharacter(){
        Print print = new Print();
        mycharacter.setCharName("Dungeon master");
        mycharacter.setCharPlayerName("DDGroup");
        mycharacter.setCharHitDice(+10);
        mycharacter.setCharRace(Enum.Race.DRAGONBORN);
        print.printChar(mycharacter, DB);
    }
}
