package Mode;

import Mode.Behavior.*;

import java.awt.*;

abstract public class Mode {
    ClickBehavior clickBehavior = new ClickThenDonothing();
    DragBehavior dragBehavior = new DragThenDonothing();
    PressBehavior pressBehavior = new PressThenDonothing();
    ReleaseBehavior releaseBehavior = new ReleaseThenDonothing();
    ModeSerial modeSerial;

    public Mode() {

    }
}
