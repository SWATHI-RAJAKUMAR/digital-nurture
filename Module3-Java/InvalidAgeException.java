// InvalidAgeException.java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// AgeCheck.java
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old.");
            }

            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}