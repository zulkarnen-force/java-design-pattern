package creational.builderpatterns.builder;

import creational.builderpatterns.cars.CarType;
import creational.builderpatterns.components.Engine;
import creational.builderpatterns.components.GPSNavigator;
import creational.builderpatterns.components.Transmission;
import creational.builderpatterns.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int sets);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
