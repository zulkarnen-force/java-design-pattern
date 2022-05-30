package structural.decorators.ChatTime;

public class ChatTimeApp {
    public static void main(String[] args) {
        Drink tea = new TeaPresso();
        tea = new TaroTopping(tea);
        tea = new CeresTopping(tea);

        System.out.println(tea.getDescription());
        System.out.println("Cost IDR-" +tea.cost());

    }
    
}
