package Mode.Behavior;
import UMLeditor.Singleton.*;
import Mode.Mode;
import Object.Port;
import Object.BaseObject;

import java.awt.*;
import java.util.Vector;

public class PressThenFindPort implements PressBehavior {
    @Override
    public void press(Point pos) {

        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        Mode curMode = CurMode.getInstance();


    }
}
