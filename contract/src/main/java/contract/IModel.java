package contract;

import java.util.Observable;

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
		
		

		
		
	
}
