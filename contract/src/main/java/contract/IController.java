package contract;

import java.io.IOException;

/**
 * The Interface IController.
 *
 * 
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 * 
	 * the controller order
	 * @throws IOException 
	 */
	public void orderPerform(ControllerOrder controllerOrder) ;
}
