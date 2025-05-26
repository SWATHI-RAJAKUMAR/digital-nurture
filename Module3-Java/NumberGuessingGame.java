// NumberGuessingGame.java
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Your guess: ");
            guess = input.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        } while (guess != numberToGuess);

        input.close();
    }
}