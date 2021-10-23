package carshowroom;

import static org.junit.Assert.*;

import org.junit.Test;

public class modelUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Cars unit = new Cars();
		double output =  unit.displayModel(4);
		assertEquals(4,output);
	}

}
