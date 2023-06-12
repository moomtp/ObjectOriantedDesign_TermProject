package Mode.Behavior;
import Object.*;
import UMLeditor.Singleton.*;
import Mode.Mode;

import java.awt.*;
import java.util.Vector;


public class ClickThenCreate implements ClickBehavior {
    ObjectFactory objectFactory  = new ObjectFactory();
    public void click(Point pos) {
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();

        graphics.addElement(objectFactory.createObject(curMode.getModeSerial(), pos));
    }
}
