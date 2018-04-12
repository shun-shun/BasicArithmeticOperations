package objectOrientation1;

public class Main {

	public static void main(String[] args) {
        MyCar car = new MyCar();
        System.out.println("車種(モデル)は" + car.getCarModel() + "です");
        System.out.println("乗車定員は" + car.getCapacity() + "人です");
        System.out.println("車種区分は" + car.getCarTypeString() + "です");
	}

}
