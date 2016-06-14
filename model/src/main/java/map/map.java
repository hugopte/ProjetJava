package map;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Observable;

import contract.ILorannMap;
import element.mobile.Hero;
import element.mobile.Mobile;
import element.motionless.MotionlessElement;
import element.motionless.*;




public class map extends Observable implements ILorannMap {

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
		this.loadFile(fileName);
	}
	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	

	public MotionlessElement getElements(final int x, final int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}

	public Hero getHero() {
		return this.hero;
	}

	
	private void addElement(final MotionlessElement element, final int x, final int y) {
		this.elements[x][y] = element;
		if (element != null) {
			element.setLorannMap(this);
		}
		this.setChanged();
	}

	public void addMobile(final Mobile mobile, final int x, final int y) {
		this.mobiles.add(mobile);
		mobile.setLorannMap(this, x, y);
		this.setChanged();
		this.notifyObservers();
	}

	public void addMobile(final Hero hero, final int x, final int y) {
		this.setHero(hero);
		this.addMobile((Mobile) hero, x, y);
	}
	private void setHero(final Hero hero) {
		this.hero = hero;                                                                                                                                                           
		this.setChanged();
	}
	private void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine = 0;
		line = buffer.readLine();
		this.width = Integer.parseInt(line);
		line = buffer.readLine();
		this.height = Integer.parseInt(line);
		this.elements = new MotionlessElement[this.getWidth()][this.getHeight()];
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				this.addElement(MotionlessElements.getFromFileSymbol(line.toCharArray()[x]), x, numLine);
			}
			numLine++;
		}
		buffer.close();
		this.setChanged();
	}
	


	public org.w3c.dom.Element[][] getElements() {
		return (org.w3c.dom.Element[][]) elements;
	}

	public void setElements(MotionlessElement[][] elements) {
		this.elements = elements;
	}

	public ArrayList<Mobile> getMobiles() {
		return this.mobiles;
	}

	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}


}