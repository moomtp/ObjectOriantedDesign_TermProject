package Object;

import java.awt.*;

public abstract class BaseObject  {
    Point curPos;
    Boolean isSelected = false;
    int depth;

    public BaseObject(Point p){
        curPos = p;
    }

    abstract public void draw(java.awt.Graphics g);

    public boolean isInObject(Point p){
        // TODO : check is p in object, default is false
        return false;
    }

    //   ==========  obj state function   ==========
    public void selectObject(){this.isSelected = true;}
    public void deselectObject(){this.isSelected = false;}
    public boolean isSelected(){return isSelected;}


    //   ============    functions percolating up from group object   ============

}
