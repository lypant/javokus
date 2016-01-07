package net.lypant.javokus.model.blocks;

import static net.lypant.javokus.model.blocks.Transformation.*;

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
        int result = 0;

        Orientation orientation = getOrientation();

        switch(orientation)
        {
            case NORMAL_0:          // fall through
            case NORMAL_180:        // fall through
            case REFLECTED_0:       // fall thhrough
            case REFLECTED_180:     result = polyomino.getWidth();  break;
            case NORMAL_90:         // fall through
            case NORMAL_270:        // fall through
            case REFLECTED_90:      // fall through
            case REFLECTED_270:     result = polyomino.getHeight(); break;
            default:    assert false : "Unhandled orientation: " + orientation; break;
        }

        return result;
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

