package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;
import net.lypant.javokus.model.blocks.Transformation.*;

public class FourOrientationsVW implements Transformation
{
    private Orientation orientation = DEFAULT_ORIENTATION;

    @Override
    public Orientation getOrientation()
    {
        return orientation;
    }

    @Override
    public void resetOrientation()
    {
        orientation = DEFAULT_ORIENTATION;
    }

    @Override
    public void rotate()
    {
        switch(orientation)
        {
            case NORMAL_0:      orientation = NORMAL_90;    break;
            case NORMAL_90:     orientation = NORMAL_180;   break;
            case NORMAL_180:    orientation = NORMAL_270;   break;
            case NORMAL_270:    orientation = NORMAL_0;     break;
            default: assert false : "Unhandled orientation: " + orientation; break;
        }
    }

    @Override
    public void reflect()
    {
        switch(orientation)
        {
            case NORMAL_0:      orientation = NORMAL_270;   break;
            case NORMAL_90:     orientation = NORMAL_180;   break;
            case NORMAL_180:    orientation = NORMAL_90;    break;
            case NORMAL_270:    orientation = NORMAL_0;     break;
            default: assert false : "Unhandled orientation: " + orientation; break;
        }
    }
}

