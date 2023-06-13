package UMLeditor.Singleton;

public class Depth {
    private static int depth = -1;

    public Depth(){};
    public synchronized static int getInstance(){
            depth++;
            return depth;
        }
    }

