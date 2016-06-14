package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer 
{

	/** The view frame. */
	private ViewFrame					viewFrame;
	private JLabel [][] JLabelMap;
	private JLabel score;
	private GridBagConstraints gbc; 
	//private Font ScoreFont;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) 
	{
		super();
		this.setViewFrame(viewFrame);
		this.setSize(this.getViewFrame().getModel().getD());
		this.setPreferredSize(this.getViewFrame().getModel().getD());
		viewFrame.getModel().getObservable().addObserver(this);
		JLabelMap = new JLabel [this.getViewFrame().getModel()][this.getViewFrame().getModel()];
//		this.score = new JLabel("SCORE : "+Integer.toString(this.getViewFrame().getModel());
//		this.ScoreFont = new Font("Arial", Font.BOLD, 15);
//		this.score.setForeground(Color.ORANGE);
//		this.score.setFont(ScoreFont);
		gbc = new GridBagConstraints();
		//this.setBackground(Color.BLACK);
		this.setLayout(new GridBagLayout());		
		this.initViewPanel();		
	}
	
	public void initViewPanel()
	{
		int x=0, y=0;
		for(y=0; y<this.getViewFrame().getModel(); y++)
		{
			for(x=0; x<this.getViewFrame().getModel(); x++)
			{
				JLabel sprite = new JLabel();
				sprite.setIcon(this.getViewFrame().getModel().getImageElement(y, x));
				this.JLabelMap[y][x]=sprite;
				this.gbc.gridx = x;
				this.gbc.gridy = y;
				this.gbc.gridheight = 1;
				this.gbc.gridwidth = 1;
				this.add(sprite, gbc);	
			}
		}		
		this.gbc.gridx = 0;
		this.gbc.gridy++;
		this.gbc.gridwidth = 5;
		this.score.setText("SCORE : "+Integer.toString(this.getViewFrame().getModel().getScore()));
		this.add(this.score, gbc);		
		this.getViewFrame().pack();
		this.setVisible(true);
		this.repaint();
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() 
	{
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) 
	{
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) 
	{
		this.removeAll();
		this.initViewPanel();
		//this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) 
	{
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
	}
}