package net.lypant.javokus.model.blocks;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformability.Rotateability.*;
import static net.lypant.javokus.model.blocks.Transformability.Reflectability.*;

import static net.lypant.javokus.model.blocks.Polyominos.Name.*;

public class Polyominos
{
    public enum Name
    {
        MONOMINO,
        DOMINO,
        PENTOMINO_I,
        PENTOMINO_F,
        PENTOMINO_N
    }

    private static Polyominos instance = new Polyominos();
    private Map<Name, Polyomino> polyominos;

    private Polyominos()
    {
        polyominos = new HashMap<Name, Polyomino>();
        createPolyominos();
    }

    private void createPolyominos()
    {
        polyominos.put(MONOMINO, createMonomino());
        polyominos.put(DOMINO, createDomino());
        polyominos.put(PENTOMINO_I, createPentominoI());
        polyominos.put(PENTOMINO_F, createPentominoF());
        polyominos.put(PENTOMINO_N, createPentominoN());
    }

    private Polyomino createMonomino()
    {
        Polyomino polyomino = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        return polyomino;
    }

    private Polyomino createDomino()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(0, 1));
        return polyomino;
    }

    private Polyomino createPentominoI()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(0, 2));
        polyomino.addTile(new Tile(0, 3));
        polyomino.addTile(new Tile(0, 4));
        return polyomino;
    }

    private Polyomino createPentominoF()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(1, 2));
        polyomino.addTile(new Tile(2, 2));
        return polyomino;
    }

    private Polyomino createPentominoN()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(1, 2));
        polyomino.addTile(new Tile(1, 3));
        return polyomino;
    }

    public static Polyominos getInstance()
    {
        return instance;
    }

    public Polyomino getPolyomino(Name name)
    {
        return polyominos.get(name);
    }
}

