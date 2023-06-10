package UMLeditor.Singleton;
import Mode.*;

public class CurMode {
    private static Mode curMode;

    private CurMode(){}

    public synchronized static Mode getInstance(){
        if(curMode == null){
            curMode = new Mode();
        }
        return curMode;
    }

    public synchronized static void setInstance(Mode newMode){
        curMode = newMode;
    }

}
