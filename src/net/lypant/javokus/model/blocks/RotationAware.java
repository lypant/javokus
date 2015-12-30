package net.lypant.javokus.model.blocks;

public interface RotationAware
{
    public enum Capability
    {
        NOT_ROTATEABLE,
        ROTATEABLE_TWO_TIMES,
        ROTATEABLE_FOUR_TIMES
    }

    public boolean isRotateable();
    public int getRotationStatesCount();
}

