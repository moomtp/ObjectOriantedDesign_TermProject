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
        Depth singletonDepth = new Depth();
        depth = singletonDepth.getInstance();
    }

    abstract public void draw(java.awt.Graphics g);

    // for sorting
    public int compareTo(BaseObject obj){
        return obj.getDepth() - this.depth;
    }

    public void moveByOffset(Point fromPos, Point toPos){
        int x_offset = toPos.x - fromPos.x;
        int y_offset = toPos.y - fromPos.y;

        this.curPos.setLocation(curPos.x + x_offset , curPos.y + y_offset);
    }
    //   ==========  obj state function   ==========
    public void selectObject(){this.isSelected = true;}
    public void deselectObject(){this.isSelected = false;}
    public boolean isSelected(){return isSelected;}
    public Point getCurPos(){return this.curPos;}
    public void setCurPos(Point newPos){this.curPos.setLocation(newPos);}

    public BaseObject getParentGroup(){return this.groupedBy;}
    public int getDepth(){return this.depth;}
    public void setName(String newName){this.name = newName;}


    //   ============    functions percolating up from group object and other   ============

    public boolean isInObject(Point p){ return false; }
    public Port isInport(Point pos){return null;}
    public void ungroup(){;}

}
