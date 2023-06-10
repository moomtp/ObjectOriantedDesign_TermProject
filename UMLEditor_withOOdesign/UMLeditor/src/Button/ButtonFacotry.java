package Button;
import Mode.ModeSerial;

import javax.swing.*;
import java.awt.*;

public class ButtonFacotry {
    public ButtonFacotry(){ }

//    public Button createBtn(ModeSerial num) {
//        switch (num) {
//            case SELECT:
//                return new SelectionButton();
//            case assLINE:
//                return new AssociateLineButton();
//            case genLINE:
//                return new GenerlizationLineButton();
//            case comLINE:
//                return new CompositionLineButton();
//            case claOBJECT:
//                return new ClassObjectButton();
//            case useOBJECT:
//                return new UsecaseObjectButton();
//            default:
//                return null;
//
//
//        }
//    }
        public Button createBtn(ModeSerial num, ImageIcon btnIcon){
            switch(num){
                case SELECT:
                    return new SelectionButton(btnIcon);
                case assLINE:
                    return new AssociateLineButton(btnIcon);
                case genLINE:
                    return new GenerlizationLineButton(btnIcon);
                case comLINE:
                    return new CompositionLineButton(btnIcon);
                case claOBJECT:
                    return new ClassObjectButton(btnIcon);
                case useOBJECT:
                    return new UsecaseObjectButton(btnIcon);
                default:
                    return null;

            }
    }
}
