public class MainCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Whip(new Mocha(new Mocha(new Espresso())));
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		Beverage beverage2 = new Soy(new Latte());
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
