package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;
import net.lypant.javokus.model.blocks.Transformation.*;

public class FourOrientationsZ implements Transformation
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
            case NORMAL_90:     orientation = NORMAL_0;     break;
            case REFLECTED_0:   orientation = REFLECTED_90; break;
            case REFLECTED_90:  orientation = REFLECTED_0;  break;
            default: assert false : "Unhandled orientation: " + orientation; break;
        }
    }

    @Override
    public void reflect()
    {
        switch(orientation)
        {
            case NORMAL_0:      orientation = REFLECTED_0;  break;
            case NORMAL_90:     orientation = REFLECTED_90; break;
            case REFLECTED_0:   orientation = NORMAL_0;     break;
            case REFLECTED_90:  orientation = NORMAL_90;    break;
            default: assert false : "Unhandled orientation: " + orientation; break;
        }
    }
}

