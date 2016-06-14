package element;

import java.awt.Image;

import contract.ILorannMap;


public abstract class Element  {
	private ISprite				sprite;
	private Permeability	permeability;
	private ILorannMap	map;

	public Element(final ISprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public ISprite getSprite() {
		return this.sprite;
	}

	private void setSprite(final ISprite sprite) {
		this.sprite = sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}

	protected ILorannMap getLorannMap() {
		return this.map;
	}

	public void setLorannMap(final ILorannMap map) {
		this.map =map;
	}

	public Image getImage() {
		return this.getSprite().getImage();
	}

	
}
