package element.motionless;
import element.Element;
import element.Permeability;

public abstract class MotionLessElement extends Element 
{

	public MotionLessElement(String picture, final Permeability permeability) 
	{
		super(picture, permeability,0,0);
	}

}