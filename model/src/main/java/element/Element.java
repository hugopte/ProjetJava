package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public abstract class Element  {
	public Image			Elem;
	private Permeability	permeability;
	private String	        NomImage;
	private     int Y;
	private	    int X;

	public Element( String NomImage ,Permeability permeability,int PositionY,int PositionX) {
		this.permeability = permeability ;
		this.Y = PositionY;
		this.X = PositionX;
		this.NomImage = NomImage;
		try {
			this.Elem = ImageIO.read(new File(NomImage));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
	}

	
	public String getNomImage() {
		return NomImage;
	}

	public void setNomImage(String nomImage) {
		NomImage = nomImage;
	}

	public Image getImage() {
		return Elem;
	}

	public void setImage(Image elem) {
		Elem = elem;
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}


	public int getY() {
		return Y;
	}


	public void setY(int y) {
		Y = y;
	}


	public int getX() {
		return X;
	}


	public void setX(int x) {
		X = x;
	}


	


	
	

	
	
}
