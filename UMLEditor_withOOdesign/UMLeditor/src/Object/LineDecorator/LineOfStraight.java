package Object.LineDecorator;


import Object.Port;
import Object.LineObject;

import java.awt.*;

public class LineOfStraight extends LineObject {
    LineObject innerLineObj;

    public LineOfStraight(Port fPort, Port tPort) {
        super(fPort , tPort);
    }


    @Override
    public void draw(Graphics g){
        g.drawLine(this.getFromPort().getPosition().x, this.getFromPort().getPosition().y, this.getToPort().getPosition().x, this.getToPort().getPosition().y);
    };

}
