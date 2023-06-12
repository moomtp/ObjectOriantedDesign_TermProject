package Object;

import java.awt.*;

public class ShapedObject extends BaseObject{
    Port[] ports;
    Point clickPos;


    protected ShapedObject(Point p){
        super(p);
    }
    @Override
    public void draw(Graphics canvas) {

    }
    @Override
    public boolean isInObject(Point pos){
        if (pos.x > this.curPos.x && pos.x < (this.curPos.x + width) ){
            if (pos.y > this.curPos.y && pos.y < (this.curPos.y + height) ){
                return true;
            }
        }
        return false;
    }

    //   =============   etc function    ===============
    protected void initPort(){
        this.ports =new Port[] {new Port(new Point(this.curPos.x + width/2, this.curPos.y), this),
                                new Port(new Point(this.curPos.x, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x + width, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x+ width/2, this.curPos.y + height), this),};
    }
}
