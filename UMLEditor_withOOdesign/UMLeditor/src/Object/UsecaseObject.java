package Object;

import java.awt.*;

public class UsecaseObject extends ShapedObject {
    public UsecaseObject(Point p) {
        super(p);
        this.width = 120;
        this.height = 60;
        initPort();
    }

    @Override
    public void draw(Graphics g) {
        // check port is visible
        if(this.isSelected()){
            for(Port port : this.ports){port.draw(g);}
        }
        else {g.setColor(Color.BLACK);}

        // print string
        int stringOffset = calStringOffset(this.name);
        g.drawString(this.name, this.curPos.x + width/2 - stringOffset , this.curPos.y + height/2);

        // print oval
        g.drawOval(this.curPos.x, this.curPos.y, width, height);
    }

    @Override
    public void moveByOffset(Point fromPos, Point toPos){
        super.moveByOffset(fromPos, toPos);
        setPort();
    }
}
