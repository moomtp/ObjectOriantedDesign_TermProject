package Object.LineDecorator;


import Object.LineObject;
import Object.Port;

import java.awt.*;

public class LineOfBroken extends LineObject {
    LineObject innerLineObj;

    public LineOfBroken(Port fPort, Port tPort) {
        super(fPort , tPort);
    }

    @Override
    public void draw(Graphics g){

        Point fromPos = fromPort.getPosition();
        Point toPos = toPort.getPosition();
        // TODO : cal points of slash
        Point tmpPoint1 = new Point((fromPos.x + toPos.x)/2,fromPos.y);
        Point tmpPoint2 = new Point((fromPos.x + toPos.x)/2,toPos.y);

        // TODO : draw from fp to p1, p1 to p2 , p2 to tp
        g.drawLine(fromPos.x, fromPos.y, tmpPoint1.x, tmpPoint1.y);
        g.drawLine(tmpPoint1.x, tmpPoint1.y,tmpPoint2.x, tmpPoint2.y);
        g.drawLine(tmpPoint2.x, tmpPoint2.y,toPos.x, toPos.y);
    };

}
