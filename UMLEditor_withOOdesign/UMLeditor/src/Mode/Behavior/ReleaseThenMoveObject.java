package Mode.Behavior;

import UMLeditor.Singleton.CanvasMembers;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

public class ReleaseThenMoveObject implements ReleaseBehavior {
    @Override
    public Boolean release(Point pressPos, Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();

        for(BaseObject obj : graphics){
            if(obj.isSelected()){obj.moveByOffset(pressPos, pos); }
            else obj.deselectObject();
        }
        return false;
    }


}
