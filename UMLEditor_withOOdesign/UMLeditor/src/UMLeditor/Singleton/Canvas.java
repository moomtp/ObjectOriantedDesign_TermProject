package UMLeditor.Singleton;
import Object.BaseObject;

import java.util.Vector;

import javax.swing.JPanel;

import java.awt.*;

public class Canvas {
    //     Singleton
    private static JPanel canvas;


    private Canvas(){ }

    public synchronized static JPanel getInstance(){
        if (canvas == null){
                canvas = new JPanel() ;
                    
        }

        return canvas;
    }

    public synchronized static void setInstance(JPanel g){
        canvas = g;
    }

    public synchronized static void repaintComponent(){
        canvas.repaint();
    }

}
