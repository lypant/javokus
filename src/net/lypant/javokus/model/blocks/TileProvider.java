package net.lypant.javokus.model.blocks;

import java.util.*;

public interface TileProvider extends Iterable<Tile>
{
    public int getTileCount();
}

