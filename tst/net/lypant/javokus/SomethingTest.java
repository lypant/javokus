package net.lypant.javokus;

import static org.junit.Assert.*;
import org.junit.Test;

public class SomethingTest
{
    @Test
    public void evenNumber()
    {
        Something sth = new Something();
        assertTrue(sth.isEven(4));
    }

    @Test
    public void oddNumber()
    {
        Something sth = new Something();
        assertFalse(sth.isEven(3));
    }
}

