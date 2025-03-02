package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = scanner.nextLine();

        System.out.println("Введите название текущего месяца: ");
        String currentMonth = scanner.nextLine();

        System.out.println("Введите текущую дату(Номер дня): ");
        short date = scanner.nextShort();
        scanner.close();

        System.out.println("Сегодня " + day + " , " + date + " " + currentMonth);
    }
}
