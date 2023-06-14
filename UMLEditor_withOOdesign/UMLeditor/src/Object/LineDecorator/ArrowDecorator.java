package Object.LineDecorator;

import Object.*;

import java.awt.*;

public abstract class ArrowDecorator extends LineObject {
    LineObject baseLine;
    public ArrowDecorator(LineObject newLine ){
        super(newLine);
        baseLine = (LineObject) newLine;
    }


    @Override
    public abstract void draw(Graphics g);

}
