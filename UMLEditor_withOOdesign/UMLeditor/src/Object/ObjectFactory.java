package Object;

import Button.Button;
import Mode.ModeSerial;
import Object.LineDecorator.*;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;

public class ObjectFactory {
    public BaseObject createObject(ModeSerial num, Point p) {
        switch (num) {
            case SELECT:
            case assLINE:
            case genLINE:
            case comLINE:
                return null;
            case claOBJECT:
                return new ClassObject(p);
            case useOBJECT:
                return new UsecaseObject(p);
            default:
                return null;

        }
    }
    public LineObject createLineObject(ModeSerial num, Port fPort, Port tPort){
        switch(num) {
            case assLINE:
                return new ArrowOfAssociation(new LineOfStraight(fPort, tPort));
            case genLINE:
                return new ArrowOfGenerlization(new LineOfStraight(fPort, tPort));
            case comLINE:
                return new ArrowOfComposition(new LineOfBroken(fPort, tPort));
            default:
                return null;
        }

    }
}