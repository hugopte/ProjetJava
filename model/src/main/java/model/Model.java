package model;

import java.awt.Image;
import java.util.Observable;

//import javax.swing.Timer;

import contract.IModel;
import element.Permeability;
import element.mobile.Hero;
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
	private Runnable t1 = new Hero(0,0) ;
	private Map Map;
	private int Score = 0;
	private Thread thread = new Thread(t1);
	
	
	
	

	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{	System.out.print("creation du modele   ");
		
		this.setMap(new Map ("C:/Users/Hugo PETTE/git/ProjetJava/model/images/map3.txt", this));	
		//thread = new Thread(this);
		
		
	}


	
	public Observable getObservable() {
		return this;
	}



	public void MoveHero (int Y, int X){
	
	
	
	
	
	 
	
	Hero.setXH(Hero.getXH()+X);					//We add new coordinates to the moving
	Hero.setYH(Hero.getYH()+Y);
		if (Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()!= Permeability.BLOCKING){ // We enter on the loop if the next permability of the element isn't blocking  
			if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.SCORE){ // If the permeability of the next element is SCORE we add 650 to the score
				Score = Score+650;
				
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.DOORCLOSED){ //If we encounter a door closed we die 
				
				
				
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!!!!!You die!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.exit(0);
				
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.CRYSTALBALL){//If we encounter a crystal ball, we cross the map in order to change doorclosed element to dooropen
				int x=0, y=0;
				for(y=0; y<12	; y++)
				{
					for(x=0; x<20; x++)
					{
						if(Map.getElem(y,x).getPermeability() == Permeability.DOORCLOSED ){
							this.Map.Elem[y][x] = new DoorOpen();
							
						}
					}
				}
			}
			else if(Map.getElem(Hero.getXH(),Hero.getYH()).getPermeability()== Permeability.DOOROPEN){ // if we encounter a open door 
			
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!   Gagné  !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
				System.exit(0);
			}
			this.Map.Elem[Hero.getXH()][Hero.getYH()] =  new Hero(Hero.getYH(),Hero.getXH()) ;// We create new hero at the new emplacement
			Hero.setXH(Hero.getXH()-X);														// 
			 Hero.setYH(Hero.getYH()-Y);
			this.Map.Elem[Hero.getXH()][Hero.getYH()] =  new Empty() ; // We create new empty element at the ancient element
			Hero.setXH(Hero.getXH()+X);
			Hero.setYH(Hero.getYH()+Y);
					}
		else{Hero.setXH(Hero.getXH()-X);					 
			 Hero.setYH(Hero.getYH()-Y);
			
		}
		this.setChanged();
		this.notifyObservers();
	
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


	public void MoveUPRT() {							//we move up and right
		Hero.setImagehero(Hero.getImagehero6());		//We define Hero's sprite according to the moving
		MoveHero(+1,-1);								//We call the Move fonction with the parameters as the moving coordinates 
		
	}


	public void MoveDWRT() {						    //We move down and right
		Hero.setImagehero(Hero.getImagehero());			//We define Hero's sprite according to the moving
		MoveHero(+1,+1);								//We call the Move fonction with the parameters as the moving coordinates 
				
	}


	public void MoveUPLF() {							//We move up and left
		Hero.setImagehero(Hero.getImagehero4());		//We define Hero's sprite according to the moving
		MoveHero(-1,-1);								//We call the Move fonction with the parameters as the moving coordinates 
		
	}


	public void MoveDWLF() {							//We move down and left
		Hero.setImagehero(Hero.getImagehero2());		//We define Hero's sprite according to the moving
		MoveHero(-1,+1);								//We call the Move fonction with the parameters as the moving coordinates 
	
		
	}
	public void MoveUP() {								//We move up
		Hero.setImagehero(Hero.getImagehero5());		//We define Hero's sprite according to the moving
		MoveHero(0,-1);									//We call the Move fonction with the parameters as the moving coordinates 
		
	}


	public void MoveDW() {								//We move down
		Hero.setImagehero(Hero.getImagehero1());		//We define Hero's sprite according to the moving
		MoveHero(0,+1);// 								//We call the Move fonction with the parameters as the moving coordinates 
		
		
	}


	public void MoveLF() {								//We move left
		Hero.setImagehero(Hero.getImagehero3());		//We define Hero's sprite according to the moving
		MoveHero(-1,0);									//We call the Move fonction with the parameters as the moving coordinates 
		
		
		
	}


	public void MoveRT() {								//We move right
		Hero.setImagehero(Hero.getImagehero7());		//We define Hero's sprite according to the moving
		MoveHero(+1,0);
		

	}
	
	public void shoot(){
		System.out.println("SHOOT");
	}

	public void Anim(){
			System.out.println("fonction demarrage du thread");
		//	thread.start();
	}
	
	public void cancel(){
		System.out.println("Cancel");
		//thread.interrupt();
	}

	public void run() {
		
	}
//		System.out.println(" RUN!!! ");
//		while(1!=0){
//		Hero.setImagehero(Hero.getImagehero1()) ;
//		 try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//		
	
	// TODO Auto-generated catch block
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

	public void Refresh(){
		this.setChanged();
		this.notifyObservers();
	
	}



	



	



	




	
}
	



	


	



	





	

