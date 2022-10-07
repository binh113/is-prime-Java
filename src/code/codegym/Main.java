package code.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "not a prime number");
        } else {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(number);i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                System.out.println(number + "is a prime number");
            } else {
                System.out.println(number + " not a prime number");
            }
        }
    }
}
