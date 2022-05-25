package creational.factorymethod;

public interface Animal {
    void speak();
}


class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Meow... 🐱");
    }

}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Gogogo... 🐶");
    }
}