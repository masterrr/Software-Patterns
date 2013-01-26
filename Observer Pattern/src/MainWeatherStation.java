
public class MainWeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(20, 60, 800);
		weatherData.setMeasurements(21, 76, 780);
	}
}
