package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import static net.lypant.javokus.model.blocks.Transformation.State.*;

public class BlockTransformationTest
{
    private Transformation blockTransformation = null;

    @Before
    public void createBlockTransformation()
    {
        blockTransformation = new BlockTransformation();
    }

    @Test
    public void creation()
    {
        assertNotNull(blockTransformation);
    }

    @Test
    public void initialState()
    {
        assertEquals(NORMAL_0, blockTransformation.getState());
    }

    @Test
    public void settingState()
    {
        blockTransformation.setState(MIRRORED_0);
        assertEquals(MIRRORED_0, blockTransformation.getState());
    }

    @Test
    public void rotateFromNormal0()
    {
        blockTransformation.setState(NORMAL_0);
        blockTransformation.rotate();
        assertEquals(NORMAL_90, blockTransformation.getState());
    }

    @Test
    public void rotateFromNormal90()
    {
        blockTransformation.setState(NORMAL_90);
        blockTransformation.rotate();
        assertEquals(NORMAL_180, blockTransformation.getState());
    }

    @Test
    public void rotateFromNormal180()
    {
        blockTransformation.setState(NORMAL_180);
        blockTransformation.rotate();
        assertEquals(NORMAL_270, blockTransformation.getState());
    }

    @Test
    public void rotateFromNormal270()
    {
        blockTransformation.setState(NORMAL_270);
        blockTransformation.rotate();
        assertEquals(NORMAL_0, blockTransformation.getState());
    }

    @Test
    public void rotateFromMirrored0()
    {
        blockTransformation.setState(MIRRORED_0);
        blockTransformation.rotate();
        assertEquals(MIRRORED_270, blockTransformation.getState());
    }

    @Test
    public void rotateFromMirrored90()
    {
        blockTransformation.setState(MIRRORED_90);
        blockTransformation.rotate();
        assertEquals(MIRRORED_0, blockTransformation.getState());
    }

    @Test
    public void rotateFromMirrored180()
    {
        blockTransformation.setState(MIRRORED_180);
        blockTransformation.rotate();
        assertEquals(MIRRORED_90, blockTransformation.getState());
    }

    @Test
    public void rotateFromMirrored270()
    {
        blockTransformation.setState(MIRRORED_270);
        blockTransformation.rotate();
        assertEquals(MIRRORED_180, blockTransformation.getState());
    }

    @Test
    public void mirrorFromNormal0()
    {
        blockTransformation.setState(NORMAL_0);
        blockTransformation.mirror();
        assertEquals(MIRRORED_0, blockTransformation.getState());
    }

    @Test
    public void mirrorFromNormal90()
    {
        blockTransformation.setState(NORMAL_90);
        blockTransformation.mirror();
        assertEquals(MIRRORED_90, blockTransformation.getState());
    }

    @Test
    public void mirrorFromNormal180()
    {
        blockTransformation.setState(NORMAL_180);
        blockTransformation.mirror();
        assertEquals(MIRRORED_180, blockTransformation.getState());
    }

    @Test
    public void mirrorFromNormal270()
    {
        blockTransformation.setState(NORMAL_270);
        blockTransformation.mirror();
        assertEquals(MIRRORED_270, blockTransformation.getState());
    }

    @Test
    public void mirrorFromMirrored0()
    {
        blockTransformation.setState(MIRRORED_0);
        blockTransformation.mirror();
        assertEquals(NORMAL_0, blockTransformation.getState());
    }

    @Test
    public void mirrorFromMirrored90()
    {
        blockTransformation.setState(MIRRORED_90);
        blockTransformation.mirror();
        assertEquals(NORMAL_90, blockTransformation.getState());
    }

    @Test
    public void mirrorFromMirrored180()
    {
        blockTransformation.setState(MIRRORED_180);
        blockTransformation.mirror();
        assertEquals(NORMAL_180, blockTransformation.getState());
    }

    @Test
    public void mirrorFromMirrored270()
    {
        blockTransformation.setState(MIRRORED_270);
        blockTransformation.mirror();
        assertEquals(NORMAL_270, blockTransformation.getState());
    }
}

