package element.mobile;
import element.Permeability;


public class Hero extends Mobile
{
	private static int XH;
	private static int YH;
	
	
	
	
	public Hero(int PositionYH, int PositionXH) 
	{	super("C:/Users/Hugo PETTE/git/ProjetJava/Sprite/lorann_l.png" , Permeability.BLOCKING, PositionYH, PositionXH);
		Hero.setYH (PositionYH);
		Hero.setXH(PositionXH);
		System.out.println(getYH() + "<--yh xh -->  " +getXH());
		
	
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