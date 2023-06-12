package Mode;

import Mode.Behavior.ClickThenCreate;
import Mode.Behavior.PressThenFindPort;
import Mode.Behavior.ReleaseThenTryCreateLine;

import java.awt.*;

public class AssociateLineMode extends Mode {
    public AssociateLineMode(){
        modeSerial = ModeSerial.assLINE;
        this.pressBehavior = new PressThenFindPort();
        this.releaseBehavior = new ReleaseThenTryCreateLine();
    }

    @Override
    public void press(Point pos) {

    }

    @Override
    public void release(Point pos){

    }
}
