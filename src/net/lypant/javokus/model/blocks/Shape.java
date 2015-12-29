package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformable.Capability.*;
import net.lypant.javokus.model.blocks.Transformable.*;

public class Shape implements Transformable
{
    private EnumSet<Capability> capabilities;

    public Shape(EnumSet<Capability> capabilities)
    {
        this.capabilities = capabilities;
    }

    public Shape()
    {
        this(EnumSet.noneOf(Capability.class));
    }

    public boolean isRotateable()
    {
        return capabilities.contains(ROTATEABLE);
    }

    public boolean isMirrorable()
    {
        return capabilities.contains(MIRRORABLE);
    }
}

