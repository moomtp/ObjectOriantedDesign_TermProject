package Object;

import javax.sound.sampled.Line;
import java.awt.*;

public abstract class LineObject extends BaseObject {
    protected Port fromPort;
    protected Port toPort;
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


    // ==========  state function  ===========
    public Port getFromPort(){return fromPort;}
    public Port getToPort(){return toPort;}


}
