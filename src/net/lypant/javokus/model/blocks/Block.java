package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformation.*;

public class Block implements Measurable, Transformability, Transformation, TileProvider
{
    private final Polyomino polyomino;
    private final Transformation transformation;

    public Block(Polyomino polyomino, Transformation transformation)
    {
        this.polyomino = polyomino;
        this.transformation = transformation;
    }

    @Override
    public int getWidth()
    {
        int result = 0;

        switch(getOrientation())
        {
            case NORMAL_0:          // fall through
            case NORMAL_180:        // fall through
            case REFLECTED_0:       // fall thhrough
            case REFLECTED_180:     result = polyomino.getWidth();  break;
            case NORMAL_90:         // fall through
            case NORMAL_270:        // fall through
            case REFLECTED_90:      // fall through
            case REFLECTED_270:     result = polyomino.getHeight(); break;
            default: assert false : "Unhandled orientation: " + getOrientation(); break;
        }

        return result;
    }

    @Override
    public int getHeight()
    {
        int result = 0;

        switch(getOrientation())
        {
            case NORMAL_0:          // fall through
            case NORMAL_180:        // fall through
            case REFLECTED_0:       // fall through
            case REFLECTED_180:     result = polyomino.getHeight(); break;
            case NORMAL_90:         // fall through
            case NORMAL_270:        // fall through
            case REFLECTED_90:      // fall through
            case REFLECTED_270:     result = polyomino.getWidth();  break;
            default: assert false : "Unhandled orientation: " + getOrientation(); break;
        }

        return result;
    }

    @Override
    public boolean isRotateable()
    {
        return polyomino.isRotateable();
    }

    @Override
    public boolean isReflectable()
    {
        return polyomino.isReflectable();
    }

    @Override
    public boolean isReflectableOptionally()
    {
        return polyomino.isReflectableOptionally();
    }

    @Override
    public int getRotationOrientationCount()
    {
        return polyomino.getRotationOrientationCount();
    }

    @Override
    public int getReflectionOrientationCount()
    {
        return polyomino.getReflectionOrientationCount();
    }

    @Override
    public Orientation getOrientation()
    {
        return transformation.getOrientation();
    }

    @Override
    public void resetOrientation()
    {
        transformation.resetOrientation();
    }

    @Override
    public void rotate()
    {
        transformation.rotate();
    }

    @Override
    public void reflect()
    {
        transformation.reflect();
    }

    @Override
    public Iterator<Tile> iterator()
    {
        return new Iterator<Tile>()
        {
            private Iterator<Tile> polyominoIterator = polyomino.iterator();

            @Override
            public boolean hasNext()
            {
                return polyominoIterator.hasNext();
            }

            @Override
            public Tile next()
            {
                return transformPolyominoTileForCurrentBlockOrientation(polyominoIterator.next());
            }

            private Tile transformPolyominoTileForCurrentBlockOrientation(Tile polyominoTile)
            {
                int x = calculatePolyominoTileXCoordinateForCurrentBlockOrientation(polyominoTile);
                int y = calculatePolyominoTileYCoordinateForCurrentBlockOrientation(polyominoTile);

                return new Tile(x, y);
            }

            private int calculatePolyominoTileXCoordinateForCurrentBlockOrientation(Tile polyominoTile)
            {
                int result = 0;

                switch(transformation.getOrientation())
                {
                    case NORMAL_0:      result = calculateXNormal0(polyominoTile);      break;
                    case NORMAL_90:     result = calculateXNormal90(polyominoTile);     break;
                    case NORMAL_180:    result = calculateXNormal180(polyominoTile);    break;
                    case NORMAL_270:    result = calculateXNormal270(polyominoTile);    break;
                    case REFLECTED_0:   result = calculateXReflected0(polyominoTile);   break;
                    case REFLECTED_90:  result = calculateXReflected90(polyominoTile);  break;
                    case REFLECTED_180: result = calculateXReflected180(polyominoTile); break;
                    case REFLECTED_270: result = calculateXReflected270(polyominoTile); break;
                    default: assert false : "Unhandled orientation: " + transformation.getOrientation(); break;
                }

                return result;
            }

            private int calculateXNormal0(Tile polyominoTile)
            {
                return polyominoTile.getX();
            }

            private int calculateXNormal90(Tile polyominoTile)
            {
                return polyominoTile.getY();
            }

            private int calculateXNormal180(Tile polyominoTile)
            {
                return getWidth() - 1 - polyominoTile.getX();
            }

            private int calculateXNormal270(Tile polyominoTile)
            {
                return getWidth() - 1 - polyominoTile.getY();
            }

            private int calculateXReflected0(Tile polyominoTile)
            {
                return getWidth() - 1 - polyominoTile.getX();
            }

            private int calculateXReflected90(Tile polyominoTile)
            {
                return getWidth() - 1 - polyominoTile.getY();
            }

            private int calculateXReflected180(Tile polyominoTile)
            {
                return polyominoTile.getX();
            }

            private int calculateXReflected270(Tile polyominoTile)
            {
                return polyominoTile.getY();
            }

            private int calculatePolyominoTileYCoordinateForCurrentBlockOrientation(Tile polyominoTile)
            {
                int result = 0;

                switch(transformation.getOrientation())
                {
                    case NORMAL_0:      result = calculateYNormal0(polyominoTile);      break;
                    case NORMAL_90:     result = calculateYNormal90(polyominoTile);     break;
                    case NORMAL_180:    result = calculateYNormal180(polyominoTile);    break;
                    case NORMAL_270:    result = calculateYNormal270(polyominoTile);    break;
                    case REFLECTED_0:   result = calculateYReflected0(polyominoTile);   break;
                    case REFLECTED_90:  result = calculateYReflected90(polyominoTile);  break;
                    case REFLECTED_180: result = calculateYReflected180(polyominoTile); break;
                    case REFLECTED_270: result = calculateYReflected270(polyominoTile); break;
                    default: assert false : "Unhandled orientation: " + transformation.getOrientation(); break;
                }

                return result;
            }

            private int calculateYNormal0(Tile polyominoTile)
            {
                return polyominoTile.getY();
            }

            private int calculateYNormal90(Tile polyominoTile)
            {
                return getHeight() - 1 - polyominoTile.getX();
            }

            private int calculateYNormal180(Tile polyominoTile)
            {
                return getHeight() - 1 - polyominoTile.getY();
            }

            private int calculateYNormal270(Tile polyominoTile)
            {
                return polyominoTile.getX();
            }

            private int calculateYReflected0(Tile polyominoTile)
            {
                return polyominoTile.getY();
            }

            private int calculateYReflected90(Tile polyominoTile)
            {
                return getHeight() - 1 - polyominoTile.getX();
            }

            private int calculateYReflected180(Tile polyominoTile)
            {
                return getHeight() - 1 - polyominoTile.getY();
            }

            private int calculateYReflected270(Tile polyominoTile)
            {
                return polyominoTile.getX();
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int getTileCount()
    {
        return polyomino.getTileCount();
    }
}

