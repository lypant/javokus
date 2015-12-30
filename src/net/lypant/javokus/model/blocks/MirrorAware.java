package net.lypant.javokus.model.blocks;

public interface MirrorAware
{
    public enum Capability
    {
        NOT_MIRRORABLE,
        MIRRORABLE_TWO_TIMES
    }

    public boolean isMirrorable();
    public int getMirrorStatesCount();
}

