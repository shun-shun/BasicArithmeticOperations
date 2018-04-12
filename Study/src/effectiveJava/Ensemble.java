package effectiveJava;

public enum Ensemble {
	//    SOLO, DUET, TRIO, QUARTET, QUINTET,
	//    SEXTET, SEPTET, OCTET, NONET, DECTET;
	//
	//    // グループのメンバーの数を返す
	//    public int numberOfMusicians() { return ordinal() + 1; }

	//	上記は危険な実装であるため、注意。

	SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8), NONET(
			9), DECTET(10), TRIPLE_QUARTET(12);

	private final int size;

	Ensemble(int size) {
		this.size = size;
	}

	public int numberOfMusicians() {
		return this.size;
	}
}
