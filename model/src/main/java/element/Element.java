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
	 * Root of the picture
	 * @param permeability
	 * Type of the element
	 * @param PositionY
	 * PositionY of the element
	 * @param PositionX
	 * PositionX of the element
	 * 
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
	 * Define NomImage
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
	 * Define Element
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
	 * Define Permeability
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
 * Define the position Y
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
 * Define the position X
 */
	public void setX(int x) {
		X = x;
	}
	
}
