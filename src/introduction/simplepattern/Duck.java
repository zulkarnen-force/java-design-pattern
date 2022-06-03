package introduction.simplepattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){};

    void performQuack() {
        this.quackBehavior.quack();
    }
    void performFly() {
        this.flyBehavior.fly();
    }

    void swim() {
        System.out.println("All ducks float, even decoys");
    };

    abstract void display();
} 
