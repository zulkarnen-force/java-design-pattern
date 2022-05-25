package creational.builderpatterns;

import creational.builderpatterns.builder.CarBuilder;
import creational.builderpatterns.builder.CarManualBuilder;
import creational.builderpatterns.cars.Car;
import creational.builderpatterns.cars.Manual;
import creational.builderpatterns.director.Director;

public class Demo {

    public static void main(String[] args) {
        
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructCityCar(builder);

        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building receipes
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar Manual built:\n" + carManual.print() );

    }
    
}
