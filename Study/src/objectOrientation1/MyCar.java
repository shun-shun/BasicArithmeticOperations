package objectOrientation1;

public class MyCar extends AbstractAutomobile{

	protected MyCar() {
		super(CarType.STANDERD_CAR);
	}

	@Override
	public int getCapacity() {
		return 7;
	}

	@Override
	public String getCarModel() {
		return "自家用ワンボックス車";
	}

}
