package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Shapes.Name.*;
import static net.lypant.javokus.model.blocks.RotationAware.Capability.*;
import static net.lypant.javokus.model.blocks.MirrorAware.Capability.*;

public class Shapes
{
    public enum Name
    {
        MONOMINO,
        DOMINO,
        PENTOMINO_F
    }

    private static Shapes instance = new Shapes();
    private Map<Name, Shape> shapes;

    private Shapes()
    {
        shapes = new HashMap<Name, Shape>();
        createShapes();
    }

    public static Shapes getInstance()
    {
        return instance;
    }

    public Shape getShape(Name name)
    {
        return shapes.get(name);
    }

    private void createShapes()
    {
        shapes.put(MONOMINO, createMonomino());
        shapes.put(DOMINO, createDomino());
        shapes.put(PENTOMINO_F,createPentominoF() );
    }

    private Shape createMonomino()
    {
        Shape shape = new Shape(NOT_ROTATEABLE, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        return shape;
    }

    private Shape createDomino()
    {
        Shape shape = new Shape(ROTATEABLE_TWO_TIMES, NOT_MIRRORABLE);
        shape.addTile(new Tile(0, 0));
        shape.addTile(new Tile(0, 1));
        return shape;
    }

    private Shape createPentominoF()
    {
        Shape shape = new Shape(ROTATEABLE_FOUR_TIMES, MIRRORABLE_TWO_TIMES);
        shape.addTile(new Tile(1, 0));
        shape.addTile(new Tile(0, 1));
        shape.addTile(new Tile(1, 1));
        shape.addTile(new Tile(1, 2));
        shape.addTile(new Tile(2, 2));
        return shape;
    }
}

