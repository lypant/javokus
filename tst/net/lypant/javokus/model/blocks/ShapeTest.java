package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformable.Capability.*;
import net.lypant.javokus.model.blocks.Transformable.*;

public class ShapeTest
{
    @Test
    public void creation()
    {
        Shape shape = new Shape();
        assertNotNull(shape);
    }

    @Test
    public void defaultRotateability()
    {
        Transformable transformable = new Shape();
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void emptyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.noneOf(Capability.class));
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void mirrorableOnlyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(MIRRORABLE));
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void rotateableOnlyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE));
        assertTrue(transformable.isRotateable());
    }

    @Test
    public void bothCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE, MIRRORABLE));
        assertTrue(transformable.isRotateable());
    }

    @Test
    public void defaultMirrorability()
    {
        Transformable transformable = new Shape();
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void emptyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.noneOf(Capability.class));
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void mirrorableOnlyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(MIRRORABLE));
        assertTrue(transformable.isMirrorable());
    }

    @Test
    public void rotateableOnlyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE));
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void bothCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE, MIRRORABLE));
        assertTrue(transformable.isMirrorable());
    }

    @Test
    public void noTilesCheckCount()
    {
        Shape shape = new Shape();
        assertEquals(0, shape.getTileCount());
    }

    @Test
    public void oneTileCheckCount()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getTileCount());
    }

    @Test
    public void twoTilesCheckCount()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        assertEquals(2, shape.getTileCount());
    }

    @Test
    public void threeTilesCheckCount()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        assertEquals(3, shape.getTileCount());
    }

    @Test
    public void fourTilesCheckCount()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        assertEquals(4, shape.getTileCount());
    }

    @Test
    public void fiveTilesCheckCount()
    {
        Shape shape = new Shape();
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
        Shape shape = new Shape();
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
        Shape shape = new Shape();
        assertNotNull(shape.iterator());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tryToRemoveTile()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        Iterator<Tile> it = shape.iterator();
        it.next();
        it.remove();
    }

    @Test
    public void iterate()
    {
        Shape shape = new Shape();
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
        Shape shape = new Shape();
        assertEquals(0, shape.getWidth());
    }

    @Test
    public void widthOneTile()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getWidth());
    }

    @Test
    public void widthFiveTiles()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(1, 0));
        shape.addTile(new Tile(2, 0));
        shape.addTile(new Tile(3, 0));
        shape.addTile(new Tile(4, 0));
        assertEquals(5, shape.getWidth());
    }

    @Test
    public void heightInitial()
    {
        Shape shape = new Shape();
        assertEquals(0, shape.getHeight());
    }

    @Test
    public void heightOneTile()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        assertEquals(1, shape.getHeight());
    }

    @Test
    public void heightFiveTiles()
    {
        Shape shape = new Shape();
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(0, 2));
        shape.addTile(new Tile(0, 3));
        shape.addTile(new Tile(0, 4));
        assertEquals(5, shape.getHeight());
    }
}
