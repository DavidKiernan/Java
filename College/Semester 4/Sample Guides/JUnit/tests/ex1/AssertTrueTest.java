package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertTrueTest {

    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    @Test
    public void evenNumberTest(){
        AssertTrueTest asft = new AssertTrueTest();
        assertTrue(asft.isEvenNumber(4));
    }
}


