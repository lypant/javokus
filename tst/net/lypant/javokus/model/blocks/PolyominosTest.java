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

    private Polyomino getPentominoI()
    {
        return polyominos.getPolyomino(PENTOMINO_I);
    }

    private Polyomino getPentominoF()
    {
        return polyominos.getPolyomino(PENTOMINO_F);
    }

    private Polyomino getPentominoN()
    {
        return polyominos.getPolyomino(PENTOMINO_N);
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
    public void pentominoI()
    {
        assertNotNull(getPentominoI());
    }

    @Test
    public void pentominoIRotateability()
    {
        assertTrue(getPentominoI().isRotateable());
    }

    @Test
    public void pentominoIRotationOrientationCount()
    {
        assertEquals(2, getPentominoI().getRotationOrientationCount());
    }

    @Test
    public void pentominoIReflectability()
    {
        assertFalse(getPentominoI().isReflectable());
    }

    @Test
    public void pentominoIReflectabilityOptional()
    {
        assertFalse(getPentominoI().isReflectableOptionally());
    }

    @Test
    public void pentominoIReflectionOrientationCount()
    {
        assertEquals(0, getPentominoI().getReflectionOrientationCount());
    }

    @Test
    public void pentominoITileCount()
    {
        assertEquals(5, getPentominoI().getTileCount());
    }

    @Test
    public void pentominoITile0X()
    {
        assertEquals(0, getTile(getPentominoI(), 0).getX());
    }

    @Test
    public void pentominoITile0Y()
    {
        assertEquals(0, getTile(getPentominoI(), 0).getY());
    }

    @Test
    public void pentominoITile1X()
    {
        assertEquals(0, getTile(getPentominoI(), 1).getX());
    }

    @Test
    public void pentominoITile1Y()
    {
        assertEquals(1, getTile(getPentominoI(), 1).getY());
    }

    @Test
    public void pentominoITile2X()
    {
        assertEquals(0, getTile(getPentominoI(), 2).getX());
    }

    @Test
    public void pentominoITile2Y()
    {
        assertEquals(2, getTile(getPentominoI(), 2).getY());
    }

    @Test
    public void pentominoITile3X()
    {
        assertEquals(0, getTile(getPentominoI(), 3).getX());
    }

    @Test
    public void pentominoITile3Y()
    {
        assertEquals(3, getTile(getPentominoI(), 3).getY());
    }

    @Test
    public void pentominoITile4X()
    {
        assertEquals(0, getTile(getPentominoI(), 4).getX());
    }

    @Test
    public void pentominoITile4Y()
    {
        assertEquals(4, getTile(getPentominoI(), 4).getY());
    }

    @Test
    public void pentominoIWidth()
    {
        assertEquals(1, getPentominoI().getWidth());
    }

    @Test
    public void pentominoIHeight()
    {
        assertEquals(5, getPentominoI().getHeight());
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

    @Test
    public void pentominoN()
    {
        assertNotNull(getPentominoN());
    }

    @Test
    public void pentominoNRotateability()
    {
        assertTrue(getPentominoN().isRotateable());
    }

    @Test
    public void pentominoNRotationOrientationCount()
    {
        assertEquals(4, getPentominoN().getRotationOrientationCount());
    }

    @Test
    public void pentominoNReflectability()
    {
        assertTrue(getPentominoN().isReflectable());
    }

    @Test
    public void pentominoNReflectabilityOptional()
    {
        assertFalse(getPentominoN().isReflectableOptionally());
    }

    @Test
    public void pentominoNReflectionOrientationCount()
    {
        assertEquals(2, getPentominoN().getReflectionOrientationCount());
    }

    @Test
    public void pentominoNTileCount()
    {
        assertEquals(5, getPentominoN().getTileCount());
    }

    @Test
    public void pentominoNTile0X()
    {
        assertEquals(0, getTile(getPentominoN(), 0).getX());
    }

    @Test
    public void pentominoNTile0Y()
    {
        assertEquals(0, getTile(getPentominoN(), 0).getY());
    }

    @Test
    public void pentominoNTile1X()
    {
        assertEquals(0, getTile(getPentominoN(), 1).getX());
    }

    @Test
    public void pentominoNTile1Y()
    {
        assertEquals(1, getTile(getPentominoN(), 1).getY());
    }

    @Test
    public void pentominoNTile2X()
    {
        assertEquals(1, getTile(getPentominoN(), 2).getX());
    }

    @Test
    public void pentominoNTile2Y()
    {
        assertEquals(1, getTile(getPentominoN(), 2).getY());
    }

    @Test
    public void pentominoNTile3X()
    {
        assertEquals(1, getTile(getPentominoN(), 3).getX());
    }

    @Test
    public void pentominoNTile3Y()
    {
        assertEquals(2, getTile(getPentominoN(), 3).getY());
    }

    @Test
    public void pentominoNTile4X()
    {
        assertEquals(1, getTile(getPentominoN(), 4).getX());
    }

    @Test
    public void pentominoNTile4Y()
    {
        assertEquals(3, getTile(getPentominoN(), 4).getY());
    }

    @Test
    public void pentominoNWidth()
    {
        assertEquals(2, getPentominoN().getWidth());
    }

    @Test
    public void pentominoNHeight()
    {
        assertEquals(4, getPentominoN().getHeight());
    }
}

