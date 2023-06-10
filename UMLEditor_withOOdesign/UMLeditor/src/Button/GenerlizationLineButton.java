package Button;

import Mode.CompositionLineMode;
import Mode.GenerlizationLineMode;
import Mode.ModeSerial;

import javax.swing.*;

public class GenerlizationLineButton extends Button{
    public GenerlizationLineButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new GenerlizationLineMode();
        btnSerial = ModeSerial.genLINE;
    }
}
