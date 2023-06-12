package Mode.Behavior;

import java.awt.*;

public class ReleaseThenFindPort implements ReleaseBehavior {
    @Override
    public Boolean release(Point pressPos, Point pos) {
        return false;
    }
}
