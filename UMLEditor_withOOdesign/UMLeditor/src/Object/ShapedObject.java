package Object;

import java.awt.*;

public class ShapedObject extends BaseObject{
    Port ports[];

    protected ShapedObject(Point p){
        super(p);
        ports = new Port[4];
    }
    @Override
    public void draw(Graphics canvas) {

    }
}
