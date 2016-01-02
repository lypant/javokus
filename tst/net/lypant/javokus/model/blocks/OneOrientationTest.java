package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import static net.lypant.javokus.model.blocks.Transformation.*;

public class OneOrientationTest
{
    private Transformation transformation = null;

    @Before
    public void createTransformation()
    {
        transformation = new OneOrientation();
    }

    @Test
    public void creation()
    {
        assertNotNull(transformation);
    }

    @Test
    public void initialOrientation()
    {
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void rotate()
    {
        transformation.rotate();
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void reflect()
    {
        transformation.reflect();
        assertEquals(NORMAL_0, transformation.getOrientation());
    }

    @Test
    public void resetOrientation()
    {
        transformation.rotate();
        transformation.resetOrientation();
        assertEquals(DEFAULT_ORIENTATION, transformation.getOrientation());
    }
}

