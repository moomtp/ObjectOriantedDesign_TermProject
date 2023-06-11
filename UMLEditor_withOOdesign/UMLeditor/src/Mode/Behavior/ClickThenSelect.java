package Mode.Behavior;

import Mode.ModeSerial;
import Object.BaseObject;
import UMLeditor.Singleton.CanvasMembers;

import java.awt.*;
import java.util.Vector;

public class ClickThenSelect implements ClickBehavior{

    public void click(Point pos, ModeSerial modeSerial) {

        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        for(BaseObject obj : graphics){
            if(obj.isInObject(pos)){obj.selectObject();}
            else obj.deselectObject();
        }
    }
}
