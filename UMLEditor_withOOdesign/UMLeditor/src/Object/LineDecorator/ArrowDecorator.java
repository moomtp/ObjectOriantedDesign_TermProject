package Object.LineDecorator;

import Object.*;

import java.awt.*;

import static java.lang.Math.PI;

public abstract class ArrowDecorator extends LineObject {
    LineObject innerLineObject;
    public ArrowDecorator(LineObject newLine ){
        super(newLine);
        innerLineObject =  newLine;
    }


    @Override
    public abstract void draw(Graphics g);


    //======== angle function =====

    double calTwoPointsAngle(Point a, Point b){
        double angle;
        angle =  Math.atan2(b.y - a.y, b.x - a.x) ;


        return angle;
    }
    double calAngleOffset(double angle, double offsetAngle){
        double tmpAngle = angle; // -3.14 ~ 3.14
        tmpAngle = angle - (offsetAngle*PI)/180; //
        if(tmpAngle > PI){tmpAngle = tmpAngle - 2*PI;}
        if(tmpAngle < -PI){tmpAngle = tmpAngle + 2*PI;}

        return tmpAngle;
    }

}
