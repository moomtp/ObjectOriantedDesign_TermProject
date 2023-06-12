package Mode;

import Mode.Behavior.*;

import java.awt.*;

// not abstract as if no mode been selected
public class Mode {
    ClickBehavior clickBehavior = new ClickThenDonothing();
    DragBehavior dragBehavior = new DragThenDonothing();
    PressBehavior pressBehavior = new PressThenDonothing();
    ReleaseBehavior releaseBehavior = new ReleaseThenDonothing();
    ModeSerial modeSerial;
    boolean isObjectSelected = false;

    Point pressPoint = new Point();


    public Mode() {}

    public void click(Point pos){ clickBehavior.click(pos, modeSerial); }
    public void drag(Point pos){ dragBehavior.drag(pressPoint, pos); }
    public void press(Point pos){ isObjectSelected = pressBehavior.press(pos); }
    public void release(Point pos){ releaseBehavior.release(pressPoint, pos); }

}
