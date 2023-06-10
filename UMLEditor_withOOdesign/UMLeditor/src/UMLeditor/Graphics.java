package UMLeditor;
import Object.BaseObject;

import java.util.Vector;

public class Graphics {
    //     Singleton
    private static Vector<BaseObject> graphics;


    private Graphics(){ }

    public synchronized static Vector<BaseObject> getInstance(){
        if (graphics == null){
                graphics = new Vector<BaseObject>();
        }
        return graphics;
    }
}
