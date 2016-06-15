package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import model.Model;


// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {
	private Model	model;
	private IView	view;
	
	

	
	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller( IView view, Model model) {
		this.setView(view);
		this.setModel(model);
		
		
	}
		
	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Debut du jeu");
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}
	

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final Model model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case UP:
				//this.model.moveUp;
				break;
			case DOWN:
				//this.model.moveDown;
				break;
			case LEFT:
				//this.model.moveLeft;
				break;
			case RIGHT:
				//this.model.moveRight;
				break;
			case SHOOT:
				//this.model.shoot;
				break;
			case NOP:
				//this.model.rien;
			

			default:
				break;
		}
	}

	public Model getModel() {
		return model;
	}

	

}
