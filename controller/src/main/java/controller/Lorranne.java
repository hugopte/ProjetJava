package controller;



import java.io.IOException;

import javax.swing.SwingUtilities;

import contract.ILorannMap;
import contract.IView;


public final class Lorranne implements Runnable {
	private final ILorannMap	map;
	private final Controller		controller;
	//.private IView				LorraneFrame;

	public Lorranne() throws IOException {
		this.map = new map.map("map1.txt");
		this.controller = new Controller(this.map);
		SwingUtilities.invokeLater(this);
	}

	public void run() {
		//this.LorraneFrame = new LorraneFrame("Welcome to my game", this.getLorranMap(), this.getController());
		//this.controller.setView(this.LorraneFrame);
	}

	private ILorannMap getLorranMap() {
		return this.map;
	}

	private Controller getController() {
		return this.controller;
	}
}
