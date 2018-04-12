package java_sliver;

public class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
	}

	public boolean equal(Sample obj) {
		if(obj == null) {
			return false;
		}
		return this.num == obj.num;
	}
}
