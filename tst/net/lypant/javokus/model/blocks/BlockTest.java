package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import static net.lypant.javokus.model.blocks.Polyominos.Name.*;
import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import net.lypant.javokus.model.blocks.Polyominos.*;

public class BlockTest
{
    private Block createBlock(Name name, Transformation transformation)
    {
        return new Block(Polyominos.getInstance().getPolyomino(name), transformation);
    }

    private Block createMonomino()
    {
        return createBlock(MONOMINO, new OneOrientation());
    }

    private Block createDomino()
    {
        return createBlock(DOMINO, new TwoOrientations());
    }

    private Block createPentominoI()
    {
        return createBlock(PENTOMINO_I, new TwoOrientations());
    }

    private Block createPentominoF()
    {
        return createBlock(PENTOMINO_F, new EightOrientations());
    }

    private Block createPentominoN()
    {
        return createBlock(PENTOMINO_N, new EightOrientations());
    }

    @Test
    public void create()
    {
        assertNotNull(createMonomino());
    }

    @Test
    public void monominoInitialWidth()
    {
        assertEquals(1, createMonomino().getWidth());
    }

    @Test
    public void monominoInitialHeight()
    {
        assertEquals(1, createMonomino().getHeight());
    }

    @Test
    public void monominoRotateability()
    {
        assertFalse(createMonomino().isRotateable());
    }

    @Test
    public void monominoReflectability()
    {
        assertFalse(createMonomino().isReflectable());
    }

    @Test
    public void monominoReflectabilityOptional()
    {
        assertFalse(createMonomino().isReflectableOptionally());
    }

    @Test
    public void monominoRotationOrientationCount()
    {
        assertEquals(0, createMonomino().getRotationOrientationCount());
    }

    @Test
    public void monominoReflectionOrientationCount()
    {
        assertEquals(0, createMonomino().getReflectionOrientationCount());
    }

    @Test
    public void monominoInitialOrientation()
    {
        assertEquals(NORMAL_0, createMonomino().getOrientation());
    }

    @Test
    public void monominoRotate()
    {
        Block block = createMonomino();
        block.rotate();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void monominoReflect()
    {
        Block block = createMonomino();
        block.reflect();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void monominoResetOrientation()
    {
        Block block = createMonomino();
        block.rotate();
        block.resetOrientation();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void dominoInitialWidth()
    {
        assertEquals(1, createDomino().getWidth());
    }

    @Test
    public void dominioNormal90Width()
    {
        Block block = createDomino();
        block.rotate();
        assertEquals(2, block.getWidth());
    }

    @Test
    public void dominoInitialHeight()
    {
        assertEquals(2, createDomino().getHeight());
    }

    @Test
    public void dominoRotateability()
    {
        assertTrue(createDomino().isRotateable());
    }

    @Test
    public void dominoReflectability()
    {
        assertFalse(createDomino().isReflectable());
    }

    @Test
    public void dominoReflectabilityOptional()
    {
        assertFalse(createDomino().isReflectableOptionally());
    }

    @Test
    public void dominoRotationOrientationCount()
    {
        assertEquals(2, createDomino().getRotationOrientationCount());
    }

    @Test
    public void dominoReflectionOrientationCount()
    {
        assertEquals(0, createDomino().getReflectionOrientationCount());
    }

    @Test
    public void dominoInitialOrientation()
    {
        assertEquals(NORMAL_0, createDomino().getOrientation());
    }

    @Test
    public void dominoRotate()
    {
        Block block = createDomino();
        block.rotate();
        assertEquals(NORMAL_90, block.getOrientation());
    }

    @Test
    public void dominoReflect()
    {
        Block block = createDomino();
        block.reflect();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void dominoResetOrientation()
    {
        Block block = createDomino();
        block.rotate();
        block.resetOrientation();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void pentominoFInitialWidth()
    {
        assertEquals(3, createPentominoF().getWidth());
    }

    @Test
    public void pentominoFInitialHeight()
    {
        assertEquals(3, createPentominoF().getHeight());
    }

    @Test
    public void pentominoFRotateability()
    {
        assertTrue(createPentominoF().isRotateable());
    }

    @Test
    public void pentominoFReflectability()
    {
        assertTrue(createPentominoF().isReflectable());
    }

    @Test
    public void pentominoFReflectabilityOptional()
    {
        assertFalse(createPentominoF().isReflectableOptionally());
    }

    @Test
    public void pentominoFRotationOrientationCount()
    {
        assertEquals(4, createPentominoF().getRotationOrientationCount());
    }

    @Test
    public void pentominoFReflectionOrientationCount()
    {
        assertEquals(2, createPentominoF().getReflectionOrientationCount());
    }

    @Test
    public void pentominoFInitialOrientation()
    {
        assertEquals(NORMAL_0, createPentominoF().getOrientation());
    }
    
    @Test
    public void pentominoFRotate()
    {
        Block block = createPentominoF();
        block.rotate();
        assertEquals(NORMAL_90, block.getOrientation());
    }
    
    @Test
    public void pentominoFReflect()
    {
        Block block = createPentominoF();
        block.reflect();
        assertEquals(REFLECTED_0, block.getOrientation());
    }

    @Test
    public void pentominoFResetOrientation()
    {
        Block block = createPentominoF();
        block.rotate();
        block.resetOrientation();
        assertEquals(NORMAL_0, block.getOrientation());
    }

    @Test
    public void pentominoNWidthNormal0()
    {
        Block block = createPentominoN();
        assertEquals(2, block.getWidth());
    }

    @Test
    public void pentominoNWidthNormal90()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(4, block.getWidth());
    }

    @Test
    public void pentominoNWidthNormal180()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(2, block.getWidth());
    }

    @Test
    public void pentominoNWidthNormal270()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(4, block.getWidth());
    }

    @Test
    public void pentominoNWidthReflected0()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(2, block.getWidth());
    }

    @Test
    public void pentominoNWidthReflected90()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(4, block.getWidth());
    }

    @Test
    public void pentominoNWidthReflected180()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(2, block.getWidth());
    }

    @Test
    public void pentominoNWidthReflected270()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(4, block.getWidth());
    }
}

