package element.mobile;

import java.awt.Point;

import element.ISprite;
import element.Sprite;

public class Monster1 extends Mobile {

	private Point lastposition;
	
	public Monster1(ISprite sprite) {
		super(new Sprite("monster_1.png"));
	}
	private void saveLastPosition() {
		if ((this.lastposition.getX() != this.getPosition().getX()) || (this.lastposition.getY() != this.getPosition().getY())) {
			this.lastposition.setLocation(this.getPosition().x, this.getPosition().y);
		}
	}
}
