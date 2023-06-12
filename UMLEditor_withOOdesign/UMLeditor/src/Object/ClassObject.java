package Object;

import java.awt.*;

public class ClassObject extends ShapedObject{
    public ClassObject(Point p) {
        super(p);
        this.width = 100;
        this.height = 90;
        initPort();
    }

    @Override
    public void draw(Graphics g) {
        if(this.isSelected()){
            for(Port port : this.ports){port.draw(g);}
        }
        else {g.setColor(Color.BLACK);}
        g.drawRect(this.curPos.x, this.curPos.y, width, height);
    }

    @Override
    public void moveByOffset(Point fromPos, Point toPos){
        super.moveByOffset(fromPos, toPos);
        setPort();
    }



    //  ==============   etc function    ================
}
