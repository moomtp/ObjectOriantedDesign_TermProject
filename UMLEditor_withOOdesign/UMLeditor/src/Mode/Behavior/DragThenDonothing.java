package Mode.Behavior;

import java.awt.*;

public class DragThenDonothing implements DragBehavior {

    @Override
    public void drag(Point pos) {

        UMLeditor.Singleton.Canvas.repaintComponent();
    }
}
