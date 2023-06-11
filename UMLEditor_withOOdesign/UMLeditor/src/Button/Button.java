package Button;
import Mode.*;
import UMLeditor.Singleton.CurMode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {
    ModeSerial btnSerial;
    Mode btnMode;

    public Button(ImageIcon btnIcon){
        super(btnIcon);
        this.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == btnSerial.toString()){
            this.setBackground(Color.GRAY);
            CurMode.setInstance(this.btnMode);
        }
        else this.setBackground(Color.WHITE);

    }
}
