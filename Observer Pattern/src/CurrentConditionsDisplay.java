public class CurrentConditionsDisplay implements Display, Observer {

	private float temp;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Weather: " + temp + "ûC degrees, " + humidity + "% humidity, pressure is " + pressure);
	}
	
}
