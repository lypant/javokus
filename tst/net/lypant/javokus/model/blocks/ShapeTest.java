package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.RotationAware.Capability.*;
import static net.lypant.javokus.model.blocks.MirrorAware.Capability.*;
import net.lypant.javokus.model.blocks.RotationAware.*;
import net.lypant.javokus.model.blocks.MirrorAware.*;

public class ShapeTest
{
    @Test
    public void notRotateableRotateability()
    {
        RotationAware shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertFalse(shape.isRotateable());
    }

    @Test
    public void rotateableTwoTimesRotateability()
    {
        RotationAware shape = new Shape(ROTATEABLE_TWO_TIMES, NOT_MIRRORABLE);
        assertTrue(shape.isRotateable());
    }

    @Test
    public void rotateableFourTimesRotateability()
    {
        RotationAware shape = new Shape(ROTATEABLE_FOUR_TIMES, NOT_MIRRORABLE);
        assertTrue(shape.isRotateable());
    }

    @Test
    public void notRotateableStatesCount()
    {
        RotationAware shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertEquals(0, shape.getRotationStatesCount());
    }

    @Test
    public void rotateableTwoTimesStatesCount()
    {
        RotationAware shape = new Shape(ROTATEABLE_TWO_TIMES, NOT_MIRRORABLE);
        assertEquals(2, shape.getRotationStatesCount());
    }

    @Test
    public void rotateableFourTimesStatesCount()
    {
        RotationAware shape = new Shape(ROTATEABLE_FOUR_TIMES, NOT_MIRRORABLE);
        assertEquals(4, shape.getRotationStatesCount());
    }

    @Test
    public void notMirrorableMirrorability()
    {
        MirrorAware shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertFalse(shape.isMirrorable());
    }

    @Test
    public void mirrorableTwoTimesMirrorability()
    {
        MirrorAware shape = new Shape(NOT_ROTATEABLE, MIRRORABLE_TWO_TIMES);
        assertTrue(shape.isMirrorable());
    }

    @Test
    public void notMirrorableStatesCount()
    {
        MirrorAware shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertEquals(0, shape.getMirrorStatesCount());
    }

    @Test
    public void mirrorableTwoTimesStatesCount()
    {
        MirrorAware shape = new Shape(NOT_ROTATEABLE, MIRRORABLE_TWO_TIMES);
        assertEquals(2, shape.getMirrorStatesCount());
    }

    @Test
    public void noTilesCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertEquals(0, shape.getTileCount());
    }

    @Test
    public void oneTileCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getTileCount());
    }

    @Test
    public void twoTilesCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        assertEquals(2, shape.getTileCount());
    }

    @Test
    public void threeTilesCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        assertEquals(3, shape.getTileCount());
    }

    @Test
    public void fourTilesCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        assertEquals(4, shape.getTileCount());
    }

    @Test
    public void fiveTilesCheckCount()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        shape.addTile(new Tile(0, 4));
        assertEquals(5, shape.getTileCount());
    }

    @Test(expected = AssertionError.class)
    public void tooManyTiles()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        shape.addTile(new Tile(0, 4));
        shape.addTile(new Tile(1, 0));
    }

    @Test
    public void getIterator()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertNotNull(shape.iterator());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tryToRemoveTile()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));

        Iterator<Tile> it = shape.iterator();
        it.next();
        it.remove();
    }

    @Test
    public void iterate()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        shape.addTile(new Tile(0, 4));

        int counter = 0;
        for(Tile tile : shape)
        {
            ++counter;
        }
        assertEquals(5, counter);
    }

    @Test
    public void widthInitial()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertEquals(0, shape.getWidth());
    }

    @Test
    public void widthOneTile()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getWidth());
    }

    @Test
    public void heightInitial()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        assertEquals(0, shape.getHeight());
    }

    @Test
    public void heightOneTile()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getHeight());
    }
}

