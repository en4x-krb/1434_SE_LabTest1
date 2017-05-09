import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Car carEngine;
	@Before
	public void setUp() throws Exception {
		carEngine = new Car(120);
	}

	@Test
	public void testGetEngineCapacity() {
		//fail("Not yet implemented");
		assertEquals(120,carEngine.getEngineCapacity());
	}

}
