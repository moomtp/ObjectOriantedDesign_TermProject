package UMLeditor;
import Object.BaseObject;
import Button.ButtonFacotry;
import Button.Button;

import Mode.ModeSerial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.nio.file.*;

public class ButtonPanel extends JPanel implements ActionListener {
    Vector<BaseObject> graphics;
    Vector<Button> funcBtns = new Vector<Button>();
    Vector<ImageIcon> funcIcon = new Vector<ImageIcon>();



    ButtonPanel(){
        ButtonFacotry buttonFacotry = new ButtonFacotry();
        this.setLayout(new GridLayout(0,1,0,0));
        for(ModeSerial serial : ModeSerial.values()){
            funcIcon.addElement(new ImageIcon("images//" + serial.toString() + ".png"));
            ImageIcon btnIcon = funcIcon.lastElement();

            funcBtns.addElement(buttonFacotry.createBtn(serial,btnIcon));
            Button btn = funcBtns.lastElement();

            btn.setActionCommand(serial.toString());
            btn.addActionListener(this);
            this.add(btn);


            // assign btn function & mouse listener
        }

        this.setLayout(new GridLayout(ModeSerial.values().length, 1));

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for(Button btn : funcBtns){
            btn.actionPerformed(e);
        }
    }
}
