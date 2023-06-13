package UMLeditor.Singleton;
import Object.BaseObject;

import java.util.Vector;
import java.util.Collections;


public class CanvasMembers implements Comparable<BaseObject> {
    //     Singleton
    private static Vector<BaseObject> graphics;


    private CanvasMembers(){ }

    public synchronized static Vector<BaseObject> getInstance(){
        if (graphics == null){
                graphics = new Vector<BaseObject>();
        }
        Collections.sort(graphics);
        return graphics;
    }

    @Override
    public int compareTo(BaseObject o) {
        return -(o.getDepth());
    }
}
