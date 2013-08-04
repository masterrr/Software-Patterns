public abstract class Audi {
	int maxSpeed;
	float engineCapacity;
	
	void checkSystems() {
		System.out.println("Checking systems...");
	}
	
	void testDrive() {
		System.out.println("Test driving with max speed " + maxSpeed);
	}
}
