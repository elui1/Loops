import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secret = 1 + rand.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = input.nextInt();

        while (guess != secret) {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = input.nextInt();
        }

        System.out.println("That's right! You're a good guesser.");

    }
}
