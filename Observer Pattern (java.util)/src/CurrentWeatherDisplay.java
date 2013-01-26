import java.util.Observer;
import java.util.Observable;

public class CurrentWeatherDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentWeatherDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Weather: " + temp + "ûC, humidity is " + humidity);
	}
}
