package DDCharacterCreator;

import DDCharacterCreator.Controller.ControlledScreen;
import DDCharacterCreator.Controller.MenuController;
import DDCharacterCreator.Controller.NavigationMenuController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;


public class ScreensController {

    //Holds the screens to be displayed
    private HashMap<String, String> screens;

    //The stage our ScreensController works on
    //Should be primaryStage from Main.java in this instance
    private Stage stage;

    //Set location and names for Controller screens
    //Names are public, so they may be easily accessed outside this class
    //Pathnames are private, because this class is the only one accessing them
    public static final String AGEWEIGHTHEIGHT = "AgeHeightWeight";
    private final String AGEWEIGHTHEIGHTFILE = "/FXML/AgeHeightWeight.fxml";
    public static final String CHARAPPEARANCE = "CharAppearance";
    private final String CHARAPPEARANCEFILE = "/FXML/CharacterAppearance.fxml";
    public static final String LEVEL = "Level";
    private final String LEVELFILE = "/FXML/Level.fxml";
    private final String MENUFILE = "/FXML/Menu.fxml"; //MENU not included, don't want to load just the UI by itself
    public static final String NAME = "Name";
    private final String NAMEFILE = "/FXML/Name.fxml";
    public static final String SELECTION = "Selection";
    private final String SELECTIONFILE = "/FXML/Selection.fxml";
    public static final String SPLASH = "Splash";
    private final String SPLASHFILE = "/FXML/Splash.fxml";
    public static final String WELCOME = "Welcome";
    private final String WELCOMEFILE = "/FXML/Welcome.fxml";

    //Icon image
    private static final String ICONFILE = "/SplashPicture.png";

    //First scene to display
    private static final String FIRSTSCENE = CHARAPPEARANCE;

    ScreensController(Stage stage) {
        this.stage = stage;
        screens = new HashMap<>();

        //Put constant names with constant pathnames into HashMap
        addScene(AGEWEIGHTHEIGHT, AGEWEIGHTHEIGHTFILE);
        addScene(CHARAPPEARANCE, CHARAPPEARANCEFILE);
        addScene(LEVEL, LEVELFILE);
        addScene(NAME, NAMEFILE);
        addScene(SELECTION, SELECTIONFILE);
        addScene(SPLASH, SPLASHFILE);
        addScene(WELCOME, WELCOMEFILE);

        stage.setTitle("D&D character creator");
        stage.getIcons().add(new Image(ICONFILE));

        setScene(FIRSTSCENE);

        stage.show();
    }

    /**
     * Adds a new mapping using name as a key to its pathname.
     *
     * @param name     The key value, or name of the scene.
     * @param pathname The pathname of the scene.
     */
    private void addScene(String name, String pathname) {
        screens.put(name, pathname);
    }

    //Returns the pathname to the corresponding name
    public String getScene(String name) {
        return screens.get(name);
    }

    /**
     * Sets the current scene corresponding to input name.
     *
     * @param name The name of the scene in the HashMap
     * @return True if successfully loaded, false if exception thrown.
     */
    public boolean setScene(String name) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getScene(name)));
            Parent root = fxmlLoader.load(); //Load the scene first so we may check its inheritance

            if (fxmlLoader.getController() instanceof MenuController) { //If it is a MenuController (uses the UI)
                FXMLLoader fxmlLoaderMenu = new FXMLLoader(getClass().getResource(MENUFILE));
                root = fxmlLoaderMenu.load(); //Load the menu scene and set it as the root
                NavigationMenuController nMC = fxmlLoaderMenu.getController(); //Get the menu's controller
                nMC.setNodeFXMLLoader(new FXMLLoader(getClass().getResource(getScene(name)))); //Pass the scene's FXMLLoader
                nMC.setScreenParent(this); //Set the screenParent of both the menu and the scene to this one
            } else {
                ((ControlledScreen) fxmlLoader.getController()).setScreenParent(this); //Set the screenParent of the scene to this one
            }

            stage.setScene(new Scene(root, 600, 400)); //Finally, set the current scene in the stage to our root
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
