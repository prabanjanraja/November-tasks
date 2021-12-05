import java.io.File;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        File file = new File("10000 random numbers.txt");
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // print a new line
        System.out.println();
        // print the time taken for the program
        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime) + " ns");
    }
}
