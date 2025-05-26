// EvenOddChecker.java
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close();
    }
}