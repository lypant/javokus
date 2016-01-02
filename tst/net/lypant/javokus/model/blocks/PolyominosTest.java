package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Polyominos.Name.*;

public class PolyominosTest
{
    private Polyominos polyominos = Polyominos.getInstance();

    private Tile getTile(Polyomino polyomino, int tileIndex)
    {
        Tile result = null;

        Iterator<Tile> it = polyomino.iterator();

        for(int i = 0; i < tileIndex + 1; i++)
        {
           result = it.next(); 
        }

        return result;
    }

    private Polyomino getMonomino()
    {
        return polyominos.getPolyomino(MONOMINO);
    }

    private Polyomino getDomino()
    {
        return polyominos.getPolyomino(DOMINO);
    }

    private Polyomino getPentominoF()
    {
        return polyominos.getPolyomino(PENTOMINO_F);
    }

    @Test
    public void getInstance()
    {
        assertNotNull(Polyominos.getInstance());
    }

    @Test
    public void singleton()
    {
        Polyominos polys1 = Polyominos.getInstance();
        Polyominos polys2 = Polyominos.getInstance();
        assertEquals(polys1, polys2);
    }

    @Test
    public void monomino()
    {
        assertNotNull(getMonomino());
    }

    @Test
    public void monominoRotateability()
    {
        assertFalse(getMonomino().isRotateable());
    }

    @Test
    public void monominoRotationOrientationCount()
    {
        assertEquals(0, getMonomino().getRotationOrientationCount());
    }

    @Test
    public void monominoReflectability()
    {
        assertFalse(getMonomino().isReflectable());
    }

    @Test
    public void monominoReflectabilityOptional()
    {
        assertFalse(getMonomino().isReflectableOptionally());
    }

    @Test
    public void monominoReflectionOrientationCount()
    {
        assertEquals(0, getMonomino().getReflectionOrientationCount());
    }

    @Test
    public void monominoTileCount()
    {
        assertEquals(1, getMonomino().getTileCount());
    }

    @Test
    public void monominoTile0X()
    {
        assertEquals(0, getTile(getMonomino(), 0).getX());
    }

    @Test
    public void monominoTile0Y()
    {
        assertEquals(0, getTile(getMonomino(), 0).getY());
    }

    @Test
    public void monominoWidth()
    {
        assertEquals(1, getMonomino().getWidth());
    }

    @Test
    public void monominoHeight()
    {
        assertEquals(1, getMonomino().getHeight());
    }

    @Test
    public void domino()
    {
        assertNotNull(getDomino());
    }

    @Test
    public void dominoRotateability()
    {
        assertTrue(getDomino().isRotateable());
    }

    @Test
    public void dominoRotationOrientationCount()
    {
        assertEquals(2, getDomino().getRotationOrientationCount());
    }

    @Test
    public void dominoReflectability()
    {
        assertFalse(getDomino().isReflectable());
    }

    @Test
    public void dominoReflectabilityOptional()
    {
        assertFalse(getDomino().isReflectableOptionally());
    }

    @Test
    public void dominoReflectionOrientationCount()
    {
        assertEquals(0, getDomino().getReflectionOrientationCount());
    }

    @Test
    public void dominoTileCount()
    {
        assertEquals(2, getDomino().getTileCount());
    }

    @Test
    public void dominoTile0X()
    {
        assertEquals(0, getTile(getDomino(), 0).getX());
    }

    @Test
    public void dominoTile0Y()
    {
        assertEquals(0, getTile(getDomino(), 0).getY());
    }

    @Test
    public void dominoTile1X()
    {
        assertEquals(0, getTile(getDomino(), 1).getX());
    }

    @Test
    public void dominoTile1Y()
    {
        assertEquals(1, getTile(getDomino(), 1).getY());
    }

    @Test
    public void dominoWidth()
    {
        assertEquals(1, getDomino().getWidth());
    }

    @Test
    public void dominoHeight()
    {
        assertEquals(2, getDomino().getHeight());
    }

    @Test
    public void pentominoF()
    {
        assertNotNull(getPentominoF());
    }

    @Test
    public void pentominoFRotateability()
    {
        assertTrue(getPentominoF().isRotateable());
    }

    @Test
    public void pentominoFRotationOrientationCount()
    {
        assertEquals(4, getPentominoF().getRotationOrientationCount());
    }

    @Test
    public void pentominoFReflectability()
    {
        assertTrue(getPentominoF().isReflectable());
    }

    @Test
    public void pentominoFReflectabilityOptional()
    {
        assertFalse(getPentominoF().isReflectableOptionally());
    }

    @Test
    public void pentominoFReflectionOrientationCount()
    {
        assertEquals(2, getPentominoF().getReflectionOrientationCount());
    }

    @Test
    public void pentominoFTileCount()
    {
        assertEquals(5, getPentominoF().getTileCount());
    }

    @Test
    public void pentominoFTile0X()
    {
        assertEquals(1, getTile(getPentominoF(), 0).getX());
    }

    @Test
    public void pentominoFTile0Y()
    {
        assertEquals(0, getTile(getPentominoF(), 0).getY());
    }

    @Test
    public void pentominoFTile1X()
    {
        assertEquals(0, getTile(getPentominoF(), 1).getX());
    }

    @Test
    public void pentominoFTile1Y()
    {
        assertEquals(1, getTile(getPentominoF(), 1).getY());
    }

    @Test
    public void pentominoFTile2X()
    {
        assertEquals(1, getTile(getPentominoF(), 2).getX());
    }

    @Test
    public void pentominoFTile2Y()
    {
        assertEquals(1, getTile(getPentominoF(), 2).getY());
    }

    @Test
    public void pentominoFTile3X()
    {
        assertEquals(1, getTile(getPentominoF(), 3).getX());
    }

    @Test
    public void pentominoFTile3Y()
    {
        assertEquals(2, getTile(getPentominoF(), 3).getY());
    }

    @Test
    public void pentominoFTile4X()
    {
        assertEquals(2, getTile(getPentominoF(), 4).getX());
    }

    @Test
    public void pentominoFTile4Y()
    {
        assertEquals(2, getTile(getPentominoF(), 4).getY());
    }

    @Test
    public void pentominoFWidth()
    {
        assertEquals(3, getPentominoF().getWidth());
    }

    @Test
    public void pentominoFHeight()
    {
        assertEquals(3, getPentominoF().getHeight());
    }
}

