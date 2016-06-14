package element.mobile;

import java.awt.Point;

import contract.ILorannMap;
import element.Element;
import element.ISprite;
import element.Permeability;



public abstract class Mobile extends Element  {  //implementer avec la vue
	private final Point position;

	public Mobile(final ISprite sprite) {
		super(sprite, Permeability.BLOCKING);
		this.position = new Point();
	}

	public int getX() {
		return this.position.x;
	}

	protected void setX(final int x) {
		if ((x >= 0) && (x < this.getLorannMap().getWidth())) {
			this.position.x = x;
			this.getLorannMap().setMobileHasChanged();
		}
	}

	public int getY() {
		return this.position.y;
	}

	protected void setY(final int y) {
		if ((y >= 0) && (y < this.getLorannMap().getHeight())) {
			this.position.y = y;
			this.getLorannMap().setMobileHasChanged();
		}
	}

	public Point getPosition() {
		return this.position;
	}

	public void setLorannMap(final ILorannMap LorannMap, final int x, final int y) {
		super.setLorannMap(LorannMap);
		this.setX(x);
		this.setY(y);
	}

	private boolean isMovePossible(final int x, final int y) {
		return (this.getLorannMap().getElements(x, y).getPermeability() != Permeability.BLOCKING);
	}

	public void moveUp() {
		if (this.isMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}

	public void moveLeft() {
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}

	public void moveDown() {
		if (this.isMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}

	public void moveRight() {
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
}
