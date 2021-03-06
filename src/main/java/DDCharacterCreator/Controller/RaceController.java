package DDCharacterCreator.Controller;

import DDCharacterCreator.Enum;
import DDCharacterCreator.Main;
import DDCharacterCreator.Utilities.Randomizer;
import DDCharacterCreator.ScreensController;
import DDCharacterCreator.Utilities.Format;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class RaceController extends ControlledScreen implements Initializable, MenuController {

    /*
    TODO:
    * Pre-formatting class: takes in description in attributes,
      makes them look nice
    * Sub-controllers (maybe?) -> backgroundController, classController, raceController
    * Sub-controllers auto-import data
    * Select the correct race when the race has already been selected
    * Choose an option that's not the middle
     */

    @FXML
    public JFXButton selectBackButton, selectForwardButton, selectLeftButton, selectMiddleButton, selectRightButton;
    public JFXTextArea infoBox;

    private int selected; //The option selected
    private String[] info; //The PREFORMATTED information coinciding to the respective option.
    private String[] options; //An array of names for the options (i.e. Human, Orc, Elf)
    private boolean disableRandom;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[][] enumArray = Format.formatRaceEnum();
        setOptions(enumArray[0]);
        setInfo(enumArray[1]);
        setSelected(0);

        selectBackButton.setOnAction(e -> setSelected(getSelected() - 1));
        selectForwardButton.setOnAction(e -> setSelected(getSelected() + 1));

        // We need this for the character name random button..
        // If it has already been selected, disable random and display the choice
        if (Main.getChar().getCharRace() != null) {
            disableRandom = true;
            setSelected(getSelected(Main.getChar().getCharRace()));
        }
        // TODO disable the randomize button
    }

    @Override
    public void forwardFunction() {
        Main.getChar().setCharRace(Enum.Race.valueOf(options[getSelected()].toUpperCase().replace(" ", "")));
        Enum.checkRace(Main.getChar());
        getScreenParent().setScene(ScreensController.BACKGROUND);
    }

    @Override
    public void randomizeAll() {
        //if(!disableRandom)
            randomizeRace();
    }

    public void randomizeRace(){
        Enum.Race r = Randomizer.getCharRace();
        setSelected(getSelected(r));
    }

    private int getSelected(Enum.Race r) {
        int a = 0;
        for(int i = 0; i < options.length; i++)
            if (options[i].equals(r.toString())) {
                a = i;
            }
        return a;

    }

    /* GETTERS */

    public int getSelected() {
        return selected;
    }

    /* SETTERS */

    public void setInfo(String[] info) {
        this.info = info;
    }

    public void setInfoBoxText(String text) {
        infoBox.setText(text);
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    /**
     * Sets the current selection (middle button) to option.
     * Corrects itself if input is out of Array range.
     *
     * @param option The value of the desired selection
     */
    public void setSelected(int option) {
        if (option < 0)
            option = options.length - 1;
        else if (option >= options.length)
            option = 0;

        if (option < options.length) {
            if (option - 1 < 0)
                selectLeftButton.setText(options[options.length - 1]);
            else
                selectLeftButton.setText(options[option - 1]);

            selectMiddleButton.setText(options[option]);
            setInfoBoxText(info[option]);

            if (option + 1 >= options.length)
                selectRightButton.setText(options[0]);
            else
                selectRightButton.setText(options[option + 1]);

            selected = option;
        }
    }

    /**
     * Iterates to the current selection - 1.
     */
    public void setSelectedBack() {
        setSelected(getSelected() - 1);
    }

    /**
     * Iterates to the current selection + 1.
     */
    public void setSelectedForward() {
        setSelected(getSelected() + 1);
    }
}
