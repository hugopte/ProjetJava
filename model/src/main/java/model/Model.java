package model;

import java.awt.Image;
import java.util.Observable;

//import javax.swing.Timer;

import contract.IModel;
import element.Permeability;
import element.mobile.Hero;
import element.mobile.Magic;
import element.motionless.DoorOpen;
import element.motionless.Empty;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable  implements IModel,Runnable
{
	/** The message. */
	
	private Map Map;
	private int Score = 0;
	//private Thread thread;
	

	
	
	

	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{	System.out.print("creation du modele   ");
		
		this.setMap(new Map ("C:/Users/Hugo PETTE/git/ProjetJava/model/images/map1.txt", this));	
		//thread = new Thread(this);
		
		
	}


	
	public Observable getObservable() {
		return this;
	}



	public void MoveHero (int Y, int X){
	
	
	
	
	
	 
	
	Hero.setXH(Hero.getXH()+X);
	Hero.setYH(Hero.getYH()+Y);
		if (Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()!= Permeability.BLOCKING){
			if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.SCORE){
				Score = Score+650;
				
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.DOORCLOSED){
				
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.CRYSTALBALL){
				int x=0, y=0;
				for(y=0; y<12	; y++)
				{
					for(x=0; x<20; x++)
					{
						if(Map.getElem(y,x).getPermeability() == Permeability.DOORCLOSED ){
							this.Map.Elem[y][x] = new DoorOpen(y,x);
							
						}
					}
				}
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.DOOROPEN){
			
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!   Gagné  !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
				System.exit(0);
			}
			this.Map.Elem[Hero.getXH()][Hero.getYH()] =  new Hero(Hero.getYH(),Hero.getXH()) ;
			Hero.setXH(Hero.getXH()-X);
			 Hero.setYH(Hero.getYH()-Y);
			this.Map.Elem[Hero.getXH()][Hero.getYH()] =  new Empty(Hero.getXH(),Hero.getYH()) ;
			Hero.setXH(Hero.getXH()+X);
			Hero.setYH(Hero.getYH()+Y);
					}
		else{Hero.setXH(Hero.getXH()-X);					 
			 Hero.setYH(Hero.getYH()-Y);
			
		}
		this.setChanged();
		this.notifyObservers();
		System.out.println(Score);
		}

	public int getScore() {
		return Score;
	}


	public void setScore(int score) {
		Score = score;
	}


	


	public Map getMap() {
		return Map;
	}


	public void setMap(Map genMap) {
		this.Map = genMap;
	}

	public Image getImage(int x, int y) 
	{
		return this.Map.getElem(x,y).getImage();
	}


	public void MoveUPRT() {
		Hero.setImagehero(Hero.getImagehero6());
		MoveHero(+1,-1);
		
	}


	public void MoveDWRT() {
		Hero.setImagehero(Hero.getImagehero());
		MoveHero(+1,+1);
		
	}


	public void MoveUPLF() {
		Hero.setImagehero(Hero.getImagehero4());
		MoveHero(-1,-1);
		
	}


	public void MoveDWLF() {
		Hero.setImagehero(Hero.getImagehero2());
		MoveHero(-1,+1);
		
	}
	public void MoveUP() {
		Hero.setImagehero(Hero.getImagehero5());
		MoveHero(0,-1);
		System.out.println("Haut");
		
		
		
	}


	public void MoveDW() {
		Hero.setImagehero(Hero.getImagehero1());
		MoveHero(0,+1);// TODO Auto-generated method stub
		System.out.println("bas");
		
	}


	public void MoveLF() {
		Hero.setImagehero(Hero.getImagehero3());
		MoveHero(-1,0);// TODO Auto-generated method stub
		System.out.println("gauche");
		
		
	}


	public void MoveRT() {
		Hero.setImagehero(Hero.getImagehero7());
		MoveHero(+1,0);// TODO Auto-generated method stub
		System.out.println("droite");
		

	}
	
	public void shoot(int UP,int  DOWN,int LEFT, int RIGHT){
//		
	}

	public void Anim(){
			System.out.println("fonction demarrage du thread");
		//	thread.start();
	}
	@SuppressWarnings("deprecation")
	public void cancel(){
	//	thread.stop();
	}

	public void run() {
		System.out.println("je bouge pas");
	}
//		System.out.println(" RUN!!! ");
//		while(1!=0){
//		Hero.setImagehero(Hero.getImagehero1()) ;
//		 try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}this.setChanged();
//		this.notifyObservers();
//			Hero.setImagehero(Hero.getImagehero2()) ;
//			 try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}this.setChanged();
//			this.notifyObservers();
//			 Hero.setImagehero(Hero.getImagehero3()) ;
//			 try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}this.setChanged();
//			this.notifyObservers();
//			 Hero.setImagehero(Hero.getImagehero4()) ;
//			 try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}this.setChanged();
//			this.notifyObservers();
//			 Hero.setImagehero(Hero.getImagehero5()) ;
//			 try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}this.setChanged();
//			this.notifyObservers();
//			 Hero.setImagehero(Hero.getImagehero6()) ;
//			 try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}this.setChanged();
//				this.notifyObservers();
//			 Hero.setImagehero(Hero.getImagehero7()) ;
//			 try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}this.setChanged();
//			this.notifyObservers();
//			 
//		}
//		
//	}



	



	
}
	



	


	



	





	

