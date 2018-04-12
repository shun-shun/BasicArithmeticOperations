package testData;

public class NewEmployeeTest2 {

	public static void main(String[] args) {

		Long cost = Long.parseLong(args[0]);
		double tax = Double.parseDouble(args[1]) * 0.01;

		System.out.println(calculation(cost, tax));
	}


	public static Long calculation(long cost, double tax) {
		return (long) (cost + cost * tax);
	}

}

