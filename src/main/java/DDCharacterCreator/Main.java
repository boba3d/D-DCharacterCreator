package DDCharacterCreator;



import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    private ScreensController screensController;
    private static Character mycharacter;
    private static CharacterDatabase DB;

    @Override
    public void start(Stage primaryStage) {
        /*
        TO DO: DELETE CODE SOON

        ScreensControllerOld mainContainer = new ScreensControllerOld();
        //load all screens in
        mainContainer.setScreen(Main.Splash, Main.SplashFile);
        mainContainer.setScreen(Main.Welcome, Main.WelcomeFile);
        mainContainer.setScreen(Main.AGEWEIGHTHEIGHT_MENU, Main.AGEWEIGHTHEIGHT_MENUFILE);
        mainContainer.setScreen(Main.LEVEL_MENU, Main.LEVEL_MENUFILE);
        mainContainer.setScreen(Main.CharAppearance, Main.CharAppearanceFile);
        mainContainer.setScreen(Main.NAME_MENU, Main.NAME_MENUFILE);
        mainContainer.setScreen(Main.SELECTION_MENU, Main.SELECTION_MENUFILE);

        //set first screen
        mainContainer.setScreen(Main.Splash);
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("D&D character creator");
        primaryStage.show();
        */

        screensController = new ScreensController(primaryStage);

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
