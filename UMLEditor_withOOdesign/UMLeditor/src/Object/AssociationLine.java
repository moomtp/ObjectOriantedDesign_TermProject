package Object;

import java.awt.*;

public class AssociationLine extends LineObject{
    public AssociationLine(Port fromPort, Port toPort) {
        super(fromPort, toPort);
    }
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        // TODO : draw arrow
    }
    public void moveByOffset(Point p1, Point p2){

    }
}
