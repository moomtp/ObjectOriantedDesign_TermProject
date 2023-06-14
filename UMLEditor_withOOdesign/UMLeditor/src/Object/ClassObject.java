package Object;

import java.awt.*;

public class ClassObject extends ShapedObject{
    public ClassObject(Point p) {
        super(p);
        this.width = 120;
        this.height = 60;
        initPort();
    }

    @Override
    public void draw(Graphics g) {
        if(this.isSelected()){
            for(Port port : this.ports){port.draw(g);}
        }
        else {g.setColor(Color.BLACK);}
        int stringOffset = calStringOffset(this.name);
        g.drawString(this.name, this.curPos.x + width/2 - stringOffset , this.curPos.y + height/4);
        g.drawRect(this.curPos.x, this.curPos.y, width, height);
        g.drawLine(this.curPos.x, this.curPos.y + height/3, this.curPos.x + width, this.curPos.y + height/3);
        g.drawLine(this.curPos.x, this.curPos.y + height * 2/3, this.curPos.x + width, this.curPos.y + height * 2/3);
    }

    @Override
    public void moveByOffset(Point fromPos, Point toPos){
        super.moveByOffset(fromPos, toPos);
        setPort();
    }



    //  ==============   etc function    ================

}
