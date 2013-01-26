public class Whip extends BeverageCondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage e) {
		this.beverage = e;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}
	
	
}
