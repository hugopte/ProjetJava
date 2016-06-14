package element;

import javax.swing.ImageIcon;


public abstract class Element  {
	private ImageIcon		ElemIcon;
	private Permeability	permeability;
	private String	        IconName;

	public Element( String Image ,Permeability permeability) {
		this.permeability = permeability ;
		this.ElemIcon = new ImageIcon(Image);
		this.IconName = Image;
	}

	public ImageIcon getElemIcon() {
		return ElemIcon;
	}

	public void setElemIcon(ImageIcon elemIcon) {
		ElemIcon = elemIcon;
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public String getIconName() {
		return IconName;
	}

	public void setIconName(String iconName) {
		IconName = iconName;
	}

	
	
}
