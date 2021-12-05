import java.io.IOException;
import java.net.Socket;

public class PortCheck {
    private static boolean available(int port) {
        try (Socket ignored = new Socket("localhost", port)) {
            return false;
        } catch (IOException ignored) {
            return true;
        }
    }

    public static void main(String[] args) {
        // 389 is the port number for LDAP Lightweight Directory Access Protocol port
        if (available(389)) {
            System.out.println("lightweight Directory Access Protocol port is available");
        } else {
            System.out.println("lightweight Directory Access Protocol port is not available");
        }
    }
}
