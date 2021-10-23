package carshowroom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ amountUnitTest.class, modelUnitTest.class, rentUnitTest.class })
public class AllTests {

}
