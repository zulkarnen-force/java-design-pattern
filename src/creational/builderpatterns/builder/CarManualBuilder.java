package creational.builderpatterns.builder;


import creational.builderpatterns.cars.CarType;
import creational.builderpatterns.cars.Manual;
import creational.builderpatterns.components.Engine;
import creational.builderpatterns.components.GPSNavigator;
import creational.builderpatterns.components.Transmission;
import creational.builderpatterns.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int sets) {
        this.seats = sets;        
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
        
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;        
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
    

}