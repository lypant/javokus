package net.lypant.javokus.model.blocks;

public interface Transformable
{
    public enum Capability
    {
        ROTATEABLE,
        MIRRORABLE
    }

    public boolean isRotateable();
    public boolean isMirrorable();
}

