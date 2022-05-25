package creational.builderpatterns.cars;

import creational.builderpatterns.components.Engine;
import creational.builderpatterns.components.GPSNavigator;
import creational.builderpatterns.components.Transmission;
import creational.builderpatterns.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of Car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "Mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        if (this.tripComputer != null) {
            info += "Trip Computer: Functional \n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }

        return info;
    }   
    
}
