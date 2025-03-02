package laba1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год вашего рождения");
        int bornDate = scanner.nextInt();
        scanner.close();
        int currentYear = Year.now().getValue();

        System.out.println("Вам " + (currentYear - bornDate) + " года/лет");

    }
}
