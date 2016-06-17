package element.mobile;
import element.Permeability;


public class Hero extends Mobile
{
	private static int XH;
	private static int YH;
	private static String imagehero = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_br.png";
	private static String imagehero1 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_b.png";
	private static String imagehero2 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_bl.png";
	private static String imagehero3 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_l.png";
	private static String imagehero4 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_ul.png";
	private static String imagehero5 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_u.png";
	private static String imagehero6 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_ur.png";
	public Hero(int PositionYH, int PositionXH) {
		super( imagehero , Permeability.BLOCKING, PositionYH, PositionXH);
		Hero.setYH (PositionYH);
		Hero.setXH(PositionXH);

		
	
	}




	public static void setImagehero1(String imagehero1) {
		Hero.imagehero1 = imagehero1;
	}




	public static String getImagehero1() {
		return imagehero1;
	}




	public static String getImagehero2() {
		return imagehero2;
	}




	public static String getImagehero3() {
		return imagehero3;
	}




	public static String getImagehero4() {
		return imagehero4;
	}




	public static String getImagehero5() {
		return imagehero5;
	}




	public static String getImagehero6() {
		return imagehero6;
	}




	public static String getImagehero() {
		return imagehero;
	}




	public static void setImagehero(String imagehero) {
		Hero.imagehero = imagehero;
	}




	public static int getXH() {
		return XH;
	}




	public static void setXH(int xH) {
		XH = xH;
	}

	public static int getYH() {
		return YH;
	}




	public static void setYH(int yH) {
		YH = yH;
	}




	

	
		
	

	

}