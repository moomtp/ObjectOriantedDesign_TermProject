package Mode;

import Mode.Behavior.ClickThenCreate;

public class UsecaseObjectMode extends Mode {
    public UsecaseObjectMode(){
        modeSerial = ModeSerial.useOBJECT;
        clickBehavior = new ClickThenCreate();
    }
}
