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

        for(int i = 0; i <= tileIndex; ++i)
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

    private Polyomino getTrominoI()
    {
        return polyominos.getPolyomino(TROMINO_I);
    }

    private Polyomino getTrominoV()
    {
        return polyominos.getPolyomino(TROMINO_V);
    }

    private Polyomino getTetrominoO()
    {
        return polyominos.getPolyomino(TETROMINO_O);
    }

    private Polyomino getTetrominoI()
    {
        return polyominos.getPolyomino(TETROMINO_I);
    }

    private Polyomino getTetrominoT()
    {
        return polyominos.getPolyomino(TETROMINO_T);
    }

    private Polyomino getTetrominoZ()
    {
        return polyominos.getPolyomino(TETROMINO_Z);
    }

    private Polyomino getTetrominoL()
    {
        return polyominos.getPolyomino(TETROMINO_L);
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
    public void trominoI()
    {
        assertNotNull(getTrominoI());
    }

    @Test
    public void trominoIRotateability()
    {
        assertTrue(getTrominoI().isRotateable());
    }

    @Test
    public void trominoIRotationOrientationCount()
    {
        assertEquals(2, getTrominoI().getRotationOrientationCount());
    }

    @Test
    public void trominoIReflectability()
    {
        assertFalse(getTrominoI().isReflectable());
    }

    @Test
    public void trominoIReflectabilityOptional()
    {
        assertFalse(getTrominoI().isReflectableOptionally());
    }

    @Test
    public void trominoIReflectionOrientationCount()
    {
        assertEquals(0, getTrominoI().getReflectionOrientationCount());
    }

    @Test
    public void trominoITileCount()
    {
        assertEquals(3, getTrominoI().getTileCount());
    }

    @Test
    public void trominoITile0X()
    {
        assertEquals(0, getTile(getTrominoI(), 0).getX());
    }

    @Test
    public void trominoITile0Y()
    {
        assertEquals(0, getTile(getTrominoI(), 0).getY());
    }

    @Test
    public void trominoITile1X()
    {
        assertEquals(0, getTile(getTrominoI(), 1).getX());
    }

    @Test
    public void trominoITile1Y()
    {
        assertEquals(1, getTile(getTrominoI(), 1).getY());
    }

    @Test
    public void trominoITile2X()
    {
        assertEquals(0, getTile(getTrominoI(), 2).getX());
    }

    @Test
    public void trominoITile2Y()
    {
        assertEquals(2, getTile(getTrominoI(), 2).getY());
    }

    @Test
    public void trominoIWidth()
    {
        assertEquals(1, getTrominoI().getWidth());
    }

    @Test
    public void trominoIHeight()
    {
        assertEquals(3, getTrominoI().getHeight());
    }

    @Test
    public void trominoV()
    {
        assertNotNull(getTrominoV());
    }

    @Test
    public void trominoVRotateability()
    {
        assertTrue(getTrominoV().isRotateable());
    }

    @Test
    public void trominoVRotationOrientationCount()
    {
        assertEquals(4, getTrominoV().getRotationOrientationCount());
    }

    @Test
    public void trominoVReflectability()
    {
        assertTrue(getTrominoV().isReflectable());
    }

    @Test
    public void trominoVReflectabilityOptional()
    {
        assertTrue(getTrominoV().isReflectableOptionally());
    }

    @Test
    public void trominoVReflectionOrientationCount()
    {
        assertEquals(2, getTrominoV().getReflectionOrientationCount());
    }

    @Test
    public void trominoVTileCount()
    {
        assertEquals(3, getTrominoV().getTileCount());
    }

    @Test
    public void trominoVTile0X()
    {
        assertEquals(0, getTile(getTrominoV(), 0).getX());
    }

    @Test
    public void trominoVTile0Y()
    {
        assertEquals(0, getTile(getTrominoV(), 0).getY());
    }

    @Test
    public void trominoVTile1X()
    {
        assertEquals(1, getTile(getTrominoV(), 1).getX());
    }

    @Test
    public void trominoVTile1Y()
    {
        assertEquals(0, getTile(getTrominoV(), 1).getY());
    }

    @Test
    public void trominoVTile2X()
    {
        assertEquals(0, getTile(getTrominoV(), 2).getX());
    }

    @Test
    public void trominoVTile2Y()
    {
        assertEquals(1, getTile(getTrominoV(), 2).getY());
    }

    @Test
    public void trominoVWidth()
    {
        assertEquals(2, getTrominoV().getWidth());
    }

    @Test
    public void trominoVHeight()
    {
        assertEquals(2, getTrominoV().getHeight());
    }

    @Test
    public void tetrominoO()
    {
        assertNotNull(getTetrominoO());
    }

    @Test
    public void tetrominoORotateability()
    {
        assertFalse(getTetrominoO().isRotateable());
    }

    @Test
    public void tetrominoORotationOrientationCount()
    {
        assertEquals(0, getTetrominoO().getRotationOrientationCount());
    }

    @Test
    public void tetrominoOReflectability()
    {
        assertFalse(getTetrominoO().isReflectable());
    }

    @Test
    public void tetrominoOReflectabilityOptional()
    {
        assertFalse(getTetrominoO().isReflectableOptionally());
    }

    @Test
    public void tetrominoOReflectionOrientationCount()
    {
        assertEquals(0, getTetrominoO().getReflectionOrientationCount());
    }

    @Test
    public void tetrominoOTileCount()
    {
        assertEquals(4, getTetrominoO().getTileCount());
    }

    @Test
    public void tetrominoOTile0X()
    {
        assertEquals(0, getTile(getTetrominoO(), 0).getX());
    }

    @Test
    public void tetrominoOTile0Y()
    {
        assertEquals(0, getTile(getTetrominoO(), 0).getY());
    }

    @Test
    public void tetrominoOTile1X()
    {
        assertEquals(1, getTile(getTetrominoO(), 1).getX());
    }

    @Test
    public void tetrominoOTile1Y()
    {
        assertEquals(0, getTile(getTetrominoO(), 1).getY());
    }

    @Test
    public void tetrominoOTile2X()
    {
        assertEquals(0, getTile(getTetrominoO(), 2).getX());
    }

    @Test
    public void tetrominoOTile2Y()
    {
        assertEquals(1, getTile(getTetrominoO(), 2).getY());
    }

    @Test
    public void tetrominoOTile3X()
    {
        assertEquals(1, getTile(getTetrominoO(), 3).getX());
    }

    @Test
    public void tetrominoOTile3Y()
    {
        assertEquals(1, getTile(getTetrominoO(), 3).getY());
    }

    @Test
    public void tetrominoOWidth()
    {
        assertEquals(2, getTetrominoO().getWidth());
    }

    @Test
    public void tetrominoOHeight()
    {
        assertEquals(2, getTetrominoO().getHeight());
    }

    @Test
    public void tetrominoI()
    {
        assertNotNull(getTetrominoI());
    }

    @Test
    public void tetrominoIRotateability()
    {
        assertTrue(getTetrominoI().isRotateable());
    }

    @Test
    public void tetrominoIRotationOrientationCount()
    {
        assertEquals(2, getTetrominoI().getRotationOrientationCount());
    }

    @Test
    public void tetrominoIReflectability()
    {
        assertFalse(getTetrominoI().isReflectable());
    }

    @Test
    public void tetrominoIReflectabilityOptional()
    {
        assertFalse(getTetrominoI().isReflectableOptionally());
    }

    @Test
    public void tetrominoIReflectionOrientationCount()
    {
        assertEquals(0, getTetrominoI().getReflectionOrientationCount());
    }

    @Test
    public void tetrominoITileCount()
    {
        assertEquals(4, getTetrominoI().getTileCount());
    }

    @Test
    public void tetrominoITile0X()
    {
        assertEquals(0, getTile(getTetrominoI(), 0).getX());
    }

    @Test
    public void tetrominoITile0Y()
    {
        assertEquals(0, getTile(getTetrominoI(), 0).getY());
    }

    @Test
    public void tetrominoITile1X()
    {
        assertEquals(0, getTile(getTetrominoI(), 1).getX());
    }

    @Test
    public void tetrominoITile1Y()
    {
        assertEquals(1, getTile(getTetrominoI(), 1).getY());
    }

    @Test
    public void tetrominoITile2X()
    {
        assertEquals(0, getTile(getTetrominoI(), 2).getX());
    }

    @Test
    public void tetrominoITile2Y()
    {
        assertEquals(2, getTile(getTetrominoI(), 2).getY());
    }

    @Test
    public void tetrominoITile3X()
    {
        assertEquals(0, getTile(getTetrominoI(), 3).getX());
    }

    @Test
    public void tetrominoITile3Y()
    {
        assertEquals(3, getTile(getTetrominoI(), 3).getY());
    }

    @Test
    public void tetrominoIWidth()
    {
        assertEquals(1, getTetrominoI().getWidth());
    }

    @Test
    public void tetrominoIHeight()
    {
        assertEquals(4, getTetrominoI().getHeight());
    }

    @Test
    public void tetrominoT()
    {
        assertNotNull(getTetrominoT());
    }

    @Test
    public void tetrominoTRotateability()
    {
        assertTrue(getTetrominoT().isRotateable());
    }

    @Test
    public void tetrominoTRotationOrientationCount()
    {
        assertEquals(4, getTetrominoT().getRotationOrientationCount());
    }

    @Test
    public void tetrominoTReflectability()
    {
        assertTrue(getTetrominoT().isReflectable());
    }

    @Test
    public void tetrominoTReflectabilityOptional()
    {
        assertTrue(getTetrominoT().isReflectableOptionally());
    }

    @Test
    public void tetrominoTReflectionOrientationCount()
    {
        assertEquals(2, getTetrominoT().getReflectionOrientationCount());
    }

    @Test
    public void tetrominoTTileCount()
    {
        assertEquals(4, getTetrominoT().getTileCount());
    }

    @Test
    public void tetrominoTTile0X()
    {
        assertEquals(1, getTile(getTetrominoT(), 0).getX());
    }

    @Test
    public void tetrominoTTile0Y()
    {
        assertEquals(0, getTile(getTetrominoT(), 0).getY());
    }

    @Test
    public void tetrominoTTile1X()
    {
        assertEquals(0, getTile(getTetrominoT(), 1).getX());
    }

    @Test
    public void tetrominoTTile1Y()
    {
        assertEquals(1, getTile(getTetrominoT(), 1).getY());
    }

    @Test
    public void tetrominoTTile2X()
    {
        assertEquals(1, getTile(getTetrominoT(), 2).getX());
    }

    @Test
    public void tetrominoTTile2Y()
    {
        assertEquals(1, getTile(getTetrominoT(), 2).getY());
    }

    @Test
    public void tetrominoTTile3X()
    {
        assertEquals(2, getTile(getTetrominoT(), 3).getX());
    }

    @Test
    public void tetrominoTTile3Y()
    {
        assertEquals(1, getTile(getTetrominoT(), 3).getY());
    }

    @Test
    public void tetrominoTWidth()
    {
        assertEquals(3, getTetrominoT().getWidth());
    }

    @Test
    public void tetrominoTHeight()
    {
        assertEquals(2, getTetrominoT().getHeight());
    }

    @Test
    public void tetrominoZ()
    {
        assertNotNull(getTetrominoZ());
    }

    @Test
    public void tetrominoZRotateability()
    {
        assertTrue(getTetrominoZ().isRotateable());
    }

    @Test
    public void tetrominoZRotationOrientationCount()
    {
        assertEquals(2, getTetrominoZ().getRotationOrientationCount());
    }

    @Test
    public void tetrominoZReflectability()
    {
        assertTrue(getTetrominoZ().isReflectable());
    }

    @Test
    public void tetrominoZReflectabilityOptional()
    {
        assertFalse(getTetrominoZ().isReflectableOptionally());
    }

    @Test
    public void tetrominoZReflectionOrientationCount()
    {
        assertEquals(2, getTetrominoZ().getReflectionOrientationCount());
    }

    @Test
    public void tetrominoZTileCount()
    {
        assertEquals(4, getTetrominoZ().getTileCount());
    }

    @Test
    public void tetrominoZTile0X()
    {
        assertEquals(1, getTile(getTetrominoZ(), 0).getX());
    }

    @Test
    public void tetrominoZTile0Y()
    {
        assertEquals(0, getTile(getTetrominoZ(), 0).getY());
    }

    @Test
    public void tetrominoZTile1X()
    {
        assertEquals(2, getTile(getTetrominoZ(), 1).getX());
    }

    @Test
    public void tetrominoZTile1Y()
    {
        assertEquals(0, getTile(getTetrominoZ(), 1).getY());
    }

    @Test
    public void tetrominoZTile2X()
    {
        assertEquals(0, getTile(getTetrominoZ(), 2).getX());
    }

    @Test
    public void tetrominoZTile2Y()
    {
        assertEquals(1, getTile(getTetrominoZ(), 2).getY());
    }

    @Test
    public void tetrominoZTile3X()
    {
        assertEquals(1, getTile(getTetrominoZ(), 3).getX());
    }

    @Test
    public void tetrominoZTile3Y()
    {
        assertEquals(1, getTile(getTetrominoZ(), 3).getY());
    }

    @Test
    public void tetrominoZWidth()
    {
        assertEquals(3, getTetrominoZ().getWidth());
    }

    @Test
    public void tetrominoZHeight()
    {
        assertEquals(2, getTetrominoZ().getHeight());
    }

    @Test
    public void tetrominoL()
    {
        assertNotNull(getTetrominoL());
    }

    @Test
    public void tetrominoLRotateability()
    {
        assertTrue(getTetrominoL().isRotateable());
    }

    @Test
    public void tetrominoLRotationOrientationCount()
    {
        assertEquals(4, getTetrominoL().getRotationOrientationCount());
    }

    @Test
    public void tetrominoLReflectability()
    {
        assertTrue(getTetrominoL().isReflectable());
    }

    @Test
    public void tetrominoLReflectabilityOptional()
    {
        assertFalse(getTetrominoL().isReflectableOptionally());
    }

    @Test
    public void tetrominoLReflectionOrientationCount()
    {
        assertEquals(2, getTetrominoL().getReflectionOrientationCount());
    }

    @Test
    public void tetrominoLTileCount()
    {
        assertEquals(4, getTetrominoL().getTileCount());
    }

    @Test
    public void tetrominoLTile0X()
    {
        assertEquals(0, getTile(getTetrominoL(), 0).getX());
    }

    @Test
    public void tetrominoLTile0Y()
    {
        assertEquals(0, getTile(getTetrominoL(), 0).getY());
    }

    @Test
    public void tetrominoLTile1X()
    {
        assertEquals(1, getTile(getTetrominoL(), 1).getX());
    }

    @Test
    public void tetrominoLTile1Y()
    {
        assertEquals(0, getTile(getTetrominoL(), 1).getY());
    }

    @Test
    public void tetrominoLTile2X()
    {
        assertEquals(0, getTile(getTetrominoL(), 2).getX());
    }

    @Test
    public void tetrominoLTile2Y()
    {
        assertEquals(1, getTile(getTetrominoL(), 2).getY());
    }

    @Test
    public void tetrominoLTile3X()
    {
        assertEquals(0, getTile(getTetrominoL(), 3).getX());
    }

    @Test
    public void tetrominoLTile3Y()
    {
        assertEquals(2, getTile(getTetrominoL(), 3).getY());
    }

    @Test
    public void tetrominoLWidth()
    {
        assertEquals(2, getTetrominoL().getWidth());
    }

    @Test
    public void tetrominoLHeight()
    {
        assertEquals(3, getTetrominoL().getHeight());
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

