package element.mobile;

import java.awt.Point;

import element.ISprite;
import element.Permeability;
import element.Sprite;

public class Monster1 extends Mobile {

	private Point lastposition;
	
	public Monster1() {
		super("Monster.png",Permeability.BLOCKING);
	}
	
}
