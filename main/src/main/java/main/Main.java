package main;

import controller.Controller;
import map.map;
import model.Model;
import view.View;

/*
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	public static void main(final String[] args) {
		final map model = new map();
		//final View view = new View(model);
		final Controller controller = new Controller(/*view,*/ model);
		//view.setController(controller);
		controller.control();
	}
}