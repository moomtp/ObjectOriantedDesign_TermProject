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

    public Port isInport(Point pos){
        for(Port port : this.ports){
            if(port.inInPort(pos)){return port;}
        }

        return null;

    }
    public void moveByOffset(Point fromPos, Point toPos){
        int x_offset = toPos.x - fromPos.x;
        int y_offset = toPos.y - fromPos.y;

        this.curPos.setLocation(curPos.x + x_offset , curPos.y + y_offset);
    }

    //   =============   etc function    ===============
    protected void initPort(){
        this.ports =new Port[] {new Port(new Point(this.curPos.x + width/2, this.curPos.y), this),
                                new Port(new Point(this.curPos.x, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x + width, this.curPos.y + height/2), this),
                                new Port(new Point(this.curPos.x+ width/2, this.curPos.y + height), this),};
    }
    protected  void setPort(){
        this.ports[0].setPosition(new Point(this.curPos.x + width/2, this.curPos.y));
        this.ports[1].setPosition(new Point(this.curPos.x, this.curPos.y + height/2));
        this.ports[2].setPosition(new Point(this.curPos.x + width, this.curPos.y + height/2));
        this.ports[3].setPosition(new Point(this.curPos.x+ width/2, this.curPos.y + height));

    }

    protected int calStringOffset(String nameString){
        int stringLen = nameString.length();
        int wordLen = 6;
        return (stringLen * wordLen) / 2;
    }
}
