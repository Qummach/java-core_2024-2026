package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = scanner.nextLine();

        System.out.println("Введите кол-во дней в этом месяце");
        int numDays = scanner.nextInt();
        scanner.close();

        System.out.println(month + " содержит " + numDays + " день/дней");
    }
}
