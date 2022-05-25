package creational.builderpatterns.components;

import creational.builderpatterns.cars.Car;

public class TripComputer {

    private Car car;
    
    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStared()) {
            System.out.println("Car is stared");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
