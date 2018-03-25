package DDCharacterCreator.FXML;

import DDCharacterCreator.ControlledScreen;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class selectionController extends ControlledScreen implements Initializable {

    /*
    TO DO:
    * Pre-formatting class: takes in description in attributes,
      makes them look nice
    * Sub-controllers (maybe?) -> backgroundController, classController, raceController
    * Sub-controllers auto-import data
     */

    @FXML
    public JFXButton selectBackButton, selectForwardButton, selectLeftButton, selectMiddleButton, selectRightButton;
    public JFXTextArea infoBox;

    private int selected; //The option selected
    private String[] info; //The PREFORMATTED information coinciding to the respective option.
    private String[] options; //An array of names for the options (i.e. Human, Orc, Elf)

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTestArrays();
        setSelected(0);

        selectBackButton.setOnAction(e -> setSelected(getSelected() - 1));
        selectForwardButton.setOnAction(e -> setSelected(getSelected() + 1));
    }

    /**
     * Test function.
     */
    public void printValue() {
        System.out.println("Selected: #" + getSelected() + " : " + options[getSelected()]);
    }

    private void setTestArrays() {
        info = new String[]{"Human-text", "Orc-text", "Elf-text", "Gnome-text"};
        options = new String[]{"Human", "Orc", "Elf", "Gnome"};
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
}
