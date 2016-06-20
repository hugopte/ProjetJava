package element.mobile;

import element.Permeability;
/**
 * Magic class 
 * @author RICOUARTTANGUY
 *
 */
public class Magic extends Mobile {
	private static String MagicImage= "C:/Users/Hugo PETTE/git//ProjetJava/Sprite/fireball_1.png";
	/**
	 * Define position magicImage
	 * @param X
	 * Xposition image
	 * @param Y
	 * Yposition image
	 */
	public Magic( int X, int Y) {
		super(getMagicImage(), Permeability.PENETRABLE, X, Y);
		// TODO Auto-generated constructor stub
	}
/**
 * Get MagicImage
 * @return MagicImage
 */
	public static String getMagicImage() {
		return MagicImage;
	}
/**
 * 
 * @param magicImage
 * It's an magicImage
 */
	public void setMagicImage(String magicImage) {
		MagicImage = magicImage;
	}

}
