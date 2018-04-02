package DDCharacterCreator;



import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    private ScreensController screensController;
    private static Character mycharacter;
    private static CharacterDatabase DB;

    @Override
    public void start(Stage primaryStage) {

        //initialize character
            mycharacter = new Character();
            mycharacter.setCharSkills(new CharacterSkills());
            mycharacter.setCharRace(Enum.Race.WOODELF);

        //Start Database
            DB = new CharacterDatabase();
            DB.OpenConnectionToDB();
            //DB.addImage("woodelf", "characters_woodelf_woodelf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/WE1.jpg");
            //DB.CloseConnectionToDB();
        //print character
        //PrintCharacter();
        screensController = new ScreensController(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Character getChar(){
        return mycharacter;
    }
    public static CharacterDatabase getDB(){
        return DB;
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
