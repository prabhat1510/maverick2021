package entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


    private final Calculator calculator = new Calculator();

    @Test
     public void addition(){
         assertEquals(2,calculator.add(1,1));
     }

     @Test
    public void division(){
        assertEquals(2,calculator.div(4,2));
     }

     @Test
     public void division_by_zero(){
         //assertEquals("",calculator.div(1,0));
         Exception exception;
         //exception = assertThrows(ArithmeticException.class,calculator.div(1,0));

         exception = assertThrows(ArithmeticException.class,()->{calculator.div(1,0);});
         assertEquals("/ by zero",exception.getMessage());
    }
}
