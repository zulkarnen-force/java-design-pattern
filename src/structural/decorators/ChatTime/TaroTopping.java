package structural.decorators.ChatTime;

public class TaroTopping extends Topping {

    public TaroTopping(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getName() {
        return drink.name + ", Taro";
    }
    @Override
    public String getDescription() {
        return drink.getDescription() + ", Taro Topping";
    }

    @Override
    public int cost() {
        return drink.cost() + 1000; 
    }
    
}
