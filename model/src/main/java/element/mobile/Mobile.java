package Element.Motion;
import element.Element;
import element.Permeability;

public abstract class Mobile extends Element 
{
	protected int X;
	protected int Y;
	protected int lastX;
	protected int lastY;
	protected int NextX;
	protected int NextY;
	
	
	
	public void setLastX(int lastX) {
		this.lastX = lastX;
	}

	public void setLastY(int lastY) {
		this.lastY = lastY;
	}

	public void setX(int currentX) {
		this.X = currentX;
	}

	public void setY(int currentY) {
		this.Y = currentY;
	}

	public int getNextX() {
		return NextX;
	}

	public void setNextX(int nextX) {
		NextX = nextX;
	}

	public int getNextY() {
		return NextY;
	}

	public void setNextY(int nextY) {
		NextY = nextY;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public int getLastX() {
		return lastX;
	}

	public int getLastY() {
		return lastY;
	}

	public Mobile(String picture, Permeability permeability) 
	{
		super(picture, permeability);

	}
	

}