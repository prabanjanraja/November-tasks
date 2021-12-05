import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostName {
    public static void main(String[] args) {
        String hostname = "";
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(hostname);
    }
}
