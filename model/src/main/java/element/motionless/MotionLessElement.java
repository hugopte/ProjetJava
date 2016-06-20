package element.motionless;
import element.Element;
import element.Permeability;
/**
 * Define the motionLessElement
 * @author RICOUARTTANGUY
 *
 */
public abstract class MotionLessElement extends Element 
{
/**
 * Define the picture and the permeability of the motionlesselement
 * @param picture
 * define Picture
 * @param permeability
 * define permeability
 */
	public MotionLessElement(String picture, final Permeability permeability) 
	{
		super(picture, permeability,0,0);
	}

}