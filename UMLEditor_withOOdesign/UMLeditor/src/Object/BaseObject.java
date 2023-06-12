package Object;

import java.awt.*;

public abstract class BaseObject  {
    Point curPos;
    Boolean isSelected = false;
    int depth;
    int width = 0;
    int height = 0;
    String name = "";

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
    public Point getCurPos(){return this.curPos;}
    public void setCurPos(Point newPos){this.curPos.setLocation(newPos);}
    public void moveByOffset(Point fromPos, Point toPos){
        int x_offset = fromPos.x - toPos.x;
        int y_offset = fromPos.y - toPos.y;

        this.curPos.setLocation(curPos.x + x_offset , curPos.y + y_offset);
    }


    //   ============    functions percolating up from group object   ============

}
