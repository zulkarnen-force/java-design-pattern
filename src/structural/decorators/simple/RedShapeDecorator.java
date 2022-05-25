package structural.decorators.simple;

public class RedShapeDecorator extends ShapeDecorator {
    
    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border: Color Red");
    }

    @Override
    public void draw() {
        this.setRedBorder(decorateShape);
    }

}
