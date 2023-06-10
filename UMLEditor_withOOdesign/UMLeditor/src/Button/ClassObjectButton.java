package Button;

import Mode.AssociateLineMode;
import Mode.ClassObjectMode;
import Mode.CompositionLineMode;
import Mode.ModeSerial;

import javax.swing.*;

public class ClassObjectButton extends Button{

    public ClassObjectButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new ClassObjectMode();
        btnSerial = ModeSerial.claOBJECT;
    }
}
