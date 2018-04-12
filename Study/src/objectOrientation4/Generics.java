package objectOrientation4;

import java.util.Arrays;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		List<String> arrayList = Arrays.asList(args);
		for (String output : arrayList) {
			System.out.println(output);
		}
	}

}
