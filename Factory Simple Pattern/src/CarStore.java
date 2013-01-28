
public class CarStore {
	CarSimpleFactory factory;
	public CarStore(CarSimpleFactory fac) {
		this.factory = fac;
	}
	
	public Car buyCar(String model) {
		Car car;
		car = factory.createCar(model);
		car.testdrive();
		car.sell();
		return car;
	}
}
