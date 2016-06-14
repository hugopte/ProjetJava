package element.motionless;

import element.Element;
import element.ISprite;
import element.Permeability;;

public abstract class MotionlessElement extends Element  {
	private final char fileSymbol;

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}

	
}