package contract;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.w3c.dom.Element;

import element.mobile.Hero;
import element.mobile.Mobile;
import element.motionless.MotionlessElement;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {
	public int getWidth();

	public int getHeight();

	public MotionlessElement getElements(int x, int y);

	public Hero getHero();

	public void addMobile(Mobile mobile, int x, int y);

	public void addMobile(Hero hero, int x, int y);

	public void setMobileHasChanged();

	public Element[][] getElements();

	public ArrayList<Mobile> getMobiles();

	public void addObserver(Observer o);
}
