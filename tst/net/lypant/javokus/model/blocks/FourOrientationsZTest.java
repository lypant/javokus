package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;

public class FourOrientationsZTest
{
    private Transformation transformation = null;

    private void setOrientation(Orientation orientation)
    {
        transformation.resetOrientation();

        switch(orientation)
        {
           case NORMAL_90:      transformation.rotate();    // fall through
           case NORMAL_0:       break;
           case REFLECTED_90:   transformation.rotate();    // fall through
           case REFLECTED_0:    transformation.reflect();
           default: break;
        }
    }

    @Before
    public void createTransformation()
    {
        transformation = new FourOrientationsZ();
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
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void rotateFromReflected0()
    {
        setOrientation(REFLECTED_0);
        transformation.rotate();
        assertEquals(REFLECTED_90, transformation.getOrientation());
    }

    @Test
    public void rotateFromReflected90()
    {
        setOrientation(REFLECTED_90);
        transformation.rotate();
        assertEquals(REFLECTED_0, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal0()
    {
        setOrientation(NORMAL_0);
        transformation.reflect();
        assertEquals(REFLECTED_0, transformation.getOrientation());
    }

    @Test
    public void reflectFromNormal90()
    {
        setOrientation(NORMAL_90);
        transformation.reflect();
        assertEquals(REFLECTED_90, transformation.getOrientation());
    }

    @Test
    public void reflectFromReflected0()
    {
        setOrientation(REFLECTED_0);
        transformation.reflect();
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void reflectFromReflected90()
    {
        setOrientation(REFLECTED_90);
        transformation.reflect();
        assertEquals(NORMAL_90, transformation.getOrientation());
    }

    @Test
    public void resetOrientation()
    {
        setOrientation(NORMAL_90);
        transformation.resetOrientation();
        assertEquals(DEFAULT_ORIENTATION, transformation.getOrientation());
    }
}

