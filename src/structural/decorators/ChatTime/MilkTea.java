package structural.decorators.ChatTime;

public class MilkTea extends Drink {
    public MilkTea(){
        this.description = "Milk and Tea";
        this.name = "milk tea";
    }

    public int cost(){
        return 22000;
    }
}
