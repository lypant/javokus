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
        DOMINO
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
}

