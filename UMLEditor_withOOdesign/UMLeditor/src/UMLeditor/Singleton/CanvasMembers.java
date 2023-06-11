package UMLeditor.Singleton;
import Object.BaseObject;

import java.util.Vector;

public class CanvasMembers {
    //     Singleton
    private static Vector<BaseObject> graphics;


    private CanvasMembers(){ }

    public synchronized static Vector<BaseObject> getInstance(){
        if (graphics == null){
                graphics = new Vector<BaseObject>();
        }
        return graphics;
    }
}
