package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet  implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("foo.com");
        bannedSites.add("bar.com");
        bannedSites.add("lovalate.com");
    }

    @Override
    public void connectTo(String hostname) throws Exception {
        if (bannedSites.contains(hostname)) {
            throw new Exception("403 Access Denied");
        }

        internet.connectTo(hostname);
    }
    
}
