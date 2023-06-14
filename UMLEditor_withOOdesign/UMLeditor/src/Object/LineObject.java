package Object;

import javax.sound.sampled.Line;
import java.awt.*;

public class LineObject extends BaseObject {
    Port fromPort;
    Port toPort;
    public LineObject(Port fPort, Port tPort) {
        super(fPort.getPosition());
        this.fromPort = fPort;
        this.toPort = tPort;

    }
    // used for decorator
    public LineObject(LineObject lineObject) {
        super(lineObject.getCurPos());
        this.fromPort = lineObject.fromPort;
        this.toPort = lineObject.toPort;
    }

    @Override
    public void draw(Graphics g) {

    }
    // ==========  state function  ===========
    public Port getFromPort(){return fromPort;}
    public Port getToPort(){return toPort;}


}
