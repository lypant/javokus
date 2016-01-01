package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Shapes.Name.*;
import net.lypant.javokus.model.blocks.Shapes.*;

public class ShapesTest
{
    private Shapes shapes = Shapes.getInstance();

    private Shape getMonomino()
    {
        return shapes.getShape(MONOMINO);
    }

    private Shape getDomino()
    {
        return shapes.getShape(DOMINO);
    }

    private Shape getPentominoF()
    {
        return shapes.getShape(PENTOMINO_F);
    }

    private Tile getTile(Shape shape, int tileIndex)
    {
        Tile result = null;

        Iterator<Tile> it = shape.iterator();

        for(int i = 0; i < tileIndex + 1; i++)
        {
           result = it.next(); 
        }

        return result;
    }

    @Test
    public void singleton()
    {
        Shapes shapes1 = Shapes.getInstance();
        Shapes shapes2 = Shapes.getInstance();

        assertEquals(shapes1, shapes2);
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
    public void monominoRotationStatesCount()
    {
        assertEquals(0, getMonomino().getRotationStatesCount());
    }

    @Test
    public void monominoMirrorability()
    {
        assertFalse(getMonomino().isMirrorable());
    }

    @Test
    public void monominoMirrorStatesCount()
    {
        assertEquals(0, getMonomino().getMirrorStatesCount());
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
    public void dominoRotationStatesCount()
    {
        assertEquals(2, getDomino().getRotationStatesCount());
    }

    @Test
    public void dominoMirrorability()
    {
        assertFalse(getDomino().isMirrorable());
    }

    @Test
    public void dominoMirrorStatesCount()
    {
        assertEquals(0, getDomino().getMirrorStatesCount());
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
    public void pentominoFRotationStatesCount()
    {
        assertEquals(4, getPentominoF().getRotationStatesCount());
    }

    @Test
    public void pentominoFMirrorability()
    {
        assertTrue(getPentominoF().isMirrorable());
    }

    @Test
    public void pentominoFMirrorStatesCount()
    {
        assertEquals(2, getPentominoF().getMirrorStatesCount());
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

