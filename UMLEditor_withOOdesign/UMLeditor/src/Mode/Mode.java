package Mode;

import Mode.Behavior.*;
import Object.Port;

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

    Port prePort=null;


    public Mode() {}

    // ===========   mouse  event   =============
    public void click(Point pos){ clickBehavior.click(pos); }
    public void drag(Point pos){ dragBehavior.drag(pos); }
    public void press(Point pos){ pressBehavior.press(pos); }
    public void release(Point pos){ releaseBehavior.release(pos); }
    // ===========   state access functions  ==========
    public ModeSerial getModeSerial(){return this.modeSerial;}
    public boolean getObjectSelectedState(){return this.isObjectSelected;}
    public void setObjectSelectedState(boolean newState){this.isObjectSelected = newState;}
    public Point getPressPoint(){return this.pressPoint;}
    public void setPressPoint(Point newPos){this.pressPoint.setLocation(newPos);}
    public Port getPrePort(){return this.prePort;}
    public void setPrePort(Port newPort){this.prePort = newPort;}


}
