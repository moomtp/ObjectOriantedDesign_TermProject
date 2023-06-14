package Mode;

import Mode.Behavior.PressThenFindPort;
import Mode.Behavior.ReleaseThenTryCreateLine;

public class GenerlizationLineMode extends Mode {

    public GenerlizationLineMode(){
        modeSerial = ModeSerial.genLINE;
        this.pressBehavior = new PressThenFindPort();
        this.releaseBehavior = new ReleaseThenTryCreateLine();
    }
}
