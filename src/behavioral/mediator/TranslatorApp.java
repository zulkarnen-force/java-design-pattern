package behavioral.mediator;

public class TranslatorApp {
    public static void main(String[] args) {
        
        User zulkarnen = new User("Zulkarnen", "ENGLISH", "fine and you");
        System.out.println(zulkarnen.translate()); // Multa

        User billie = new User("Billie", "SPANISH", "hola Amigas");
        System.out.println(billie.translate()); // Hello Friends

        User joe = new User("Joe", "INDONESIA", "halo apa kabar");
        System.out.println(joe.translate()); // Unable to translate the text :(

    }
}
