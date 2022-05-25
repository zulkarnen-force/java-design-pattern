package creational.builderpatterns.cars;

import creational.builderpatterns.components.Engine;
import creational.builderpatterns.components.GPSNavigator;
import creational.builderpatterns.components.Transmission;
import creational.builderpatterns.components.TripComputer;

public class Car {
    
    private final CarType carType;
    private final Integer sets;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int sets, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.sets = sets;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getSets() {
        return sets;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public double getFuel() {
        return fuel;
    }


}
