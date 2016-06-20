package view;

import javax.swing.JOptionPane;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener 
{
	private boolean toucheUP = false;
	 private boolean toucheDW= false;
	 private boolean toucheRG = false;
	 private boolean toucheLF = false;
	 private boolean toucheSP = false;

	/** The model. */
	private  IModel	model ;
	
	/** The controller. */
	private IController	controller;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
		this.setContentPane(new ViewPanel(this));
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
		this.setContentPane(new ViewPanel(this));
	}
	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
		this.setContentPane(new ViewPanel(this));
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
		this.setContentPane(new ViewPanel(this));
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected  IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setTitle("Projet Loranne");
	    this.setSize(640, 440);
	    this.setLocationRelativeTo(null);
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	
	 	      
	       
	 
	        
	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) 
	{   
		
	    	
	}
	
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) 
	{	
		if (e.getKeyCode()== KeyEvent.VK_UP) {
		    toucheUP = true; }
		    else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		    toucheDW = true; }
		    else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
		    toucheRG = true; }
		    else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		    toucheLF = true; }
		    else if (e.getKeyCode()==KeyEvent.VK_SPACE){
		    	toucheSP = true;
		    } model.cancel();		
	    		
	
    
		
			
			this.getController().orderPerform(View.keyCodeToControllerOrder(toucheUP,toucheDW,toucheLF,toucheRG,toucheSP));
			
			
		
		
		
		
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) 
	{if (e.getKeyCode()== KeyEvent.VK_UP) {
	    toucheUP = false; }
	    else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	    toucheDW = false; }
	    else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
	    toucheRG = false; }
	    else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	    toucheLF = false; }
	    else if (e.getKeyCode()==KeyEvent.VK_SPACE){
	    	toucheSP = false;
	    }
	
		model.Anim();
		
	}

	public void printMessage(String string) {
		JOptionPane.showMessageDialog(null, string);
		
	}

	
}