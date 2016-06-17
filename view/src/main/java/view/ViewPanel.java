package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class ViewPanel extends JPanel implements Observer { 

	private ViewFrame viewframe;
	



	 
	 
	private static final long serialVersionUID = 1L;
	public ViewPanel(final ViewFrame viewframe) {
		this.setViewframe(viewframe);
		viewframe.getModel().getObservable().addObserver(this);
		setBackground(Color.BLACK);
		
	}

	
public void paintComponent(Graphics g){
	

    System.out.println("Vue exécutée !"); 
    int x=0, y=0;
	for(y=0; y<12	; y++)
	{
		for(x=0; x<20; x++)
		{
		g.drawImage(viewframe.getModel().getImage(y, x) ,x*32,y*32, 32, 32, this);
		
		}
		
	}
	g.drawString(Integer.toString(viewframe.getModel().getScore()), 400, 400);
	
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