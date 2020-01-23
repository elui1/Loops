import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    public static void exercise1() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1));
        }
    }

    public static void exercise2() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void exercise3() {
        for (int i = 1; i < 20; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void exercise4() {
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void exercise5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void exercise6() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void exercise7() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = number; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void exercise8() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
