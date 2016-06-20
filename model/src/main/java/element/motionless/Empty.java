package element.motionless;

import element.Permeability;
/**
 * Element Empty of the map
 * @author RICOUARTTANGUY
 *
 */
public class Empty extends MotionLessElement {
	/**
	 * Define the permeability and the Sprite of the element Empty
	 */
	public Empty() {
		super("C:/Users/Hugo PETTE/git/ProjetJava/Sprite/empty.png",Permeability.PENETRABLE);
	}

}