package basic_calc;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
 */

/**
 * Unit test for simple App.
 */
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
     @Test
     public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
     }
}