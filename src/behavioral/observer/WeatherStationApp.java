package behavioral.observer;

public class WeatherStationApp {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        // simulate new weather
        weatherData.setMeasurement(40, 32, 32.4f);
        weatherData.setMeasurement(50, 65, 12.4f);
        weatherData.setMeasurement(80, 32, 29.4f);
    }

}
