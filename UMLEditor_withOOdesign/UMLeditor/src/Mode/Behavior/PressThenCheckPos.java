package Mode.Behavior;

import UMLeditor.Singleton.*;
import Object.BaseObject;
import Mode.Mode;

import java.awt.*;
import java.util.Vector;

public class PressThenCheckPos implements PressBehavior {
    @Override
    public void press(Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();

        curMode.setPressPoint(pos);
        boolean isSelectedObjectFound = false;

        for(BaseObject obj : graphics){
            if(obj.isInObject(pos)){
                isSelectedObjectFound = true;
            }
        }
        curMode.setObjectSelectedState(isSelectedObjectFound);
    }
}
