package contract;

import java.awt.Image;
import java.util.Observable;

import model.GenMap;

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
		//void loadMessage(String key);

				/**
		 * Gets the observable.
		 *
		 * @return the observable
		 */
		Observable getObservable();
		public GenMap getGenMap();
		public Image getImage(int x, int y);
		void MoveUP();
		void MoveDW();
		void MoveLF();
		void MoveRT();
		int getScore();
		

		
		
	
}
