package Mode.Behavior;

import UMLeditor.Singleton.CanvasMembers;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class ReleaseThenRangeSelect implements ReleaseBehavior {
    @Override
    public Boolean release(Point pressPos, Point pos) {

        Point leftUpPos = new Point(min(pressPos.x , pos.x) ,min(pressPos.y , pos.y));
        Point RightDownPos = new Point(max(pressPos.x , pos.x) ,max(pressPos.y , pos.y));
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

        return isObjectSelected;
    }
    private boolean isInRange(Point posLow, Point posHigh, Point inputPos){
        if(inputPos.x > posLow.x && inputPos.y > posLow.y){
            if(inputPos.x < posHigh.x && inputPos.y < posHigh.y){
                return true;
            }
        }
        return false;
    }

}
