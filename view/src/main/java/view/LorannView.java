package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import contract.ControllerOrder;



public abstract class LorannView {
	public static ControllerOrder keyCodeToUserOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return ControllerOrder.UP;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.RIGHT;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.DOWN;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_SPACE:
				return ControllerOrder.SHOOT;
			default:
				return ControllerOrder.NOP;
		}
	}
	public static void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
