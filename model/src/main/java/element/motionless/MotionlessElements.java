package element.motionless;


public abstract class MotionlessElements {
	public static final MotionlessElement 	 Purse				= new Purse();
	public static final MotionlessElement    Empty              = new Empty();
	public static final MotionlessElement 	 HBone				= new HBone();
	public static final MotionlessElement    VBone 				= new VBone();
	

	private static MotionlessElement motionlessElements[]	= { Purse,Empty,HBone,VBone };

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getFileSymbol() == fileSymbol) {
				return motionlessElement;
			}
		}
		return Empty;
	}
}