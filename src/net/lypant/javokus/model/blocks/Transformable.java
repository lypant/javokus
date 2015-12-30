package net.lypant.javokus.model.blocks;

public interface Transformable
{
    public enum Capability
    {
        ROTATEABLE,
        MIRRORABLE
    }

    public boolean isRotateable();
    public boolean isMirrorable();

    // TODO Some shapes, like DOMINO are rotateable only twice, whereas
    // some other four times, e.g. PENTOMINO_F - add a way to determine.
    // This will allow to improve performance of checking possible movements.
}

