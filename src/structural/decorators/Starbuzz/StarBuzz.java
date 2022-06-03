package structural.decorators.Starbuzz;

public class StarBuzz {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);


        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
    
}
