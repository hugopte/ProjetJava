package map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

import element.motionless.MotionlessElement;




public class map extends Observable {

	public MotionlessElement		elements[][];
	public final ArrayList<Mobile>	mobiles;
	private int					width;
	private int					height;
	private Hero  	  			hero;

	private map() {
		this.mobiles = new ArrayList<Mobile>();
	}

	public map(final String fileName) throws IOException {
		this();
	}
	

	@Override
	public MotionlessElement getElements(final int x, final int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}

	@Override
	public Hero getHero() {
		return this.hero;
	}

	private void addElement(final MotionlessElement element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setNettleWorld(this);
		}
		this.setChanged();
	}

	@Override
	public void addMobile(final Mobile mobile, final int x, final int y) {
		this.mobiles.add(mobile);
		mobile.setNettleWorld(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public void addMobile(final Hero hero, final int x, final int y) {
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}
}