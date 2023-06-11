package Mode;

import Mode.Behavior.*;

public class SelectMode extends Mode{
        public SelectMode(){
        modeSerial = ModeSerial.SELECT;
        clickBehavior = new ClickThenSelect();
        pressBehavior = new PressThenRecordPos();
        releaseBehavior = new ReleaseThenRangeSelect();
    }
}
