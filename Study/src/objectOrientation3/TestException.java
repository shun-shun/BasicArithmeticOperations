package objectOrientation3;

public class TestException {

	public static void main(String[] args) {
		String nullString = null;
		try {
			System.out.println(nullString.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			String[] stringArray = new String[1];
			System.out.println(stringArray[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			Object object = new Integer(100);
			String string = (String)object;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

	}

}
