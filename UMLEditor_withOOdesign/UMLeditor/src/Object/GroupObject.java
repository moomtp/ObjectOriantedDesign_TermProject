package Object;

import UMLeditor.Singleton.CanvasMembers;

import java.awt.*;
import java.util.Vector;
import java.lang.Math.*;

import static java.lang.Math.min;

public class GroupObject extends BaseObject{
    Vector<BaseObject> children = new Vector<BaseObject>();
    public GroupObject(Point p) {
        super(p);
        Vector<BaseObject> graphics = CanvasMembers.getInstance();

        Point leftTopPos =  new Point(1920,1080);
        Point rightBottomPos = new Point(0,0);


        for(BaseObject obj : graphics){
            if(obj.isSelected()){
                obj.groupedBy = this; // set obj parent
                children.addElement(obj);

                // update lf , rb
                leftTopPos = calLeftTopPoint(leftTopPos , obj.getCurPos());
                rightBottomPos = calRightButtomPoint(rightBottomPos, obj.getCurPos(), obj.width, obj.height);
            }

        }

        //  check if two pos hasn't updated
        if ((leftTopPos.x  == 1920) && (leftTopPos.y == 1080) && (rightBottomPos.x == 0) && (rightBottomPos.y==0 )){
            return;
        }


        // cal width , height
        this.setCurPos(leftTopPos);
        this.width = rightBottomPos.x - leftTopPos.x;
        this.height = rightBottomPos.y - leftTopPos.y;
    }

    @Override
    public void draw(Graphics canvas) {
        // draw large rec
        if(this.isSelected == true){
            canvas.setColor(Color.orange);
        }
        else
            canvas.setColor(Color.black);
        canvas.drawRect(curPos.x, curPos.y, this.width, this.height);

        for(BaseObject obj : children){
            if(this.isSelected == true){
                obj.selectObject();
            }
            obj.draw(canvas);
        }
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

    @Override
    public void moveByOffset(Point fromPos, Point toPos){
        super.moveByOffset(fromPos, toPos);
//        for(BaseObject obj : children){
//            obj.moveByOffset(fromPos, toPos);
//        }
    }
    @Override
    public void selectObject(){
        // if this group has parent, unable to select ( pervent form group after group
//        if(this.groupedBy != null){
//            this.isSelected = false;
//        }
//        else super.selectObject();
        super.selectObject();

        // select all child object
        for(BaseObject obj : children){
            obj.selectObject();
        }
    }


    @Override
    public void deselectObject(){
        this.isSelected = false;

    }

    @Override
    public void ungroup(){
        for (BaseObject obj : children){
            if(obj.groupedBy == this){
                obj.groupedBy = null;
            }
        }
        Vector<BaseObject> graphics = CanvasMembers.getInstance();
        graphics.remove(this);

    }

    // ============== ect function  =============

    public Point calLeftTopPoint(Point p1, Point p2){
        Point tmpPoint;
        tmpPoint = new Point( Math.min(p1.x, p2.x), Math.min(p1.y, p2.y));

        return  tmpPoint;
    }
    public Point calRightButtomPoint(Point p1, Point p2, int width, int height){
        Point tmpPoint;
        tmpPoint = new Point( Math.max(p1.x, p2.x + width), Math.max(p1.y, p2.y + height));

        return  tmpPoint;
    }


}
