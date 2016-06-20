package element.mobile;

import element.Permeability;

public class Magic extends Mobile {
	private static String MagicImage= "C:/Users/Hugo PETTE/git//ProjetJava/Sprite/fireball_1.png";
	
	public Magic( int X, int Y) {
		super(getMagicImage(), Permeability.PENETRABLE, X, Y);
		// TODO Auto-generated constructor stub
	}

	public static String getMagicImage() {
		return MagicImage;
	}

	public void setMagicImage(String magicImage) {
		MagicImage = magicImage;
	}

}
