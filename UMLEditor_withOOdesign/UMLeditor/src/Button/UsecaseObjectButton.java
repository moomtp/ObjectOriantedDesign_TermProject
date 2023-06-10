package Button;

import Mode.GenerlizationLineMode;
import Mode.ModeSerial;
import Mode.UsecaseObjectMode;

import javax.swing.*;

public class UsecaseObjectButton extends Button{
    public UsecaseObjectButton(ImageIcon btnIcon){
        super(btnIcon);
        btnMode = new UsecaseObjectMode();
        btnSerial = ModeSerial.useOBJECT;
    }
}
