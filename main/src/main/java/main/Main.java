package main;

import contract.IModel;
import controller.Controller;
import map.map;
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
		final IModel map = new map();
		final View view = new View(map);
		final Controller controller = new Controller(view, map);
		view.setController(controller);
		controller.control();
	}
}