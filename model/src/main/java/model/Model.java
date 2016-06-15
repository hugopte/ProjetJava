package model;

import java.util.Observable;

import javax.swing.ImageIcon;

import contract.IModel;
import element.Permeability;
import element.mobile.Hero;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel 
{
	/** The message. */
	private GenMap genMap;
	private Hero Lorann;
	private Permeability permeability;
	

	/**
	 * Instantiates a new model.
	 */
	public Model() 
	{	System.out.print("creation du modele   ");
		this.setGenMap(new GenMap ("C:/Users/RICOUARTTANGUY/git/ProjetJava/model/images/map1.txt", this));	
		this.setLorann(new Hero(5,10));
		
	}



//	/*
//	 * (non-Javadoc)
//	 *
//	 * @see contract.IModel#getMessage()
//	 */	
//	//public String getMessage() {
//		return this.message;
//	}
//
//	/**
//	 * Sets the message.
//	 *
//	 * @param message
//	 *          the new message
//	 */
//	private void setMessage(final String message) {
//		this.message = message;
//		this.setChanged();
//		this.notifyObservers();
//	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
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



	public void loadMessage(String key) {
		// TODO Auto-generated method stub
		
	}



	public ImageIcon getImageElement(int y, int x) {
		// TODO Auto-generated method stub
		return null;
	}



	public void MoveUP() {
		// TODO Auto-generated method stub
		
	}



	public void MoveDW() {
		// TODO Auto-generated method stub
		
	}



	public void MoveLF() {
		// TODO Auto-generated method stub
		
	}



	public void MoveRT() {
		// TODO Auto-generated method stub
		
	}



	public GenMap getGenMap() {
		return genMap;
	}



	public void setGenMap(GenMap genMap) {
		this.genMap = genMap;
	}



	public Hero getLorann() {
		return Lorann;
	}



	public void setLorann(Hero lorann) {
		Lorann = lorann;
	}



	public Permeability getPermeability() {
		return permeability;
	}



	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
}
