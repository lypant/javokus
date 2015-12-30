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
}

