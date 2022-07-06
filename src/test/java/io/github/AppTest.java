package io.github;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTest(){
        assertEquals(30,Mathx.add(10,20));
    }

    @Test
    public void subtractTest(){
        assertEquals(-100,Mathx.subtract(10,110));
    }

    @Test
    public void multiplyTest(){
        assertEquals(200,Mathx.multiply(10,20));
    }

    @Test
    public void divideTest(){
        assertEquals(3,Mathx.divide(9,3));
    }
}
