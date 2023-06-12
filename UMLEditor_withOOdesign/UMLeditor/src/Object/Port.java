package Object;

import java.awt.*;
import java.util.Vector;

public class Port {
    ShapedObject parentObj;
    Vector<LineObject> connectedLines;
    Point position = new Point();
    final int width = 10;
    final int height = 10;

    public Port(Point pos, ShapedObject parent){
        position.setLocation(pos);
        parentObj = parent;
    }

    public void draw(Graphics g){
        g.fillRect(position.x - width/2, position.y-height/2, width, height);
        // TODO: draw port
    }
    public void addNewLine(LineObject newLine){
        connectedLines.addElement(newLine);
    }
    public Point getPosition(){
        return this.position;
    }
    public void setPosition(Point p){
        this.position.setLocation(p);
    }

    public boolean inInPort(Point p){
        if (p.x > this.position.x -5 && p.x < (this.position.x + width/2) ){
            if (p.y > this.position.y-5 && p.y < (this.position.y + height/2) ){
                return true;
            }
        }
        return false;
    }
}
