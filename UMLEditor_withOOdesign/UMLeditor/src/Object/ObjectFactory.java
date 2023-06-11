package Object;

import Button.Button;
import Mode.ModeSerial;

import javax.swing.*;
import java.awt.*;

public class ObjectFactory {
    public BaseObject createObject(ModeSerial num, Point p) {
        switch (num) {
            case SELECT:
                return null;
            case assLINE:
                return new AssociationLine(p);
            case genLINE:
                return new GenerlizationLine(p);
            case comLINE:
                return new CompositionLine(p);
            case claOBJECT:
                return new ClassObject(p);
            case useOBJECT:
                return new UsecaseObject(p);
            default:
                return null;

        }
    }
}