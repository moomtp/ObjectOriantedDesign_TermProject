package Mode.Behavior;

import Mode.Mode;
import UMLeditor.Singleton.*;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

public class ReleaseThenMoveObject implements ReleaseBehavior {
    @Override
    public void release(Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();

        for(BaseObject obj : graphics){
            if(obj.isSelected()){obj.moveByOffset(curMode.getPressPoint(), pos); }
            else obj.deselectObject();
        }
    }


}
