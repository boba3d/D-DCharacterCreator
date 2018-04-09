package DDCharacterCreator;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    public static Character mycharacter;
    private static CharacterDatabase DB;

    @Override
    public void start(Stage primaryStage) {

        //initialize character
            mycharacter = new Character();
            mycharacter.setCharSkills(new CharacterSkills());
        //Start Database
            DB = new CharacterDatabase();
            DB.OpenConnectionToDB();
        new ScreensController(primaryStage);

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
        print.printChar(mycharacter, null);
        DB.CloseConnectionToDB();
    }

}
