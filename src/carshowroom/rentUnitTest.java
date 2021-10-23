package carshowroom;

import static org.junit.Assert.*;

import org.junit.Test;

public class rentUnitTest {

	@Test
	public void test() {
		Rent_Cars unit = new Rent_Cars();
		double output =  unit.calculateAmount(4,5);
		assertEquals(20,output);
	}

}
