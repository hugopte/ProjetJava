
package element.mobile;
import element.Permeability;

/**
 * Creates a hero
 * @author Nicolas
 *
 */
public class Hero extends Mobile implements Runnable 
{
	/** XH */
	private static int XH;
	/** YH */
	private static int YH;
	/** imagehero */ 
	private static String imagehero = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_br.png";
	/** imagehero1 */ 
	private static String imagehero1 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_b.png";
	/** imagehero2 */ 

	private static String imagehero2 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_bl.png";
	/** imagehero3 */ 

	private static String imagehero3 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_l.png";
	/** imagehero4 */ 

	private static String imagehero4 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_ul.png";
	/** imagehero5 */ 

	private static String imagehero5 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_u.png";
	/** imagehero6 */ 

	private static String imagehero6 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_ur.png";
	/** imagehero7 */ 

	private static String imagehero7 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_r.png";
	/** imagehero8 */ 

	private static String imagehero8 = "C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_br.png";
	
	/**
	 * Instantiates a hero
	 * @param PositionYH
	 * Initial position YH of the Hero
	 * @param PositionXH
	 * Initial position XH of the Hero
	 */
	
	public Hero(int PositionYH, int PositionXH) {
		super( imagehero , Permeability.BLOCKING, PositionYH, PositionXH);
		Hero.setYH (PositionYH);
		Hero.setXH(PositionXH);
		
		
	
	}


	/**
	 * SetImagehero1
	 * @param imagehero1
	 * Image Heroes one
	 */

	public static void setImagehero1(String imagehero1) {
		Hero.imagehero1 = imagehero1;
	}



	/**
	 * SetImagehero1
	 * @return imagehero1
	 */
	public static String getImagehero1() {
		return imagehero1;
	}


	/**
	 * GetImagehero2
	 * @return imagehero2
	 */

	public static String getImagehero2() {
		return imagehero2;
	}


	/**
	 * GetImagehero3
	 * @return imagehero3
	 */

	public static String getImagehero3() {
		return imagehero3;
	}


/**
 * GetImagehero4
 * @return imagehero4
 */

	public static String getImagehero4() {
		return imagehero4;
	}


/**
 * GetImagehero5
 * @return imagehero5
 */

	public static String getImagehero5() {
		return imagehero5;
	}


/**
 * GetImagehero6
 * @return imagehero6
 */

	public static String getImagehero6() {
		return imagehero6;
	}


	/**
	 * GetImagehero
	 * @return imagehero
	 */

	public static String getImagehero() {
		return imagehero;
	}

	
/**
 *  Sets ImageHero
 * @param imagehero
 * The hero is a imagehero
 */
	public static void setImagehero(String imagehero) {
		Hero.imagehero = imagehero;
	}



/**
 * Get position XH
 * @return XH
 */
	public static int getXH() {
		return XH;
	}



/**
 * Set position XH
 * @param xH
 * Position XH
 */
	public static void setXH(int xH) {
		XH = xH;
	}
/**
 * Get  position YH
 * @return YH
 */
	public static int getYH() {
		return YH;
	}



/**
 * Set position YH
 * @param yH
 * Position YH
 */
	public static void setYH(int yH) {
		YH = yH;
	}



/**
 * Get Image hero 7
 * @return imagehero7
 */
	public static String getImagehero7() {
		return imagehero7;
	}



/**
 * Set Image Hero 7
 * @param imagehero7
 * Heroes is an imagehero7
 */
	public static void setImagehero7(String imagehero7) {
		Hero.imagehero7 = imagehero7;
	}


/**
 * Animation of the hero but not implemented yet
 */
	public void run() {
		System.out.println("RUN!!!!!");
		while(1!=0){System.out.println("Lancement animation");
		 imagehero = imagehero1;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // TODO Auto-generated method stub
		 imagehero = imagehero2;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero3;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero4;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero5;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero6;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero7;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 imagehero = imagehero8;
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

}
