package creational.prototype;


public class Rectangle extends Shape {
    public int widht, height;

    public Rectangle(){
        
    };

    public Rectangle(Rectangle target) {
        super(target);

        if (target != null) {
            this.widht = target.widht;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;

        Rectangle shape2 = (Rectangle) object2;
        return shape2.widht == widht && shape2.height == height;

    }

}
