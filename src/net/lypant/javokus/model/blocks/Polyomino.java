package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformability.Rotateability.*;
import static net.lypant.javokus.model.blocks.Transformability.Reflectability.*;
import net.lypant.javokus.model.blocks.Transformability.*;

public class Polyomino implements Transformability, Measurable, Iterable<Tile>
{
    private final static int MAX_TILE_COUNT = 5;
    private Rotateability rotateability;
    private Reflectability reflectability;
    private Collection<Tile> tiles;
    private Collection<Tile> readOnlyTilesView;
    private PolyominoSize size;

    public Polyomino(Rotateability rotateability, Reflectability reflectability)
    {
        this.rotateability = rotateability;
        this.reflectability = reflectability;
        tiles = new TreeSet<Tile>();
        readOnlyTilesView = Collections.unmodifiableCollection(tiles);
        size = new PolyominoSize();
    }

    @Override
    public boolean isRotateable()
    {
        boolean result = false;

        switch(rotateability)
        {
            case NOT_ROTATEABLE:            result = false; break;
            case ROTATEABLE_2_ORIENTATIONS: result = true;  break;
            case ROTATEABLE_4_ORIENTATIONS: result = true;  break;
            default:    assert false : "Unhandled rotateability: " + rotateability;
        }

        return result;
    }

    @Override
    public int getRotationOrientationCount()
    {
        int result = 0;

        switch(rotateability)
        {
            case NOT_ROTATEABLE:            result = 0; break;
            case ROTATEABLE_2_ORIENTATIONS: result = 2; break;
            case ROTATEABLE_4_ORIENTATIONS: result = 4; break;
            default:    assert false : "Unhandled rotateability: " + rotateability;
        }

        return result;
    }

    @Override
    public boolean isReflectable()
    {
        boolean result = false;

        switch(reflectability)
        {
            case NOT_REFLECTABLE:                       result = false; break;
            case OPTIONALLY_REFLECTABLE_2_ORIENTATIONS: result = true;  break;
            case REFLECTABLE_2_ORIENTATIONS:            result = true;  break;
            default:    assert false : "Unhandled reflectability: " + reflectability;
        }

        return result;
    }

    @Override
    public int getReflectionOrientationCount()
    {
        int result = 0;

        switch(reflectability)
        {
            case NOT_REFLECTABLE:                       result = 0; break;
            case OPTIONALLY_REFLECTABLE_2_ORIENTATIONS: result = 2; break;
            case REFLECTABLE_2_ORIENTATIONS:            result = 2; break;
            default:    assert false : "Unhandled reflectability: " + reflectability;
        }

        return result;
    }

    @Override
    public boolean isReflectableOptionally()
    {
        boolean result = false;

        switch(reflectability)
        {
            case NOT_REFLECTABLE:                       result = false; break;
            case OPTIONALLY_REFLECTABLE_2_ORIENTATIONS: result = true;  break;
            case REFLECTABLE_2_ORIENTATIONS:            result = false; break;
            default:    assert false : "Unhandled reflectability: " + reflectability;
        }

        return result;
    }

    public void addTile(Tile tile)
    {
        assert tiles.size() < MAX_TILE_COUNT : "max tile count already reached: " + MAX_TILE_COUNT;

        tiles.add(tile);
        size.extendWithTile(tile);
    }

    public int getTileCount()
    {
        return tiles.size();
    }

    @Override
    public Iterator<Tile> iterator()
    {
        return readOnlyTilesView.iterator();
    }

    @Override
    public int getWidth()
    {
        return size.getWidth();
    }

    @Override
    public int getHeight()
    {
        return size.getHeight();
    }
}

