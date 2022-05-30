package structural.decorators.ChatTime;

public abstract class Drink {
    String name = "Unknown name";
    String description = "Unknown description";

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }
    
    public abstract int cost();
    
}
