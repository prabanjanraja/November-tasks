import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = "";
        // if args is empty, read from the user
        if (args.length == 0) {
            System.out.println("Enter a string: ");
            string = in.nextLine();
        } else {
            string = args[0];
        }
        File file = new File("output.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            StringBuilder reverse = new StringBuilder(string);
            reverse.reverse();
            fileWriter.write(reverse.toString());
            fileWriter.close();
            // if you don't close the changes will not be saved.
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
