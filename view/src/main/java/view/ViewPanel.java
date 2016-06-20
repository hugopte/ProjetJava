package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;


import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Hugo PETTE
 */
 
public class ViewPanel extends JPanel implements Observer { 
/**
 *  the Viewframe
 */
	private ViewFrame viewframe;
	



	 
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/**
	 * Instantiates a new viewpanel.
	 *
	 * @param viewFrame
	 *          the viewFrame
	 */
	public ViewPanel(final ViewFrame viewframe) {
		this.setViewframe(viewframe);
		viewframe.getModel().getObservable().addObserver(this);
		
		
	}

	/**
	 * @param GraphicsConfiguration
	 * 			the GraphicsConfiguration
	 */
public void paintComponent(Graphics g){
	
	g.clearRect(0, 300, 4000, 4000);
    
    int x=0, y=0;
	for(y=0; y<12	; y++)
	{
		for(x=0; x<20; x++)
		{
		g.drawImage(viewframe.getModel().getImage(y, x) ,x*32,y*32, 32,32 , this);
		
		}
		
	}
	g.drawString(Integer.toString(viewframe.getModel().getScore()), 100, 400);
	
  } 





public ViewFrame getViewframe() {
	return viewframe;
}


public void setViewframe(ViewFrame viewframe) {
	this.viewframe = viewframe;
}


public void update(Observable o, Object arg) {
	this.repaint();
	
}
}