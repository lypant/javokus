package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;
import net.lypant.javokus.model.blocks.Transformation.*;

public class OneOrientation implements Transformation
{
    @Override
    public Orientation getOrientation()
    {
        return DEFAULT_ORIENTATION;
    }

    @Override
    public void resetOrientation()
    {
    }

    @Override
    public void rotate()
    {
    }

    @Override
    public void reflect()
    {
    }
}

