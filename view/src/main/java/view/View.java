package view;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Hugo PETTE
 */
public class View implements IView, Runnable {

	/** The frame. */
	
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param  toucheUP
	 *          the touch UP pressed
	 * @param  toucheDOWN
	 *          the touch DOWN pressed
	 * @param  toucheLEFT
	 *          the touch LEFT pressed
	 * @param toucheSPACE
	 * 			the touch SPACE pressed
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final boolean UP, final boolean DOWN ,final boolean LEFT,final boolean RIGHT,final boolean SPACE ) 
	{
		if (UP ==true && DOWN == false ){
			if(LEFT == true){
				
				return ControllerOrder.UPPERLEFT;
			}
			if(RIGHT == true){
				
				return ControllerOrder.UPPERRIGHT;
			}
			else{
				
				return ControllerOrder.UP;
			}
		}
		else if(UP ==false && DOWN == false){
			if(LEFT == true){
				
				return ControllerOrder.LEFT;
			}
			if(RIGHT == true){
				return ControllerOrder.RIGHT;
			}
				
		}else if(UP ==false && DOWN == true){
			
		
		
			if(LEFT == true){
				
				return ControllerOrder.DOWNLEFT;			
			}
			if(RIGHT == true){
				
				return ControllerOrder.DOWNRIGHT;
			}
			else{
			return ControllerOrder.DOWN;
		}
		}
		else{
			return ControllerOrder.NOP;
			
					}
		if(SPACE == true){
			
			return ControllerOrder.SHOOT;
		}
		
				return ControllerOrder.NOP;
//		if(LEFT == true){
//			if(DOWN == true){
//				return ControllerOrder.DOWNLEFT;
//			}
//			if(UP == true){
//				return ControllerOrder.UPPERLEFT;
//			}
//			else {
//				return ControllerOrder.LEFT;
//			}
//		
//		}
//		if(RIGHT == true){
//			if(DOWN == true){
//				return ControllerOrder.DOWNRIGHT;
//			}
//			if(UP == true){
//				return ControllerOrder.UPPERRIGHT;
//			}
//			else {
//				return ControllerOrder.RIGHT;
//			}
//		}
		
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	//public void printMessage(final String message) {
	//	this.viewFrame.printMessage(message);
	//}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	/*
	public void printMessage(String string) {
		this.viewFrame.printMessage(string);
		
	}*/

	
	
}
