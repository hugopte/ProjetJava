package element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HeroTest {

	@Before
	public void setUp() throws Exception {
		Hero hero = new Hero();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testImagehero() {
		
		assertNotNull(Hero.getImagehero());
	}

}
