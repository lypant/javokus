package net.lypant.javokus.model.blocks;

public class Size
{
    private int width = 0;
    private int minX = Integer.MAX_VALUE;
    private int maxX = Integer.MIN_VALUE;
    private int height = 0;
    private int minY = Integer.MAX_VALUE;
    private int maxY = Integer.MIN_VALUE;

    public void extendWithTile(Tile tile)
    {
        updateMinMaxValues(tile);
        recalculateSize();
    }

    private void updateMinMaxValues(Tile tile)
    {
        updateMinMaxX(tile);
        updateMinMaxY(tile);
    }

    private void updateMinMaxX(Tile tile)
    {
        minX = Math.min(minX, tile.getX());
        maxX = Math.max(maxX, tile.getX());
    }

    private void updateMinMaxY(Tile tile)
    {
        minY = Math.min(minY, tile.getY());
        maxY = Math.max(maxY, tile.getY());
    }

    private void recalculateSize()
    {
        recalculateWidth();
        recalculateHeight();
    }

    private void recalculateWidth()
    {
        width = maxX - minX + 1;
    }

    private void recalculateHeight()
    {
        height = maxY - minY + 1;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}

