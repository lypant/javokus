package net.lypant.javokus.model.blocks;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import static net.lypant.javokus.model.blocks.Transformable.Capability.*;
import net.lypant.javokus.model.blocks.Transformable.*;

public class ShapeTest
{
    @Test
    public void creation()
    {
        Shape shape = new Shape();
        assertNotNull(shape);
    }

    @Test
    public void defaultRotateability()
    {
        Transformable transformable = new Shape();
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void emptyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.noneOf(Capability.class));
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void mirrorableOnlyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(MIRRORABLE));
        assertFalse(transformable.isRotateable());
    }

    @Test
    public void rotateableOnlyCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE));
        assertTrue(transformable.isRotateable());
    }

    @Test
    public void bothCapabilitiesRotateability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE, MIRRORABLE));
        assertTrue(transformable.isRotateable());
    }

    @Test
    public void defaultMirrorability()
    {
        Transformable transformable = new Shape();
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void emptyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.noneOf(Capability.class));
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void mirrorableOnlyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(MIRRORABLE));
        assertTrue(transformable.isMirrorable());
    }

    @Test
    public void rotateableOnlyCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE));
        assertFalse(transformable.isMirrorable());
    }

    @Test
    public void bothCapabilitiesMirrorability()
    {
        Transformable transformable = new Shape(EnumSet.of(ROTATEABLE, MIRRORABLE));
        assertTrue(transformable.isMirrorable());
    }
}
