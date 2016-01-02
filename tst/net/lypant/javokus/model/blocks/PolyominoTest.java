package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformability.Rotateability.*;
import static net.lypant.javokus.model.blocks.Transformability.Reflectability.*;

public class PolyominoTest
{
    @Test
    public void notRotateableRotateability()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertFalse(poly.isRotateable());
    }

    @Test
    public void rotateableTwoOrientationsRotateability()
    {
        Transformability poly = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        assertTrue(poly.isRotateable());
    }

    @Test
    public void rotateableFourOrientationsRotateability()
    {
        Transformability poly = new Polyomino(ROTATEABLE_4_ORIENTATIONS, NOT_REFLECTABLE);
        assertTrue(poly.isRotateable());
    }

    @Test
    public void notRotateableRotationOrientationCount()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertEquals(0, poly.getRotationOrientationCount());
    }

    @Test
    public void rotateableTwoOrientationsRotationOrientationCount()
    {
        Transformability poly = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        assertEquals(2, poly.getRotationOrientationCount());
    }

    @Test
    public void rotateableFourOrientationsRotationOrientationCount()
    {
        Transformability poly = new Polyomino(ROTATEABLE_4_ORIENTATIONS, NOT_REFLECTABLE);
        assertEquals(4, poly.getRotationOrientationCount());
    }

    @Test
    public void notReflectableReflectability()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertFalse(poly.isReflectable());
    }

    @Test
    public void optionallyReflectableReflectability()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        assertTrue(poly.isReflectable());
    }

    @Test
    public void reflectableReflectability()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, REFLECTABLE_2_ORIENTATIONS);
        assertTrue(poly.isReflectable());
    }

    @Test
    public void notReflectableReflectionOrientationCount()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertEquals(0, poly.getReflectionOrientationCount());
    }

    @Test
    public void optionallyReflectableReflectionOrientationCount()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        assertEquals(2, poly.getReflectionOrientationCount());
    }

    @Test
    public void reflectableReflectionOrientationCount()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, REFLECTABLE_2_ORIENTATIONS);
        assertEquals(2, poly.getReflectionOrientationCount());
    }

    @Test
    public void notReflectableReflectabilityOptional()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertFalse(poly.isReflectableOptionally());
    }

    @Test
    public void optionallyReflectableReflectabilityOptional()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        assertTrue(poly.isReflectableOptionally());
    }

    @Test
    public void reflectableReflectabilityOptional()
    {
        Transformability poly = new Polyomino(NOT_ROTATEABLE, REFLECTABLE_2_ORIENTATIONS);
        assertFalse(poly.isReflectableOptionally());
    }

    @Test
    public void noTilesCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertEquals(0, poly.getTileCount());
    }

    @Test
    public void oneTileCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        assertEquals(1, poly.getTileCount());
    }

    @Test
    public void twoTilesCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        assertEquals(2, poly.getTileCount());
    }

    @Test
    public void threeTilesCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        poly.addTile(new Tile(0, 2));
        assertEquals(3, poly.getTileCount());
    }

    @Test
    public void fourTilesCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        poly.addTile(new Tile(0, 2));
        poly.addTile(new Tile(0, 3));
        assertEquals(4, poly.getTileCount());
    }

    @Test
    public void fiveTilesCheckCount()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        poly.addTile(new Tile(0, 2));
        poly.addTile(new Tile(0, 3));
        poly.addTile(new Tile(0, 4));
        assertEquals(5, poly.getTileCount());
    }

    @Test(expected = AssertionError.class)
    public void tooManyTiles()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        poly.addTile(new Tile(0, 2));
        poly.addTile(new Tile(0, 3));
        poly.addTile(new Tile(0, 4));
        poly.addTile(new Tile(1, 0));
    }

    @Test
    public void getIterator()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertNotNull(poly.iterator());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void tryToRemoveTile()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        Iterator<Tile> it = poly.iterator();
        it.next();
        it.remove();
    }

    @Test
    public void iterate()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        poly.addTile(new Tile(0, 1));
        poly.addTile(new Tile(0, 2));
        poly.addTile(new Tile(0, 3));
        poly.addTile(new Tile(0, 4));

        int counter = 0;
        for(Tile tile : poly)
        {
            ++counter;
        }
        assertEquals(5, counter);
    }

    @Test
    public void widthNoTiles()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertEquals(0, poly.getWidth());
    }

    @Test
    public void widthOneTile()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        assertEquals(1, poly.getWidth());
    }

    @Test
    public void heightNoTiles()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        assertEquals(0, poly.getHeight());
    }

    @Test
    public void heightOneTile()
    {
        Polyomino poly = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        poly.addTile(new Tile(0, 0));
        assertEquals(1, poly.getHeight());
    }
}

