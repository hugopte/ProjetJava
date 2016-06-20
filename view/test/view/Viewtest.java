package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import contract.ControllerOrder;
import view.View;
public class Viewtest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void keyCodeToControllerOrdertest() {
		final ControllerOrder UP = View.keyCodeToControllerOrder(true,false,false,false,false);
		final ControllerOrder DOWN = View.keyCodeToControllerOrder(false,true,false,false,false);
		final ControllerOrder RIGHT = View.keyCodeToControllerOrder(false,false,false,true,false);
		final ControllerOrder LEFT = View.keyCodeToControllerOrder(false, false, true, false,false);
		final ControllerOrder shoot = View.keyCodeToControllerOrder(false, false, false, false, true);
		final ControllerOrder UPLEFT = View.keyCodeToControllerOrder(true, false, true,false, false);
		final ControllerOrder UPRIGHT = View.keyCodeToControllerOrder(true, false, false,true, false);
		final ControllerOrder DOWNRIGHT = View.keyCodeToControllerOrder(false, true, false, true, false);
		final ControllerOrder DOWNLEFT =View.keyCodeToControllerOrder(false, true, true, false, false);
	
		assertEquals(ControllerOrder.UP, UP);
		assertEquals(ControllerOrder.DOWN, DOWN);
		assertEquals(ControllerOrder.LEFT, LEFT);
		assertEquals(ControllerOrder.RIGHT,RIGHT);
		assertEquals(ControllerOrder.SHOOT, shoot);
		assertEquals(ControllerOrder.UPPERLEFT, UPLEFT);
		assertEquals(ControllerOrder.UPPERRIGHT, UPRIGHT);
		assertEquals(ControllerOrder.DOWNLEFT,DOWNLEFT);
		assertEquals(ControllerOrder.DOWNRIGHT,DOWNRIGHT);
		
	}

}
