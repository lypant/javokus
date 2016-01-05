package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.*;

// TODO Remove???
import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;

public class Block implements Measurable, Transformability, Transformation
{
    private final Polyomino polyomino;
    private final Transformation transformation;

    public Block(Polyomino polyomino, Transformation transformation)
    {
        this.polyomino = polyomino;
        this.transformation = transformation;
    }

    @Override
    public int getWidth()
    {
        return polyomino.getWidth();
    }

    @Override
    public int getHeight()
    {
        return polyomino.getHeight();
    }

    @Override
    public boolean isRotateable()
    {
        return polyomino.isRotateable();
    }

    @Override
    public boolean isReflectable()
    {
        return polyomino.isReflectable();
    }

    @Override
    public boolean isReflectableOptionally()
    {
        return polyomino.isReflectableOptionally();
    }

    @Override
    public int getRotationOrientationCount()
    {
        return polyomino.getRotationOrientationCount();
    }

    @Override
    public int getReflectionOrientationCount()
    {
        return polyomino.getReflectionOrientationCount();
    }

    @Override
    public Orientation getOrientation()
    {
        return transformation.getOrientation();
    }

    @Override
    public void resetOrientation()
    {
        transformation.resetOrientation();
    }

    @Override
    public void rotate()
    {
        transformation.rotate();
    }

    @Override
    public void reflect()
    {
        transformation.reflect();
    }
}

