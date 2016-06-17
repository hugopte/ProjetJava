package model;

import java.awt.Image;
import java.util.Observable;

import contract.IModel;
import element.Permeability;
import element.mobile.Hero;
import element.motionless.Bone;
import element.motionless.Empty;
import element.motionless.Purse;

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
	
	
	
	

	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{	System.out.print("creation du modele   ");
		this.setGenMap(new GenMap ("C:/Users/Hugo PETTE/git/ProjetJava/model/images/map5.txt", this));	
		
		
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
	
	
	System.out.println(Hero.getYH()+" "+Hero.getXH());
	
	
	 
	
	Hero.setXH(Hero.getXH()+X);
	Hero.setYH(Hero.getYH()+Y);
		if (genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()!= Permeability.BLOCKING){
			if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.SCORING){
				Score = Score+650;
				
			}
			else if(genMap.Elem[Hero.getXH()][Hero.getYH()].getPermeability()== Permeability.DOORCLOSED){
				System.out.println("Vous etes mort");
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



	


	



	





	
}
