import creational.factorymethod.Animal;
import creational.factorymethod.FactoryAnimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        FactoryAnimal factory = new FactoryAnimal();
        Animal meong = factory.create("cat");
        meong.speak();

        Animal anjing = factory.create("dog");
        anjing.speak();

        Animal asal = factory.create("asal");
        asal.speak();

    }
}
