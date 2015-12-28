package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class SizeTest
{
    private Size size = null;

    @Before
    public void createSize()
    {
        size = new Size();
    }

    @Test
    public void creation()
    {
        assertNotNull(size);
    }

    @Test
    public void widthInitial()
    {
        assertEquals(0, size.getWidth());
    }

    @Test
    public void widthSingleTile()
    {
        size.extendWithTile(new Tile(0, 0));
        assertEquals(1, size.getWidth());
    }

    @Test
    public void widthTwoVerticalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        assertEquals(1, size.getWidth());
    }

    @Test
    public void widthTwoHorizontalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(1, 0));
        assertEquals(2, size.getWidth());
    }

    @Test
    public void widthThreeHorizontalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(1, 0));
        size.extendWithTile(new Tile(2, 0));
        assertEquals(3, size.getWidth());
    }

    @Test
    public void widthFourHorizontalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(1, 0));
        size.extendWithTile(new Tile(2, 0));
        size.extendWithTile(new Tile(3, 0));
        assertEquals(4, size.getWidth());
    }

    @Test
    public void widthFiveHorizontalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(1, 0));
        size.extendWithTile(new Tile(2, 0));
        size.extendWithTile(new Tile(3, 0));
        size.extendWithTile(new Tile(4, 0));
        assertEquals(5, size.getWidth());
    }

    @Test
    public void widthComplex()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        size.extendWithTile(new Tile(1, 1));
        size.extendWithTile(new Tile(2, 1));
        size.extendWithTile(new Tile(1, 2));
        assertEquals(3, size.getWidth());
    }

    @Test
    public void heightInitial()
    {
        assertEquals(0, size.getHeight());
    }

    @Test
    public void heightSingleTile()
    {
        size.extendWithTile(new Tile(0, 0));
        assertEquals(1, size.getHeight());
    }

    @Test
    public void heightTwoHorizontalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(1, 0));
        assertEquals(1, size.getHeight());
    }

    @Test
    public void heightTwoVerticalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        assertEquals(2, size.getHeight());
    }

    @Test
    public void heightThreeVerticalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        size.extendWithTile(new Tile(0, 2));
        assertEquals(3, size.getHeight());
    }

    @Test
    public void heightFourVerticalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        size.extendWithTile(new Tile(0, 2));
        size.extendWithTile(new Tile(0, 3));
        assertEquals(4, size.getHeight());
    }

    @Test
    public void heightFiveVerticalTiles()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        size.extendWithTile(new Tile(0, 2));
        size.extendWithTile(new Tile(0, 3));
        size.extendWithTile(new Tile(0, 4));
        assertEquals(5, size.getHeight());
    }

    @Test
    public void heightComplex()
    {
        size.extendWithTile(new Tile(0, 0));
        size.extendWithTile(new Tile(0, 1));
        size.extendWithTile(new Tile(1, 1));
        size.extendWithTile(new Tile(2, 1));
        size.extendWithTile(new Tile(1, 2));
        assertEquals(3, size.getHeight());
    }
}

