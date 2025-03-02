package laba1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        scanner.close();
        int currentYear = Year.now().getValue();

        System.out.println("Вы родились в " + (currentYear - age) + " году");
    }
}
