package DDCharacterCreator;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application implements ControlledScreen {
    private ScreensController myController;
    private static Character mycharacter;
    private static CharacterDatabase DB;

    //set location and names for FXML screens
    private static final String Splash = "Splash";
    private static final String SplashFile = "/Splash.fxml";
    private static final String Welcome = "Welcome";
    private static final String WelcomeFile = "/Welcome.fxml";
    private static final String AGEWEIGHTHEIGHT_MENU = "ageWeightHeight_menu";
    private static final String AGEWEIGHTHEIGHT_MENUFILE = "/ageHeightWeight_menu.fxml";
    private static final String CharAppearance = "CharAppearance";
    private static final String CharAppearanceFile = "/CharacterAppearance.fxml";

    @Override
    public void start(Stage primaryStage) {

        ScreensController mainContainer = new ScreensController();
        //load all screens in
        mainContainer.loadScreen(Main.Splash, Main.SplashFile);
            mainContainer.loadScreen(Main.Welcome, Main.WelcomeFile);
            mainContainer.loadScreen(Main.AGEWEIGHTHEIGHT_MENU, Main.AGEWEIGHTHEIGHT_MENUFILE);
            mainContainer.loadScreen(Main.CharAppearance, Main.CharAppearanceFile);

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
            mycharacter.setCharRace(Enum.Race.WOODELF);

        //Start Database
            DB = new CharacterDatabase();
            DB.OpenConnectionToDB();
            //DB.addImage("woodelf", "characters_woodelf_woodelf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/WE1.jpg");
            //DB.getImages(mycharacter);
            DB.CloseConnectionToDB();
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
