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
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode, final int keyCode2) 
	{
		switch (keyCode) 
		{
			case KeyEvent.VK_UP:
				switch(keyCode2)
				{
					//case KeyEvent.VK_LEFT: return ControllerOrder.UPPERLEFT;
					//case KeyEvent.VK_RIGHT: return ControllerOrder.UPPERRIGHT;
					default: return ControllerOrder.UP;
				}
			case KeyEvent.VK_DOWN:
				switch(keyCode2)
				{
					//case KeyEvent.VK_LEFT: return ControllerOrder.DOWNLEFT;
					//case KeyEvent.VK_RIGHT: return ControllerOrder.DOWNRIGHT;
					default: return ControllerOrder.DOWN;
				}
			case KeyEvent.VK_LEFT:
				switch(keyCode2)
				{
					//case KeyEvent.VK_UP: return ControllerOrder.UPPERLEFT;
					//case KeyEvent.VK_DOWN: return ControllerOrder.DOWNLEFT;
					default: return ControllerOrder.LEFT;
				}
			case KeyEvent.VK_RIGHT:
				switch(keyCode2)
				{
					//case KeyEvent.VK_UP: return ControllerOrder.UPPERRIGHT;
					//case KeyEvent.VK_DOWN: return ControllerOrder.DOWNRIGHT;
					default: return ControllerOrder.RIGHT;
				}
			default:
				return ControllerOrder.NOP;
		}
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

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

	
	
}
