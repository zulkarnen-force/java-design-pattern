package introduction.simplepattern;

public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm Squack...");        
    }
    
}
