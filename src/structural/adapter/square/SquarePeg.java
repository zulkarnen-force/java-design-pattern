package structural.adapter.square;

/**
 * SquarePags are not compactible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program
 */

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquare() {
        double square;
        square = Math.pow(this.width, 2);
        return square;
    }
    
}
