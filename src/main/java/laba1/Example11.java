package laba1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();

        System.out.println("Введите год вашего рождения");
        int bornDate = scanner.nextInt();
        scanner.close();
        int currentYear = Year.now().getValue();

        System.out.println("Вас зовут " + name + " и вам " + (currentYear - bornDate) + " года/лет");
    }
}
