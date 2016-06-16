package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
 
public class ViewPanel extends JPanel implements Observer { 

	private ViewFrame viewframe;
	public int y;
	public int x;




	 
	 
	private static final long serialVersionUID = 1L;
	public ViewPanel(final ViewFrame viewframe) {
		this.setViewframe(viewframe);
		ViewFrame.getModel().getObservable().addObserver(this);
		setBackground(Color.BLACK);
	}

	
public void paintComponent(Graphics g){
	
 
    System.out.println("Vue exécutée !"); 
    int x=0, y=0;
	for(y=0; y<12	; y++)
	{
		for(x=0; x<20; x++)
		{
		g.drawImage(ViewFrame.getModel().getImage(y, x) ,x*32,y*32, 32, 32, this);
		System.out.println("Image créé");
		}
	}
  }               




public ViewFrame getViewframe() {
	return viewframe;
}


public void setViewframe(ViewFrame viewframe) {
	this.viewframe = viewframe;
}


public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	
}
}