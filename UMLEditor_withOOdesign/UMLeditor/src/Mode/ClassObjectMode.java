package Mode;

import Mode.Behavior.ClickThenCreate;

import java.awt.*;

public class ClassObjectMode extends Mode {

    public ClassObjectMode(){
        modeSerial = ModeSerial.claOBJECT;
        clickBehavior = new ClickThenCreate();
    }
}
