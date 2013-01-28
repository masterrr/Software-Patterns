public class CarSimpleFactory {
	public Car createCar(String model) {
		Car car = null;
		if (model.equals("audi")) {
			car = new CarAudi();
		} else if (model.equals("bmw")) {
			car = new CarBMW();
		}
		return car;
	}
}
