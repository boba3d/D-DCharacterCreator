package DDCharacterCreator;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.File;


public class Main extends Application {
    public static Character mycharacter;
    private static CharacterDatabase DB;

    @Override
    public void start(Stage primaryStage) {

        //initialize character
            mycharacter = new Character();
            mycharacter.setCharSkills(new CharacterSkills());
        //Start Database
           /* DB = new CharacterDatabase();
            DB.OpenConnectionToDB();*/
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
        FileChooser fc = new FileChooser();
        fc.setTitle("Save the Character Sheet");
        File f = fc.showSaveDialog(null);
        print.printChar(mycharacter, f == null ? null : f.toString());
        //DB.CloseConnectionToDB();
    }

}
