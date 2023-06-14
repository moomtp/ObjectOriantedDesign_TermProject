package Mode;

import Mode.Behavior.PressThenFindPort;
import Mode.Behavior.ReleaseThenTryCreateLine;

public class CompositionLineMode extends Mode {
    public CompositionLineMode(){
        modeSerial = ModeSerial.comLINE;
        this.pressBehavior = new PressThenFindPort();
        this.releaseBehavior = new ReleaseThenTryCreateLine();
    }
}
