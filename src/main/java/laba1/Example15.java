package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        scanner.close();

        System.out.println("Сумма равна: " + (firstNumber + secondNumber) +
                "\nРазность равна: " + (firstNumber - secondNumber));
    }
}
