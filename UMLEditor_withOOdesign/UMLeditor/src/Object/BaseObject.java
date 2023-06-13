package Object;
import javax.swing.*;
import java.awt.*;

public abstract class BaseObject extends JComponent  {
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
    public void paintComponent(Graphics g) {
    }

    //   ==========  obj state function   ==========
    public void selectObject(){this.isSelected = true;}
    public void deselectObject(){this.isSelected = false;}
    public boolean isSelected(){return isSelected;}


    //   ============    functions percolating up from group object   ============

}
