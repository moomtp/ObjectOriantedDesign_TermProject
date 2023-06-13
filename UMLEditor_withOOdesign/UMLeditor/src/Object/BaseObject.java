package Object;
import UMLeditor.Singleton.*;

import java.awt.*;

public abstract class BaseObject implements Comparable<BaseObject> {
    Point curPos;
    Boolean isSelected = false;
    int depth;
    int width = 0;
    int height = 0;
    String name = "";
    BaseObject groupedBy = null;

    public BaseObject(Point p){
        curPos = p;
        Depth SingletonDepth = new Depth();
        depth = SingletonDepth.getInstance();
    }

    abstract public void draw(java.awt.Graphics g);

    public int compareTo(BaseObject obj){
        return obj.getDepth() - this.depth;
    }

    //   ==========  obj state function   ==========
    public void selectObject(){this.isSelected = true;}
    public void deselectObject(){this.isSelected = false;}
    public boolean isSelected(){return isSelected;}
    public Point getCurPos(){return this.curPos;}
    public void setCurPos(Point newPos){this.curPos.setLocation(newPos);}
    public void moveByOffset(Point fromPos, Point toPos){
        int x_offset = toPos.x - fromPos.x;
        int y_offset = toPos.y - fromPos.y;

        this.curPos.setLocation(curPos.x + x_offset , curPos.y + y_offset);
    }
    public BaseObject getParentGroup(){return this.groupedBy;}
    public int getDepth(){return this.depth;}


    //   ============    functions percolating up from group object and other   ============

    public boolean isInObject(Point p){ return false; }
    public Port isInport(Point pos){return null;}
    public void ungroup(){;}

}
