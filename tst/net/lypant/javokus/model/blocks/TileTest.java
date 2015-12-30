package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TileTest
{
    private Tile tile = null;

    @Before
    public void createTile()
    {
        tile = new Tile(0, 0);
    }

    @Test
    public void creation()
    {
        assertNotNull(tile);
    }

    @Test
    public void initialX()
    {
        assertEquals(0, tile.getX());
    }

    @Test(expected = AssertionError.class)
    public void setTooLowX()
    {
        tile.setX(-1);
    }

    @Test
    public void setMinimumX()
    {
        tile.setX(0);
        assertEquals(0, tile.getX());
    }

    @Test
    public void setLegalXOne()
    {
        tile.setX(1);
        assertEquals(1, tile.getX());
    }

    @Test
    public void setLegalXTwo()
    {
        tile.setX(2);
        assertEquals(2, tile.getX());
    }

    @Test
    public void setLegalXThree()
    {
        tile.setX(3);
        assertEquals(3, tile.getX());
    }

    @Test
    public void setMaxX()
    {
        tile.setX(4);
        assertEquals(4, tile.getX());
    }

    @Test(expected = AssertionError.class)
    public void setTooHighX()
    {
        tile.setX(5);
    }

    @Test
    public void initialY()
    {
        assertEquals(0, tile.getY());
    }

    @Test(expected = AssertionError.class)
    public void setTooLowY()
    {
        tile.setY(-1);
    }

    @Test
    public void setMinimumY()
    {
        tile.setY(0);
        assertEquals(0, tile.getY());
    }

    @Test
    public void setLegalYOne()
    {
        tile.setY(1);
        assertEquals(1, tile.getY());
    }

    @Test
    public void setLegalYTwo()
    {
        tile.setY(2);
        assertEquals(2, tile.getY());
    }

    @Test
    public void setLegalYThree()
    {
        tile.setY(3);
        assertEquals(3, tile.getY());
    }

    @Test
    public void setMaxY()
    {
        tile.setY(4);
        assertEquals(4, tile.getY());
    }

    @Test(expected = AssertionError.class)
    public void setTooHighY()
    {
        tile.setY(5);
    }

    @Test
    public void parametrizedConstructorX()
    {
        Tile t = new Tile(1, 2);
        assertEquals(1, t.getX());
    }

    @Test
    public void parametrizedConstructorY()
    {
        Tile t = new Tile(1, 2);
        assertEquals(2, t.getY());
    }

    @Test
    public void compareToNull()
    {
        assertEquals(1, tile.compareTo(null));
    }

    @Test
    public void compareToSameObject()
    {
        assertEquals(0, tile.compareTo(tile));
    }

    @Test
    public void compareToDifferentObjectWithSameCoordinates()
    {
        Tile tile2 = new Tile(0, 0);
        assertEquals(0, tile.compareTo(tile2));
    }

    @Test
    public void compareToDifferentObjectWithBiggerY()
    {
        Tile tile2 = new Tile(0, 1);
        assertEquals(-1, tile.compareTo(tile2));
    }

    @Test
    public void compareToDifferentObjectWithSmallerY()
    {
        tile.setY(2);
        Tile tile2 = new Tile(0, 1);
        assertEquals(1, tile.compareTo(tile2));
    }

    @Test
    public void compareToDifferentObjectWithBiggerX()
    {
        Tile tile2 = new Tile(1, 0);
        assertEquals(-1, tile.compareTo(tile2));
    }

    @Test
    public void compareToDifferentObjectWithSmallerX()
    {
        tile.setX(2);
        Tile tile2 = new Tile(1, 0);
        assertEquals(1, tile.compareTo(tile2));
    }

    @Test
    public void equalsNull()
    {
        assertFalse(tile.equals(null));
    }

    @Test
    public void equalsOtherClassObject()
    {
        Integer number = 42;
        assertFalse(tile.equals(number));
    }

    @Test
    public void equalsTheSameObject()
    {
        assertTrue(tile.equals(tile));
    }

    @Test
    public void equalsDifferentObjectEqual()
    {
        Tile tile2 = new Tile(0, 0);
        assertTrue(tile.equals(tile2));
    }

    @Test
    public void equalsDifferentObhectUnequal()
    {
        Tile tile2 = new Tile(1, 2);
        assertFalse(tile.equals(tile2));
    }
}

