package testData;

public class NewEmployeeTest3 {
	public static void main(String[] args) {
		long length = Long.parseLong(args[0]);
		int eat = Integer.parseInt(args[1]);

		int ans = calculation(length,eat);

		System.out.println(ans);
	}

	public static int calculation(long length, int eat) {
		int cnt = 0;
		cnt = (int) (length/(eat*2));
		if (length%(eat*2) == 0) {
			cnt--;
		}
		return cnt * eat;
	}
}
