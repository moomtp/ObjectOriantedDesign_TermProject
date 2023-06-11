package Object;

import java.awt.*;
import java.util.Vector;

public class Port {
    ShapedObject parentObj;
    Vector<LineObject> connectedLines;
    Point position = new Point();

    public Port(Point pos, ShapedObject parent){
        position.setLocation(pos);
        parentObj = parent;
    }

    public void draw(){
        // TODO: draw port
    }
    public void addNewLine(LineObject newLine){
        connectedLines.addElement(newLine);
    }
    public Point getPosition(){
        return position;
    }
    public void setPosition(Point p){
        this.position.setLocation(p);
    }

    public boolean inInPort(Point p){
        // TODO : judge if p in Port
        return false;
    }
}
