public class MainWeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentWeatherDisplay display1 = new CurrentWeatherDisplay(weatherData);
		weatherData.setMeasurements(20, 800);
	}
}
