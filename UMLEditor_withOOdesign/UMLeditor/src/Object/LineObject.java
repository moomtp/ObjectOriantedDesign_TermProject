package Object;

import java.awt.*;

public class LineObject extends BaseObject {
    Port fromPort;
    Port toPort;
    public LineObject(Port fPort, Port tPort) {
        super(fPort.getPosition());
        this.fromPort = fPort;
        this.toPort = tPort;

    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(fromPort.getPosition().x, fromPort.getPosition().y, toPort.getPosition().x, toPort.getPosition().y);

    }


}
