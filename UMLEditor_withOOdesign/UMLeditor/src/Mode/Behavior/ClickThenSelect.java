package Mode.Behavior;

import Object.BaseObject;
import Mode.Mode;
import UMLeditor.Singleton.*;

import java.awt.*;
import java.util.Vector;

public class ClickThenSelect implements ClickBehavior{

    public void click(Point pos) {

        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();


        for(BaseObject obj : graphics){
            if(obj.isInObject(pos)){
                obj.selectObject();
                curMode.setObjectSelectedState(true);
                return;
            }
            else obj.deselectObject();
        }
        curMode.setObjectSelectedState(false);

    }
}
