package structural.adapter.round;

/**
 * RoundPages are compactible with RoundHole
 */

public class RoundPeg {
    private double radius;

    public RoundPeg(){};

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
