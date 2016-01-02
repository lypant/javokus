package net.lypant.javokus.model.blocks;

import java.util.*;

public class Shape implements Iterable<Tile>, RotationAware, MirrorAware
{
    private final static int MAX_TILE_COUNT = 5;
    private RotationAware.Capability rotationCapability;
    private MirrorAware.Capability mirrorCapability;
    private Collection<Tile> tiles;
    private Collection<Tile> readOnlyTilesView;
    private PolyominoSize size;

    public Shape(RotationAware.Capability rotationCapability, MirrorAware.Capability mirrorCapability)
    {
        this.rotationCapability = rotationCapability;
        this.mirrorCapability = mirrorCapability;
        tiles = new TreeSet<Tile>();
        readOnlyTilesView = Collections.unmodifiableCollection(tiles);
        size = new PolyominoSize();
    }

    @Override
    public boolean isRotateable()
    {
        boolean result = false;

        switch(rotationCapability)
        {
            case NOT_ROTATEABLE:
            {
                result = false;
                break;
            }
            case ROTATEABLE_TWO_TIMES:
            {
                result = true;
                break;
            }
            case ROTATEABLE_FOUR_TIMES:
            {
                result = true;
                break;
            }
            default:
            {
                assert false : "unsupported rotation capability: " + rotationCapability;
                break;
            }
        }

        return result;
    }

    @Override
    public int getRotationStatesCount()
    {
        int result = 0;

        switch(rotationCapability)
        {
            case NOT_ROTATEABLE:
            {
                result = 0;
                break;
            }
            case ROTATEABLE_TWO_TIMES:
            {
                result = 2;
                break;
            }
            case ROTATEABLE_FOUR_TIMES:
            {
                result = 4;
                break;
            }
            default:
            {
                assert false : "unsupported rotation capability: " + rotationCapability;
                break;
            }
        }

        return result;
    }

    @Override
    public boolean isMirrorable()
    {
        boolean result = false;

        switch(mirrorCapability)
        {
            case NOT_MIRRORABLE:
            {
                result = false;
                break;
            }
            case MIRRORABLE_TWO_TIMES:
            {
                result = true;
                break;
            }
            default:
            {
                assert false : "unsupported mirror capability: " + mirrorCapability;
                break;
            }
        }

        return result;
    }

    @Override
    public int getMirrorStatesCount()
    {
        int result = 0;

        switch(mirrorCapability)
        {
            case NOT_MIRRORABLE:
            {
                result = 0;
                break;
            }
            case MIRRORABLE_TWO_TIMES:
            {
                result = 2;
                break;
            }
            default:
            {
                assert false : "unsupported mirror capability: " + mirrorCapability;
                break;
            }
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

    public Iterator<Tile> iterator()
    {
        return readOnlyTilesView.iterator();
    }

    public int getWidth()
    {
        return size.getWidth();
    }

    public int getHeight()
    {
        return size.getHeight();
    }
}

