package Object;

import java.awt.*;

public class ShapedObject extends BaseObject{
    Port[] ports;


    protected ShapedObject(Point p){
        super(p);
    }
    @Override
    public void draw(Graphics canvas) {

    }

    //   =============   etc function    ===============
    protected void initPort(){
        this.ports =new Port[] {new Port(new Point(this.curPos.x + width/2, this.curPos.y), this),
                                new Port(new Point(this.curPos.x, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x + width, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x+ width/2, this.curPos.y + height), this),};
    }
}
