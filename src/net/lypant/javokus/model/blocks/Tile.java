package net.lypant.javokus.model.blocks;

public class Tile
{
    private final static int MIN_COORDINATE_VALUE = 0;
    private final static int MAX_COORDINATE_VALUE = 4;
    private int x = MIN_COORDINATE_VALUE;
    private int y = MIN_COORDINATE_VALUE;

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
}

