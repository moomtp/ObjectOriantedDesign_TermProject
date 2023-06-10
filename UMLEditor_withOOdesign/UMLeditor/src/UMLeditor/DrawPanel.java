package UMLeditor;
import Object.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class DrawPanel extends JPanel implements MouseListener , MouseMotionListener {
    Vector<BaseObject> graphics;

    DrawPanel(){
        this.setBackground(Color.WHITE);
        this.graphics = UMLeditor.Singleton.Graphics.getInstance();
    }
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        for (BaseObject Obj : graphics) {

            Obj.draw(this);

        }
    }

    // ============   mouseListener function   ==============
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
