package Mode.Behavior;

import Mode.Mode;
import UMLeditor.Singleton.*;
import Object.*;

import java.awt.*;
import java.util.Vector;

public class ReleaseThenTryCreateLine implements ReleaseBehavior {
    @Override
    public void release(Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();
        Port temPort = null;

        // check prePort exist
        if (curMode.getPrePort() == null){return;}

        // find port
        for(BaseObject obj : graphics){
            temPort = obj.isInport(pos);
            if(temPort != null){
                break;
            }
        }

        // check curPort exist
        if(temPort == null){return;}

        // create line
        System.out.println(graphics);
        ObjectFactory objectFactory = new ObjectFactory();
        graphics.addElement(objectFactory.createLineObject(curMode.getModeSerial(),curMode.getPrePort(),temPort ));

    }
}
