package Object.LineDecorator;


import Object.BaseObject;
import Object.LineObject;

import java.awt.*;

public abstract class LineOfStraight extends LineObject {
    LineObject innerLineObj;
    public LineOfStraight(LineObject newLine ){
        super(newLine);
        innerLineObj = newLine;
    }


    @Override
    public void draw(Graphics g){
        innerLineObj.draw(g);
        g.drawLine(this.getFromPort().getPosition().x, this.getFromPort().getPosition().y, this.getToPort().getPosition().x, this.getToPort().getPosition().y);
    };

}
