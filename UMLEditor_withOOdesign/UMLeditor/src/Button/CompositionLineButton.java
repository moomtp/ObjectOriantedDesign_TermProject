package Button;

import Mode.ClassObjectMode;
import Mode.CompositionLineMode;
import Mode.ModeSerial;

import javax.swing.*;

public class CompositionLineButton extends Button{
    public CompositionLineButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new CompositionLineMode();
        btnSerial = ModeSerial.comLINE;
    }
}
