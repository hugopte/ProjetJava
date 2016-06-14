package element.motionless;


public abstract class MotionlessElements {
	public static final MotionlessElement 	 Purse				= new Purse();
	public static final MotionlessElement    Empty              = new Empty();
	

	private static MotionlessElement motionlessElements[]	= { Purse,Empty };

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getFileSymbol() == fileSymbol) {
				return motionlessElement;
			}
		}
		return Empty;
	}
}