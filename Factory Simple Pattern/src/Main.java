public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarStore store = new CarStore(new CarSimpleFactory());
		store.buyCar("bmw");
		store.buyCar("audi");
		store.buyCar("bmw");
	}

}
