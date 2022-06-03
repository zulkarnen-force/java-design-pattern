package introduction.simplepattern;

public class MallardDuck extends Duck {
    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squack();
    }

    @Override
    void swim() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        
    }
}
