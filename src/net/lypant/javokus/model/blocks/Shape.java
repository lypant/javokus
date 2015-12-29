package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformable.Capability.*;
import net.lypant.javokus.model.blocks.Transformable.*;

public class Shape implements Transformable, Iterable<Tile>
{
    private final static int MAX_TILE_COUNT = 5;
    private EnumSet<Capability> capabilities;
    private Collection<Tile> tiles;
    private Collection<Tile> readOnlyTilesView;
    private Size size;

    public Shape(EnumSet<Capability> capabilities)
    {
        this.capabilities = capabilities;
        tiles = new TreeSet<Tile>();
        readOnlyTilesView = Collections.unmodifiableCollection(tiles);
        size = new Size();
    }

    public Shape()
    {
        this(EnumSet.noneOf(Capability.class));
    }

    public boolean isRotateable()
    {
        return capabilities.contains(ROTATEABLE);
    }

    public boolean isMirrorable()
    {
        return capabilities.contains(MIRRORABLE);
    }

    public Iterator<Tile> iterator()
    {
        return readOnlyTilesView.iterator();
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

    public int getWidth()
    {
        return size.getWidth();
    }

    public int getHeight()
    {
        return size.getHeight();
    }
}

