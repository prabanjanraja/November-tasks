import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RunAJavaPRgrm {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. continue");
        System.out.println("2. exit");
        choice = input.nextInt();
        if (choice == 1) {
            ReverseString.main(args);
        } else {
            System.out.println("Thank you");
        }
    }
}
