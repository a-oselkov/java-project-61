package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

import static hexlet.code.Engine.greet;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println(" ");

        switch (choice) {
            case 1 -> greet();
            case 2 -> Even.playEven();
            case 3 -> Calc.playCalc();
            case 4 -> Gcd.playGcd();
            case 5 -> Gcd_test.playGcd_test();
            case 6 -> Prime.playPrime();
            default -> System.out.println("2222222");
        }

        scanner.close();
    }
}
