import classStuff.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void equalsFour(){
        var calc = new SimpleCalculator();
        assertEquals(4,calc.add(2,2));
    }

    @Test
    void threePlusSevenEqualsTen(){
        var calc = new SimpleCalculator();
        assertEquals(10,calc.add(3,7));
    }



}