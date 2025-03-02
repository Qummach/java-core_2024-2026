package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.println("Введите отчество: ");
        String patronymic = scanner.nextLine();
        scanner.close();

        System.out.println("Hello " + lastName + ", " + firstName + ", " + patronymic);
    }
}
