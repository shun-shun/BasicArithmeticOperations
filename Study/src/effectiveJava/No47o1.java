package effectiveJava;

import java.util.Random;

public class No47o1 {
	private static final Random r = new Random();

	static int random1(int n) {
		return Math.abs(r.nextInt()) % n;
	}
	static int random2(int n) {
		return r.nextInt(n);
	}

	public static void main(String args[]) {
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low1 = 0;
		int low2 = 0;
		for(int i = 0 ; i < 1000000; i++) {
			if(random1(n) < n/2) low1++;
			if(random2(n) < n/2) low2++;
		}
		System.out.println(low1);
		System.out.println(low2);
	}
}
