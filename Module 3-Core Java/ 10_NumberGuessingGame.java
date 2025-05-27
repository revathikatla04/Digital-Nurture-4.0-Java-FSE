import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Correct! The number was " + numberToGuess);
            }
        }
    }
}