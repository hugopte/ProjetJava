package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.ILorannMap;
import contract.IModel;
import contract.IView;
import element.mobile.Hero;


// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {
	private final ILorannMap	map;
	private ILorannMap			LorannMeeting;
	private IView				lorrannFrame;
	
	

	
	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(/*final IView view, final IModel model,*/ILorannMap map) {
		//this.setView(view);
		//this.setModel(model);
		this.map = map;
		this.map.addMobile(new Hero(null), 18, 15);
	}
		
	private ILorannMap getLorannMap() {
		return this.map;
	}

	private ILorannMap getLorannMeeting() {
		return this.LorannMeeting;
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
	private void setModel(final IModel model) {
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

}
