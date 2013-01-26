import java.util.Observer;
import java.util.Observable;

public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	
	public WeatherData() {};
	
	public void measurementsChanged() {
		// superclass methods
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity) {
		this.temp = temp;
		this.humidity = humidity;
		measurementsChanged();
	}
	
	public float getTemp() {
		return temp;
	}
	
	public float getHumidity() {
		return humidity;
	}
}
