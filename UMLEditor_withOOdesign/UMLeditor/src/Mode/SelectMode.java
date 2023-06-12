package Mode;

import Mode.Behavior.*;

import java.awt.*;

public class SelectMode extends Mode{
        public SelectMode(){
        modeSerial = ModeSerial.SELECT;
        clickBehavior = new ClickThenSelect();
        pressBehavior = new PressThenCheckPos();
        releaseBehavior = new ReleaseThenRangeSelect();
    }


    @Override
        public void release(Point pos){
            if(this.isObjectSelected){
                new ReleaseThenMoveObject().release(pos);
            }
            else{
                releaseBehavior.release(pos);
            }
    }
}
