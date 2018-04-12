package testData;

public class NewEmployeeTest1 {

	public static void main(String[] args) {

		Long width = Long.parseLong(args[0]);
		Long distance = Long.parseLong(args[1]);

		int count = 0;
		count = (int) (distance/width);
		if(distance%width != 0) {
			count++;
		}

		System.out.println(count);
	}

}
