package structural.decorators.ChatTime;

public class TeaPresso extends Drink {
    public TeaPresso(){
        this.name = "tea presso";
        this.description = "tea with presso";
    }

    public int cost(){
        return 19000;
    }
}
