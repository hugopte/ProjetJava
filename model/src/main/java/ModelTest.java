

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.Model;
import model.Map;

public class ModelTest {

	@Before
	public void setUp() throws Exception {
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMap() {
		Model model = new Model();
		 Map testMap = new Map("C:/Users/Hugo PETTE/git/ProjetJava/model/images/map6.txt",model);
	
		int x=0, y=0;
		for(y=0; y<12	; y++)
		{
			for(x=0; x<20; x++)
			{
				assertNotNull(testMap.getElem(y,x));
			}
		}
	}

}
