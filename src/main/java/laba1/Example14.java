package laba1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Ответ: \n" + (number - 1) + "\n" + number + "\n" + (number + 1)
                + "\n" + pow((number - 1) + number + (number + 1), 2));
    }
}
