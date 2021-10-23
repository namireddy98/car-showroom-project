package carshowroom;

import static org.junit.Assert.*;

import org.junit.Test;

public class amountUnitTest {

	@Test
	public void test() {
		Cars unit = new Cars();
		double output =  unit.calculateAmount(4,5);
		assertEquals(20,output);
	}
}
