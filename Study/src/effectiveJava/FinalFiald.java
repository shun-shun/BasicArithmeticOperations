package effectiveJava;

public class FinalFiald {

	private final int pointX;
	private final int pointY;

	FinalFiald(int pointX, int pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}

	/**
	 * @return pointX
	 */
	public int getPointX() {
		return pointX;
	}

	/**
	 * @return pointY
	 */
	public int getPointY() {
		return pointY;
	}

	//サブクラスを作成するのではなく、factoryメソッドによって提供する。
	public static FinalFiald valueOf(int pointX, int pointY) {
		return new FinalFiald(pointX, pointY);
	}

}
