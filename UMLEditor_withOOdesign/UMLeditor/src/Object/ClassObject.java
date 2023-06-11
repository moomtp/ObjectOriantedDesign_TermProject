package Object;

import java.awt.*;

public class ClassObject extends ShapedObject{
    final int width = 100;
    final int height = 90;
    public ClassObject(Point p) {
        super(p);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(this.curPos.x, this.curPos.y, width, height);
    }


    //  ==============   etc function    ================
}
