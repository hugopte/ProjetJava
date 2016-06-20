package controller;



import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


/**
 * The Class Controller.
 * 
 * @author Hugo Pette
 * 
 */
public class Controller implements IController {
	/**
	 * The Model
	 */
	private IModel	model;
	/**
	 * The View
	 */
	private IView	view;
	
	
	/**
	 * Gets the Views.
	 *
	 * @return the Views
	 */
	
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

	/**
	 * The orderperform
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case UP:
				
				this.model.MoveUP();
				break;
			case DOWN:
				
				this.model.MoveDW();
				break;
			case LEFT:
				this.model.MoveLF();
				break;
			case RIGHT:
				this.model.MoveRT();
				break;
			case SHOOT:
			this.model.shoot();
				break;
			case UPPERRIGHT:
				this.model.MoveUPRT();
				break;
			case DOWNRIGHT :
				this.model.MoveDWRT();
				break;
			case UPPERLEFT:
				this.model.MoveUPLF();
				break;
			case DOWNLEFT:
				this.model.MoveDWLF();
				break;
			case NOP:
				this.model.Refresh();
				
				break;
			

			default:
				break;
		}
	}
	/**
	 * Gets the Model.
	 *
	 * @return the Model
	 */
	public IModel getModel() {
		return model;
	}
}
