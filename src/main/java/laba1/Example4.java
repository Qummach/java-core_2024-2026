package laba1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your number: ");
        int number = scanner.nextInt();

        System.out.println("Your number: " + number);
        scanner.close();
    }
}
