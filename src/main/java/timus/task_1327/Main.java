package timus.task_1327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальный день");
        int startingDay = scanner.nextInt();
        System.out.println("Введите конечный день");
        int finalDay = scanner.nextInt();
        scanner.close();

        int countFuse = 0;
        for (int i = startingDay; i <= finalDay; i++) {
            if (i % 2 == 1) {
                countFuse++;
            }
        }

        System.out.println("Янус спалит предохранитель " + countFuse + " раз(-а)");
    }
}
