package laba1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Имя: " + name + " / Возраст: " + age);
    }
}
