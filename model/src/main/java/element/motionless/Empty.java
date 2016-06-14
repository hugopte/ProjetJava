package element.motionless;

import element.Permeability;
import element.Sprite;

public class Empty extends MotionlessElement {

	public Empty() {
		super(new Sprite( "bag.png"),Permeability.PENETRABLE, 'G');
		// TODO Auto-generated constructor stub
	}

}