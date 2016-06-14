package element.mobile;
import javax.swing.ImageIcon;

import element.Permeability;

public class Hero extends Mobile
{
	private static String HERO_MOVE="C:/ProjetJava/Sprite/lorann.gif";
	private ImageIcon MoveUp;
	private ImageIcon MoveDw;
	private ImageIcon MoveLf;
	private ImageIcon MoveRt;
	private ImageIcon LorannGIF;
	
	//private boolean alive = true ;
	
	
	//---------------------------------------CONSTRUCTEURS----------------------------------------------------------------------------

	public Hero(int Y, int X) 
	{
		super(HERO_MOVE, Permeability.BLOCKING);
		this.X=X;
		this.Y=Y;	
		this.lastX=X;
		this.lastY=Y;
		this.MoveUp = new ImageIcon("C:/ProjetJava/Sprite/lorann_u.png");
		this.MoveDw = new ImageIcon("C:/ProjetJava/Sprite/lorann_b.png");
		this.MoveLf = new ImageIcon("C:/ProjetJava/Sprite/lorann_l.png");
		this.MoveRt = new ImageIcon("C:/ProjetJava/Sprite/lorann_r.png");
		this.LorannGIF = new ImageIcon("C:/ProjetJava/Sprite/lorann.gif");
	}

	public ImageIcon getMoveUp() {
		return MoveUp;
	}

	public ImageIcon getMoveDw() {
		return MoveDw;
	}

	public ImageIcon getMoveLf() {
		return MoveLf;
	}

	public ImageIcon getMoveRt() {
		return MoveRt;
	}


	public ImageIcon getLorannGIF() {
		return LorannGIF;
	}
	
	
	
	
}
