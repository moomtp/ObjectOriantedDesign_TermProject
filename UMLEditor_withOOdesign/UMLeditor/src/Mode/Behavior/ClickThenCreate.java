package Mode.Behavior;
import Mode.ModeSerial;
import Object.*;
import UMLeditor.Singleton.Graphics;

import java.awt.*;
import java.util.Vector;


public class ClickThenCreate implements ClickBehavior {
    ObjectFactory objectFactory  = new ObjectFactory();
    public void click(Point pos, ModeSerial modeSerial) {
        Vector<BaseObject> graphics = Graphics.getInstance();
        graphics.addElement(objectFactory.createObject(modeSerial, pos));

    }
}
