package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Create the elements
 * @author Hugo Pette
 *
 */

public abstract class Element  {
	
	/** the Elem  */
	
	public Image			Elem;
	
	/** the permeability*/
	
	private Permeability	permeability;
	
	/** the NomImage*/
	
	private String	        NomImage;
	
	/** the Y*/
	
	private     int Y;
	
	/**the X*/
	
	private	    int X;

	/**
	 * Instantiate new element
	 * @param NomImage
	 * @param permeability
	 * @param PositionY
	 * @param PositionX
	 */
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

	/**
	 * GetNomImage
	 * @return NomImage
	 */
	public String getNomImage() {
		return NomImage;
	}

	/**
	 * SetNomImage
	 * @param nomImage
	 */
	public void setNomImage(String nomImage) {
		NomImage = nomImage;
	}

	/**
	 * GetImage
	 * @return Elem
	 */
	public Image getImage() {
		return Elem;
	}
	
	/**
	 * SetImage
	 * @param elem
	 */
	public void setImage(Image elem) {
		Elem = elem;
	}

	/**
	 * GetPermeability
	 * @return permeability
	 */
	public Permeability getPermeability() {
		return permeability;
	}

	/** 
	 * SetPermeability
	 * @param permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	/**
	 * GetY
	 * @return Y
	 */
	public int getY() {
		return Y;
	}

/**
 * SetY
 * @param y
 */
	public void setY(int y) {
		Y = y;
	}

/** 
 * GetX
 * @return X
 */
	public int getX() {
		return X;
	}

/**
 * SetX
 * @param x
 */
	public void setX(int x) {
		X = x;
	}


	


	
	

	
	
}
