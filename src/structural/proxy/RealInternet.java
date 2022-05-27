package structural.proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String hostname) throws Exception {
        System.out.println("Connecting to " + hostname);
    }
    
}
