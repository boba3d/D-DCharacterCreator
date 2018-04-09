package DDCharacterCreator.Controller;

import DDCharacterCreator.ScreensController;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class NavigationMenuController extends ControlledScreen {

    @FXML
    public BorderPane borderPane;
    public JFXButton forwardButton, randomButton;

    private FXMLLoader nodeFXMLLoader;
    private MenuController nodeController;

    @Override //So the scene inside Menu may have access in its controller
    public void setScreenParent(ScreensController screenParent) {
        super.setScreenParent(screenParent);
        if (nodeController != null && nodeController instanceof ControlledScreen)
            ((ControlledScreen) nodeController).setScreenParent(screenParent);
    }

    /**
     * Opens the navigation bar drawer.
     */
    public void openNavBar() {
        System.out.println("Hamburger test");
    }

    /**
     * Takes an (unloaded) FXMLLoader as input, loads it, centers the loaded scene
     * into the menu and extracts navigation functions.
     *
     * @param nodeFXMLLoader
     * @throws IOException
     */
    public void setNodeFXMLLoader(FXMLLoader nodeFXMLLoader) throws IOException {
        this.nodeFXMLLoader = nodeFXMLLoader; //Allows us to access the FXMLLoader
        borderPane.setCenter(this.nodeFXMLLoader.load()); //Loads the scene, simultaneously putting it in the menu scene
        nodeController = this.nodeFXMLLoader.getController(); //Gives access to the controller of the scene without typing a paragraph
        //backButton.setOnAction(f -> nodeController.backFunction()); //Sets the backButton function
        forwardButton.setOnAction(f -> nodeController.forwardFunction()); //Sets the forwardButton function
        randomButton.setOnAction(f -> nodeController.randomizeAll()); // Sets the randomButton function
    }
}
