package element;

import javax.swing.ImageIcon;

public abstract class Element {

	public Permeability permeability;
	public ImageIcon sprite;
	
	public Element(Permeability perm, String sprite) {
		this.permeability = perm;
		this.sprite = new ImageIcon(getClass().getResource(sprite));

	}

	public Permeability getPerm() {
			return permeability;
		}

	public void setPerm(Permeability perm) {
		this.permeability = perm;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = new ImageIcon(getClass().getResource(sprite));
	}
}