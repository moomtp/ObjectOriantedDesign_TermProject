package UMLeditor;
import Object.*;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class DrawPanel extends JPanel {
    Vector<BaseObject> graphics;

    DrawPanel(){
        this.setBackground(Color.WHITE);
        this.graphics = Graphics.getInstance();
    }
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        for (BaseObject Obj : graphics) {

            Obj.draw(this);

        }
    }
}
