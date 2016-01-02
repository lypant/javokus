package net.lypant.javokus.model.blocks;

public interface Transformability
{
    public enum Rotateability
    {
        NOT_ROTATEABLE,
        ROTATEABLE_2_ORIENTATIONS,
        ROTATEABLE_4_ORIENTATIONS
    }

    public enum Reflectability
    {
        NOT_REFLECTABLE,
        OPTIONALLY_REFLECTABLE_2_ORIENTATIONS,
        REFLECTABLE_2_ORIENTATIONS
    }

    public boolean isRotateable();
    public boolean isReflectable();
    public boolean isReflectableOptionally();
    public int getRotationOrientationCount();
    public int getReflectionOrientationCount();
}

