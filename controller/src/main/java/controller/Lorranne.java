package controller;



import java.io.IOException;

import javax.swing.SwingUtilities;

import contract.ILorannMap;



public final class Lorranne implements Runnable {
	private final ILorannMap	map;
	private final Controller		controller;
	private ILorannMap				LorraneFrame;

	public Lorranne() throws IOException {
		this.map = new map.map("map1.txt");
		this.controller = new Controller(this.map);
		SwingUtilities.invokeLater(this);
	}

	public void run() {
		this.LorraneFrame = new ILorannMap("Welcome to my game", this.getLorranMap(), this.getController());
		this.controller.setLorraneFrame(this.LorraneFrame);
	}

	private ILorannMap getLorranMap() {
		return this.map;
	}

	private Controller getController() {
		return this.controller;
	}
}
