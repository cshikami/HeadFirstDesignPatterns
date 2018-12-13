package Observer;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float currentPressure = 20.0f;
	private float lastPressure = 0.0f;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		}
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}
	
}
