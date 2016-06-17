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
public class Model extends Observable implements IModel 
{
	/** The message. */
	
	private GenMap genMap;
	
	private int Score = 0;
	//public Timer timer;
	
	
	

	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{	System.out.print("creation du modele   ");
		this.setGenMap(new GenMap ("C:/Users/Hugo PETTE/git/ProjetJava/model/images/map6.txt", this));	
		//timer.start();
		
	}


	
//	public void loadMessage(final String key) {
//		try {
//			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
//			this.setMessage(daoHelloWorld.find(key).getMessage());
//		} catch (final SQLException e) {
//			e.printStackTrace();
//		}
//	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}



	public void MoveHero (int Y, int X){
	
	
	
	
	
	 
	
	Hero.setXH(Hero.getXH()+X);
	Hero.setYH(Hero.getYH()+Y);
		if (genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()!= Permeability.BLOCKING){
			if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.SCORING){
				Score = Score+650;
				
			}
			else if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.DOORCLOSED){
				System.out.println("Vous etes mort");
			}
			else if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.CRYSTALBALL){
				int x=0, y=0;
				for(y=0; y<12	; y++)
				{
					for(x=0; x<20; x++)
					{
						if(genMap.Elem[y][x].getPermeability() == Permeability.DOORCLOSED ){
							this.genMap.Elem[y][x] = new DoorOpen(y,x);
							
						}
					}
				}
			}
			else if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.DOOROPEN){
				
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!   Gagné  !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!          !!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
			}
			this.genMap.Elem[Hero.getXH()][Hero.getYH()] =  new Hero(Hero.getYH(),Hero.getXH()) ;
			Hero.setXH(Hero.getXH()-X);
			 Hero.setYH(Hero.getYH()-Y);
			this.genMap.Elem[Hero.getXH()][Hero.getYH()] =  new Empty(Hero.getXH(),Hero.getYH()) ;
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



	public void MoveUP() {
		MoveHero(0,-1);
		System.out.println("Haut");
		
	}



	public void MoveDW() {
		MoveHero(0,+1);// TODO Auto-generated method stub
		System.out.println("bas");
	}



	public void MoveLF() {
		MoveHero(-1,0);// TODO Auto-generated method stub
		System.out.println("gauche");
	}



	public void MoveRT() {
		MoveHero(+1,0);// TODO Auto-generated method stub
		System.out.println("droite");
	}



	public GenMap getGenMap() {
		return genMap;
	}



	public void setGenMap(GenMap genMap) {
		this.genMap = genMap;
	}

	public Image getImage(int x, int y) 
	{
		return this.genMap.Elem[x][y].getImage();
	}



	public void MoveUPRT() {
		MoveHero(+1,-1);
		
	}



	public void MoveDWRT() {
		MoveHero(+1,+1);
		
	}



	public void MoveUPLF() {
		MoveHero(-1,-1);
		
	}



	public void MoveDWLF() {
		MoveHero(-1,+1);
		
	}



//	public void anim() {
//		System.out.println("Methode anim");
//		Hero.setImagehero(Hero.getImagehero());
//		
//		Hero.setImagehero(Hero.getImagehero1());
//		Hero.setImagehero(Hero.getImagehero2());
//		Hero.setImagehero(Hero.getImagehero3());
//		Hero.setImagehero(Hero.getImagehero4());
//		Hero.setImagehero(Hero.getImagehero5());
//		Hero.setImagehero(Hero.getImagehero6());
//		
//	}



	


	



	





	
}
