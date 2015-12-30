package net.lypant.javokus.model.blocks;

public class Tile implements Comparable<Tile>
{
    private final static int MIN_COORDINATE_VALUE = 0;
    private final static int MAX_COORDINATE_VALUE = 4;
    private int x = MIN_COORDINATE_VALUE;
    private int y = MIN_COORDINATE_VALUE;

    public Tile(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        assert x >= MIN_COORDINATE_VALUE : "x less than " + MIN_COORDINATE_VALUE;
        assert x <= MAX_COORDINATE_VALUE : "x more than " + MAX_COORDINATE_VALUE;

        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        assert y >= MIN_COORDINATE_VALUE : "y less than " + MIN_COORDINATE_VALUE;
        assert y <= MAX_COORDINATE_VALUE : "y more than " + MAX_COORDINATE_VALUE;

        this.y = y;
    }

    @Override
    public int compareTo(Tile tile)
    {
        int result;

        if(tile == null)
        {
            // null first approach
            result = 1;
        }
        else
        {
            result = compareToNonNullTile(tile);
        }

        return result;
    }

    private int compareToNonNullTile(Tile tile)
    {
        int result;

        if(isSameTileAs(tile))
        {
            result = 0;
        }
        else
        {
            result = compareToDifferentTile(tile);
        }

        return result;
    }

    private boolean isSameTileAs(Tile tile)
    {
        return this == tile;
    }

    private int compareToDifferentTile(Tile tile)
    {
        int result = Integer.compareUnsigned(y, tile.y);;

        if(result == 0)
        {
            result = Integer.compareUnsigned(x, tile.x);
        }

        return result;
    }

    @Override
    public boolean equals(Object object)
    {
        boolean result;

        if(object == null)
        {
            result = false;
        }
        else
        {
            result = checkNonNullEquality(object);
        }

        return result;
    }

    private boolean checkNonNullEquality(Object object)
    {
        boolean result;

        if(isSameClassAs(object))
        {
            result = equalsTile((Tile)object);
        }
        else
        {
            result = false;
        }

        return result;
    }

    private boolean isSameClassAs(Object object)
    {
        return object.getClass() == this.getClass();
    }

    private boolean equalsTile(Tile tile)
    {
        return compareToNonNullTile(tile) == 0;
    }
}

