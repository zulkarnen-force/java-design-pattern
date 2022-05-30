package structural.decorators.ChatTime;


public class CeresTopping extends Topping {

    public CeresTopping(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Ceres Topping";
    }

    @Override
    public int cost() {
        return drink.cost() + 500;
    }
    
}
