package UMLeditor;
import Object.*;
import Mode.Mode;
import UMLeditor.Singleton.CurMode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class DrawPanel extends JPanel implements MouseListener , MouseMotionListener {
    Vector<BaseObject> graphics;
    Mode curMode;


    DrawPanel(){
        this.setBackground(Color.WHITE);


        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        for (BaseObject Obj : UMLeditor.Singleton.Graphics.getInstance()) {

            Obj.draw(this.getGraphics());

        }
    }


    // ============   mouseListener function   ==============
    @Override
    public void mouseClicked(MouseEvent e) {
        CurMode.getInstance().click(e.getPoint());

        paintComponent(this.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        CurMode.getInstance().press(e.getPoint());

        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        CurMode.getInstance().release(e.getPoint());

        paintComponent(this.getGraphics());
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        CurMode.getInstance().drag(e.getPoint());

        paintComponent(this.getGraphics());
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
