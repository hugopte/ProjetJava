package contract;

import java.awt.Image;
import java.util.Observable;

import model.Map;

/**
 * The Interface IModel.
 *
 * @author Hugo PETTE
 */
public interface IModel {
			
		/** Gets the observable.
		 *
		 * @return the observable
		 */
		Observable getObservable();
		/**
		 * Gets the map
		 * @return the map
		 */
		public Map getMap();
		/**
		 * Gets the image
		 * @return the image
		 */
		public Image getImage(int x, int y);
		/**
		 * Moving UP
		 */
		void MoveUP();
		/**
		 * Moving Down
		 */
		void MoveDW();
		/**
		 * Moving Left
		 */
		void MoveLF();
		/**
		 * Moving Right
		 */
		void MoveRT();
		/**
		 * Get Score
		 */
		int getScore();
		/**
		 * Moving UP and right
		 */
		void MoveUPRT();
		/**
		 * Moving Down and right
		 */
		void MoveDWRT();
		/**
		 * Moving Up and left
		 */
		void MoveUPLF();
		/**
		 * Moving Down and left
		 */
		void MoveDWLF();
		/**
		 * Moving UP
		 */
		void Anim();
		/**
		 * Animate ( in progress )
		 */
		void cancel();
		/**
		 * cancel  ( in progress )
		 */
		void shoot();
		/**
		 * shoot   ( in progress )
		 */
		void Refresh();
		/**
		 * Refresh  ( in progress )
		 */
		
		
		
	
}
