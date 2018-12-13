package Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
//	private float temperature;
//	private float humidity;
//	private float pressure;
	
	private Subject weatherData;
	private float tempSum = 0.0f;
	private int numReadings = 0;
	private float avgTemp;
	private float minTemp = 200.0f;
	private float maxTemp = 0.0f;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Avg. Temp: " + avgTemp + "\n" + 
				"Min. Temp: " + minTemp + "\n" +
				"Max. Temp: " + maxTemp);
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		
		tempSum = tempSum + temperature;
		numReadings++;
		
		if (temperature > maxTemp) {
			maxTemp = temperature;
		}
		if (temperature < minTemp) {
			minTemp = temperature;
		}
		
		avgTemp = tempSum/numReadings;
		
		display();
	}

}
