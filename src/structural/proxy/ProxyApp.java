package structural.proxy;

public class ProxyApp {
    
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    } 
}























