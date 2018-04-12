package effectiveJava;

import java.util.Arrays;

public class AsList {

	public static void main(String[] args) {
		int[] digits = {4,3,6,7,4,3,1,6,7,8,4};
//		意図した動作をせず、意味のなさない文字列を取得してしまう
		System.out.println(Arrays.asList(digits));
//		改良
		System.out.println(Arrays.toString(digits));
	}

}
