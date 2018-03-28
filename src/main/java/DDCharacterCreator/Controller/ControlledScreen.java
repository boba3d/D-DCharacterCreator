package DDCharacterCreator.Controller;

import DDCharacterCreator.ScreensController;

public abstract class ControlledScreen {
    private ScreensController screenParent;

    public ScreensController getScreenParent() {
        return screenParent;
    }

    public void setScreenParent(ScreensController screenParent) {
        this.screenParent = screenParent;
    }
}


