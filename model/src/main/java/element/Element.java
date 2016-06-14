package element;

import map.map;

import java.awt.Image;


public abstract class Element  {
	private ISprite				sprite;
	private Permeability	permeability;
	private map	nettleWorld;

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

	protected map getNettleWorld() {
		return this.nettleWorld;
	}

	public void setNettleWorld(final map nettleWorld) {
		this.nettleWorld = nettleWorld;
	}

	public Image getImage() {
		return this.getSprite().getImage();
	}
}
