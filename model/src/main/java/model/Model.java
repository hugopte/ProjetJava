package model;

import java.sql.SQLException;
import java.util.Observable;

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
	{
		this.genMap = new GenMap ("level1.txt", this);	
		this.Lorann = new Hero(5,10);
		System.out.print("creation du modele   ");
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
}
