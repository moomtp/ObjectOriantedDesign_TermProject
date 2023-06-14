package Object.LineDecorator;

import Object.*;

import java.awt.*;

public class ArrowOfComposition extends ArrowDecorator {
    public ArrowOfComposition(LineObject newLine) {
        super(newLine);
    }

    public void draw(Graphics canvas){
        this.innerLineObject.draw(canvas);

        // init, and the angle of two ports
        Point fromPos = this.getFromPort().getPosition();
        Point toPos = this.getToPort().getPosition();
        int recHeight = 10;
        int recWidth = 16;

        // judge left or right
        boolean isFromLeft = ((toPos.x - fromPos.x) > 0 );
        // offset toPos and assign to printPos

        Point endPoint = new Point();
        if(isFromLeft){
            endPoint.setLocation(toPos.x - recWidth, toPos.y);
        }
        else
            endPoint.setLocation(toPos.x + recWidth, toPos.y);

        // TODO : offset rec by direction

        Point middleUp = new Point() , middleDown = new Point() ;
        middleUp.setLocation((toPos.x + endPoint.x)/2, toPos.y + recHeight/2);
        middleDown.setLocation((toPos.x + endPoint.x)/2, toPos.y - recHeight/2);

        canvas.drawLine(middleUp.x,middleUp.y,toPos.x,toPos.y);
        canvas.drawLine(middleDown.x,middleDown.y,toPos.x,toPos.y);
        canvas.drawLine(middleUp.x,middleUp.y,endPoint.x,endPoint.y);
        canvas.drawLine(middleDown.x,middleDown.y,endPoint.x,endPoint.y);
    }

}
