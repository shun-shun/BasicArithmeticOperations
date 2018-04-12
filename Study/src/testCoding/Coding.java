package testCoding;

public class Coding {

	public Coding(String n) {
		name = n;
	}
	String name;

	public static void main(String[] args) {
		Coding coding = new Coding("hoge");
		Coding coding2 = new Coding("moge");
		System.out.println(coding.equals(coding2));
	}

	public boolean equals(Object object) {
		Coding coding = (Coding) object;
		if (coding.name != null)
			return true;
		return false;
	}

}
