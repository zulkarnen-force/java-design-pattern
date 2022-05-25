package structural.decorators;

public class DecoratorApp {
    public static void main(String[] args) {
        String password = "supersecret666";
        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt"));

        encoded.writeData(password);

        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        
        System.out.println("- Input ----------------");
        System.out.println(password);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    
    }
}
