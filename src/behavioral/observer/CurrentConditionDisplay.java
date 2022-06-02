package behavioral.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;   

    /**
     * 
     * @param weatherData Subject for register this observer
     * this constructor passed WeatherData object (Subject) and we use it 
     * to register the display as an Observer
     */
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();        
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature 
            + "F Degrees and " + humidity + "% humidity"
        );        
    }


}
