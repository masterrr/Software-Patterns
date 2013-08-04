public abstract class AudiStore {	
	public Audi orderAudi(String type) {
		Audi car = assembleAudi(type);
		car.checkSystems();
		car.testDrive();
		return car;
	}

	abstract Audi assembleAudi(String type);
}
