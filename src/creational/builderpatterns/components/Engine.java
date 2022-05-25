package creational.builderpatterns.components;

public class Engine {

    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStared() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot Go() must be start engine first");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage(){
        return mileage;
    }



}