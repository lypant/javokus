package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;

public class FourOrientationsTUTest
{
    private Transformation transformation = null;

    private void setOrientation(Orientation orientation)
    {
        transformation.resetOrientation();

        switch(orientation)
        {
           case NORMAL_270:     transformation.rotate();    // fall through
           case NORMAL_180:     transformation.rotate();    // fall through
           case NORMAL_90:      transformation.rotate();    // fall through
           case NORMAL_0:       break;
           default: break;
        }
    }

    @Before
    public void createTransformation()
    {
        transformation = new FourOrientationsTU();
    }

    @Test
    public void creation()
    {
        assertNotNull(transformation);
    }

    @Test
    public void initialOrientation()
    {
        assertEquals(DEFAULT_ORIENTATION, transformation.getOrientation());
    }

    @Test
    public void rotateFromNormal0()
    {
        setOrientation(NORMAL_0);
        transformation.rotate();
        assertEquals(NORMAL_90, transformation.getOrientation());
    }

    @Test
    public void rotateFromNormal90()
    {
        setOrientation(NORMAL_90);
        transformation.rotate();
        assertEquals(NORMAL_180, transformation.getOrientation());
    }

    @Test
    public void rotateFromNormal180()
    {
        setOrientation(NORMAL_180);
        transformation.rotate();
        assertEquals(NORMAL_270, transformation.getOrientation());
    }

    @Test
    public void rotateFromNormal270()
    {
        setOrientation(NORMAL_270);
        transformation.rotate();
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal0()
    {
        setOrientation(NORMAL_0);
        transformation.reflect();
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal90()
    {
        setOrientation(NORMAL_90);
        transformation.reflect();
        assertEquals(NORMAL_270, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal180()
    {
        setOrientation(NORMAL_180);
        transformation.reflect();
        assertEquals(NORMAL_180, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal270()
    {
        setOrientation(NORMAL_270);
        transformation.reflect();
        assertEquals(NORMAL_90, transformation.getOrientation());
    }

    @Test
    public void resetOrientation()
    {
        setOrientation(NORMAL_180);
        transformation.resetOrientation();
        assertEquals(DEFAULT_ORIENTATION, transformation.getOrientation());
    }
}

