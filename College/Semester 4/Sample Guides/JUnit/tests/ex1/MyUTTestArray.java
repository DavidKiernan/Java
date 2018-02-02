package ex1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUTTestArray {
    @Test
    public void testGetTheStringArray() {
        MYUTArray myUnit = new MYUTArray();

        String[] expectedArray = {"a", "c"};

        String[] resultArray =  myUnit.getTheStringArray();

        assertArrayEquals(expectedArray, resultArray);
    }

}


