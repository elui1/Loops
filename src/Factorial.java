import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
