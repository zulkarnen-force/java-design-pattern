package creational.factorymethod;

public class FactoryAnimal {
    
    public Animal create(String type) throws NullPointerException {
        switch (type) {
            case "cat" :
                return new Cat();
            case "dog" :
                return new Dog();
        }
        return null;
    }

}


