package DDCharacterCreator.Controller;

/**
 * An interface requiring the implementation of navigation back and forward functions,
 * plus requiring a randomize all function.
 */
public interface MenuController {

    /**
     * The designated function to be called when forwardButton is pressed.
     */
    void forwardFunction();

    /**
     * The designated function to be called in order to randomize
     * everything on the current page.
     */
    void randomizeAll();


}
