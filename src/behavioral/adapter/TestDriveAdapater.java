package behavioral.adapter;

public class TestDriveAdapater {
    
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        Duck turykeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("\nTurkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe duck adapater says...");
        testDuck(turykeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
