import java.io.IOException;

public class OpenIE {
    public static void main(String[] args) {
        String[] command = new String[] { "cmd", "/c", "start iexplore -extoff" };
        try {
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
