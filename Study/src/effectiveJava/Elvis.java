package effectiveJava;

public class Elvis {
	private static final Elvis ELVIS = new Elvis();

	private Elvis() {
		//do not call.
	}

	public static Elvis getInstance() {
		return ELVIS;
	}
}
