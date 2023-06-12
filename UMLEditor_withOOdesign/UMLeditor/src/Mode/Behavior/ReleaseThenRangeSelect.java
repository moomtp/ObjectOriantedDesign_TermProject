package Mode.Behavior;

import Mode.Mode;
import UMLeditor.Singleton.*;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class ReleaseThenRangeSelect implements ReleaseBehavior {
    @Override
    public void release(Point pos) {
        Mode curMode = CurMode.getInstance();

        Point leftUpPos = new Point(min(curMode.getPressPoint().x , pos.x) ,min(curMode.getPressPoint().y , pos.y));
        Point RightDownPos = new Point(max(curMode.getPressPoint().x , pos.x) ,max(curMode.getPressPoint().y , pos.y));
        Boolean isObjectSelected = false;

        Vector<BaseObject> graphics = CanvasMembers.getInstance();

        for(BaseObject obj : graphics){
            if(isInRange(leftUpPos, RightDownPos, obj.getCurPos())){
                obj.selectObject();
                isObjectSelected = true;
            }
            else {
                obj.deselectObject();
            }
        }

        curMode.setObjectSelectedState(isObjectSelected);
    }
    // =========== private function
    private boolean isInRange(Point posLow, Point posHigh, Point inputPos){
        if(inputPos.x > posLow.x && inputPos.y > posLow.y){
            if(inputPos.x < posHigh.x && inputPos.y < posHigh.y){
                return true;
            }
        }
        return false;
    }

}
