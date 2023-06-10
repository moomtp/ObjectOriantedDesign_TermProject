package Button;

import Mode.AssociateLineMode;
import Mode.ModeSerial;

import javax.swing.*;

public class AssociateLineButton extends Button {

    public AssociateLineButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new AssociateLineMode();
        btnSerial = ModeSerial.assLINE;
    }
}
