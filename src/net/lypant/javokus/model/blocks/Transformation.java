package net.lypant.javokus.model.blocks;

public interface Transformation
{
    public enum Orientation
    {
        NORMAL_0,
        NORMAL_90,
        NORMAL_180,
        NORMAL_270,
        REFLECTED_0,
        REFLECTED_90,
        REFLECTED_180,
        REFLECTED_270
    }

    public final Orientation DEFAULT_ORIENTATION = Orientation.NORMAL_0;

    public Orientation getOrientation();
    public void resetOrientation();
    public void rotate();
    public void reflect();
}

