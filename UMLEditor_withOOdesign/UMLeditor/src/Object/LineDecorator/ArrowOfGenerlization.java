package Object.LineDecorator;

import Object.LineObject;

import java.awt.*;

public class ArrowOfGenerlization extends ArrowDecorator {
    public ArrowOfGenerlization(LineObject newLine) {
        super(newLine);
    }

    public void draw(Graphics canvas){
        this.innerLineObject.draw(canvas);

        // init, and the angle of two ports
        Point fromPos = this.getFromPort().getPosition();
        Point toPos = this.getToPort().getPosition();
        int len = 15;

        double angle = calTwoPointsAngle(fromPos, toPos);
        double angle1 = calAngleOffset(angle , 45);
        double angle2 = calAngleOffset(angle , 315);

        // cal tmpPoint for drawing
        Point left = new Point() , right = new Point() ;
        left.setLocation(toPos.getX() - len*(Math.cos(angle1)), toPos.getY() - len*(Math.sin(angle1)));
        right.setLocation(toPos.getX() - len*(Math.cos(angle2)), toPos.getY() - len*(Math.sin(angle2)));

        canvas.drawLine(toPos.x,toPos.y,left.x,left.y);
        canvas.drawLine(toPos.x,toPos.y,right.x,right.y);
        canvas.drawLine(left.x,left.y,right.x,right.y);

    }

}
