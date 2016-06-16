package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
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
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode ) 
	{
		switch (keyCode) 
		{
			case KeyEvent.VK_UP:
				System.out.println("haut" );
				return  ControllerOrder.UP; 					
			case KeyEvent.VK_DOWN:
					System.out.println("bas" );
						return ControllerOrder.DOWN;
			case KeyEvent.VK_LEFT:				 
					System.out.println("droite" );
						return ControllerOrder.LEFT;				
			case KeyEvent.VK_RIGHT:				
					System.out.println("right" );
						return ControllerOrder.RIGHT;
				
			default:
				return ControllerOrder.NOP;
		}
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

	public void printMessage(String string) {
		this.viewFrame.printMessage(string);
		
	}

	
	
}
