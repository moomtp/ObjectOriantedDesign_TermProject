package Mode.Behavior;

import UMLeditor.Singleton.CanvasMembers;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

public class PressThenCheckPos implements PressBehavior {
    @Override
    public Boolean press(Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        for(BaseObject obj : graphics){
            if(obj.isInObject(pos)){obj.selectObject(); return true;}
            else obj.deselectObject();

        }
        return false;
    }
}
