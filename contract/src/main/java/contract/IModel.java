package contract;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;

import org.w3c.dom.Element;

import element.mobile.Hero;
import element.mobile.Mobile;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	
		/**
		 * Load the message.
		 *
		 * @param key
		 *          the key
		 */
		void loadMessage(String key);

		/**
		 * Gets the observable.
		 *
		 * @return the observable
		 */
		Observable getObservable();
		
		
		Dimension getD();
		
		ImageIcon getImageElement(int y, int x);
		
		
		void MoveUP();
		void MoveDW();
		void MoveLF();
		void MoveRT();
	
}
