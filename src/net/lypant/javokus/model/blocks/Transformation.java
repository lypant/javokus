package net.lypant.javokus.model.blocks;

public interface Transformation
{
    public enum State
    {
        NORMAL_0,
        NORMAL_90,
        NORMAL_180,
        NORMAL_270,
        MIRRORED_0,
        MIRRORED_90,
        MIRRORED_180,
        MIRRORED_270
    }

    public State getState();
    public void setState(State state);
    public void rotate();
    public void mirror();
}

