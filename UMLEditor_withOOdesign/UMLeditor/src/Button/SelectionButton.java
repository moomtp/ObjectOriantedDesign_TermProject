package Button;

import Mode.GenerlizationLineMode;
import Mode.ModeSerial;
import Mode.SelectMode;

import javax.swing.*;

public class SelectionButton extends Button{
    public SelectionButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new SelectMode();
        btnSerial = ModeSerial.SELECT;
    }
}
