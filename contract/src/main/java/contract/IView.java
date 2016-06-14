package contract;


/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {
	void setMeeting(ILorannMap nettleWorld);

	void setViewMode(int viewMode);

	void printMessage(final String message);
}
