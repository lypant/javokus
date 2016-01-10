package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Polyominos.Name.*;
import static net.lypant.javokus.model.blocks.Transformation.Orientation.*;
import net.lypant.javokus.model.blocks.Polyominos.*;

public class BlockTest
{
    private Block createBlock(Name name, Transformation transformation)
    {
        return new Block(Polyominos.getInstance().getPolyomino(name), transformation);
    }

    private Tile getTile(Block block, int tileIndex)
    {
        Tile result = null;

        Iterator<Tile> it = block.iterator();

        for(int i = 0; i <= tileIndex; ++i)
        {
            result = it.next();
        }

        return result;
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

    @Test
    public void pentominoNHeightNormal0()
    {
        Block block = createPentominoN();
        assertEquals(4, block.getHeight());
    }

    @Test
    public void pentominoNHeightNormal90()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(2, block.getHeight());
    }

    @Test
    public void pentominoNHeightNormal180()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(4, block.getHeight());
    }

    @Test
    public void pentominoNHeightNormal270()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(2, block.getHeight());
    }

    @Test
    public void pentominoNHeightReflected0()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(4, block.getHeight());
    }

    @Test
    public void pentominoNHeightReflected90()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(2, block.getHeight());
    }

    @Test
    public void pentominoNHeightReflected180()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(4, block.getHeight());
    }

    @Test
    public void pentominoNHeightReflected270()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(2, block.getHeight());
    }

    @Test
    public void getIterator()
    {
        Block block = createPentominoN();
        assertNotNull(block.iterator());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tryToRemoveTile()
    {
        Iterator<Tile> it = createPentominoN().iterator();
        it.next();
        it.remove();
    }

    @Test
    public void hasNext()
    {
        Block block = createMonomino();
        Iterator<Tile> it = block.iterator();
        assertTrue(it.hasNext());
    }

    @Test
    public void pentominoNNormal0Tile0X()
    {
        assertEquals(0, getTile(createPentominoN(), 0).getX());
    }

    @Test
    public void pentominoNNormal0Tile0Y()
    {
        assertEquals(0, getTile(createPentominoN(), 0).getY());
    }

    @Test
    public void pentominoNNormal0Tile1X()
    {
        assertEquals(0, getTile(createPentominoN(), 1).getX());
    }

    @Test
    public void pentominoNNormal0Tile1Y()
    {
        assertEquals(1, getTile(createPentominoN(), 1).getY());
    }

    @Test
    public void pentominoNNormal0Tile2X()
    {
        assertEquals(1, getTile(createPentominoN(), 2).getX());
    }

    @Test
    public void pentominoNNormal0Tile2Y()
    {
        assertEquals(1, getTile(createPentominoN(), 2).getY());
    }

    @Test
    public void pentominoNNormal0Tile3X()
    {
        assertEquals(1, getTile(createPentominoN(), 3).getX());
    }

    @Test
    public void pentominoNNormal0Tile3Y()
    {
        assertEquals(2, getTile(createPentominoN(), 3).getY());
    }

    @Test
    public void pentominoNNormal0Tile4X()
    {
        assertEquals(1, getTile(createPentominoN(), 4).getX());
    }

    @Test
    public void pentominoNNormal0Tile4Y()
    {
        assertEquals(3, getTile(createPentominoN(), 4).getY());
    }

    @Test
    public void pentominoNNormal90Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(0, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNNormal90Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(1, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNNormal90Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(1, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNNormal90Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(1, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNNormal90Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(1, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNNormal90Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(0, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNNormal90Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(2, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNNormal90Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(0, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNNormal90Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(3, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNNormal90Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        assertEquals(0, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNNormal180Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNNormal180Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(3, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNNormal180Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNNormal180Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(2, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNNormal180Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNNormal180Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(2, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNNormal180Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNNormal180Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNNormal180Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNNormal180Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNNormal270Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(3, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNNormal270Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNNormal270Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(2, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNNormal270Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNNormal270Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(2, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNNormal270Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNNormal270Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNNormal270Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNNormal270Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(0, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNNormal270Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        assertEquals(1, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNReflected0Tile0X()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(1, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNReflected0Tile0Y()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(0, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNReflected0Tile1X()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(1, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNReflected0Tile1Y()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(1, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNReflected0Tile2X()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(0, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNReflected0Tile2Y()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(1, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNReflected0Tile3X()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(0, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNReflected0Tile3Y()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(2, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNReflected0Tile4X()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(0, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNReflected0Tile4Y()
    {
        Block block = createPentominoN();
        block.reflect();
        assertEquals(3, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNReflected90Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(3, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNReflected90Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNReflected90Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(2, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNReflected90Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNReflected90Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(2, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNReflected90Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNReflected90Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNReflected90Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNReflected90Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNReflected90Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNReflected180Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNReflected180Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(3, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNReflected180Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNReflected180Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(2, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNReflected180Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNReflected180Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(2, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNReflected180Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNReflected180Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNReflected180Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNReflected180Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 4).getY());
    }

    @Test
    public void pentominoNReflected270Tile0X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 0).getX());
    }

    @Test
    public void pentominoNReflected270Tile0Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 0).getY());
    }

    @Test
    public void pentominoNReflected270Tile1X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 1).getX());
    }

    @Test
    public void pentominoNReflected270Tile1Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(0, getTile(block, 1).getY());
    }

    @Test
    public void pentominoNReflected270Tile2X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 2).getX());
    }

    @Test
    public void pentominoNReflected270Tile2Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 2).getY());
    }

    @Test
    public void pentominoNReflected270Tile3X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(2, getTile(block, 3).getX());
    }

    @Test
    public void pentominoNReflected270Tile3Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 3).getY());
    }

    @Test
    public void pentominoNReflected270Tile4X()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(3, getTile(block, 4).getX());
    }

    @Test
    public void pentominoNReflected270Tile4Y()
    {
        Block block = createPentominoN();
        block.rotate();
        block.rotate();
        block.rotate();
        block.reflect();
        assertEquals(1, getTile(block, 4).getY());
    }
}

