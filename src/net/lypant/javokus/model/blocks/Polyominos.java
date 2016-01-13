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

        TROMINO_I,
        TROMINO_V,

        TETROMINO_O,
        TETROMINO_I,
        TETROMINO_T,
        TETROMINO_Z,
        TETROMINO_L,

        PENTOMINO_X,
        PENTOMINO_I,
        PENTOMINO_T,
        PENTOMINO_U,
        PENTOMINO_V,
        PENTOMINO_W,
        PENTOMINO_Z,
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

        polyominos.put(TROMINO_I, createTrominoI());
        polyominos.put(TROMINO_V, createTrominoV());

        polyominos.put(TETROMINO_O, createTetrominoO());
        polyominos.put(TETROMINO_I, createTetrominoI());
        polyominos.put(TETROMINO_T, createTetrominoT());
        polyominos.put(TETROMINO_Z, createTetrominoZ());
        polyominos.put(TETROMINO_L, createTetrominoL());

        polyominos.put(PENTOMINO_X, createPentominoX());
        polyominos.put(PENTOMINO_I, createPentominoI());
        polyominos.put(PENTOMINO_T, createPentominoT());
        polyominos.put(PENTOMINO_U, createPentominoU());
        polyominos.put(PENTOMINO_V, createPentominoV());
        polyominos.put(PENTOMINO_W, createPentominoW());
        polyominos.put(PENTOMINO_Z, createPentominoZ());
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

    private Polyomino createTrominoI()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(0, 2));
        return polyomino;
    }

    private Polyomino createTrominoV()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        return polyomino;
    }

    private Polyomino createTetrominoO()
    {
        Polyomino polyomino = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        return polyomino;
    }

    private Polyomino createTetrominoI()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(0, 2));
        polyomino.addTile(new Tile(0, 3));
        return polyomino;
    }

    private Polyomino createTetrominoT()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(2, 1));
        return polyomino;
    }

    private Polyomino createTetrominoZ()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(2, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        return polyomino;
    }

    private Polyomino createTetrominoL()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(0, 2));
        return polyomino;
    }

    private Polyomino createPentominoX()
    {
        Polyomino polyomino = new Polyomino(NOT_ROTATEABLE, NOT_REFLECTABLE);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(2, 1));
        polyomino.addTile(new Tile(1, 2));
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

    private Polyomino createPentominoT()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(0, 2));
        polyomino.addTile(new Tile(1, 2));
        polyomino.addTile(new Tile(2, 2));
        return polyomino;
    }

    private Polyomino createPentominoU()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(2, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(2, 1));
        return polyomino;
    }

    private Polyomino createPentominoV()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(0, 0));
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(2, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(0, 2));
        return polyomino;
    }

    private Polyomino createPentominoW()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_4_ORIENTATIONS, OPTIONALLY_REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(2, 0));
        polyomino.addTile(new Tile(0, 1));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(0, 2));
        return polyomino;
    }

    private Polyomino createPentominoZ()
    {
        Polyomino polyomino = new Polyomino(ROTATEABLE_2_ORIENTATIONS, REFLECTABLE_2_ORIENTATIONS);
        polyomino.addTile(new Tile(1, 0));
        polyomino.addTile(new Tile(2, 0));
        polyomino.addTile(new Tile(1, 1));
        polyomino.addTile(new Tile(0, 2));
        polyomino.addTile(new Tile(1, 2));
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

