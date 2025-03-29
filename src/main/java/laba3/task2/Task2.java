package laba3.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print(number + " в двоичной системе счисления: ");
        convertToBinary(number);
    }

    public static void convertToBinary(int number) {
        if (number > 1) {
            convertToBinary(number / 2);
        }
        System.out.print(number % 2);
    }
}
