package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement Subject on WeatherData
 */

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    
    @Override
    public void remoteObserver(Observer o) {
        observers.remove(o);        
    }
    
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }        
    }


    /**
     * notify Observers when we get updated measurements from Weather Station 
     */
    public void measurementsChanged() {
        notifyObservers();
    };

    
    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
