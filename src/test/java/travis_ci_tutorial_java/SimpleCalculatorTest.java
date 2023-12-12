package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testSubtraction() {
	    SimpleCalculator calculator = new SimpleCalculator();
	    int result = calculator.subtract(5, 3);
	    assertEquals(2, result);
	}
	
	@Test
    public void testMultiply() {
	SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }
}

