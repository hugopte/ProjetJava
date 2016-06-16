package controller;



import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;



// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {
	private IModel	model;
	private IView	view;
	
	

	
	public IView getView() {
		return view;
	}

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller( IView view, IModel model) {
		this.setView(view);
		this.setModel(model);
		
		
	}
		
	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()
	 */
//	public void control() {
//		this.view.printMessage("Debut du jeu");
//	}

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
				System.out.println("UP");
				this.model.MoveUP();
				break;
			case DOWN:
				System.out.println("DOWN");
				this.model.MoveDW();
				break;
			case LEFT:
				this.model.MoveLF();
				break;
			case RIGHT:
				this.model.MoveRT();
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

	public IModel getModel() {
		return model;
	}

	public void control() {
		this.view.printMessage("hello");
		
	}

	

}
