import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {
		Calculation calculation = new Calculation();
		int result = calculation.add(10, 50);
		assertEquals(60,result);
		result = calculation.add(10, 5, 2);
		assertEquals(17,result);
		double getResult = calculation.add(10.5, 1.5);
		assertEquals(12.001,getResult,0.000);
		
	}

}
