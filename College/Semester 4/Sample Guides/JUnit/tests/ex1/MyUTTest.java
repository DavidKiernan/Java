package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUTTest {
    @Test
    public void testConcatenate() {
        MyUT myUnit = new MyUT();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}

