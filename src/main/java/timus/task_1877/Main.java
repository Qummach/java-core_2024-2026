package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lock1 = scanner.nextInt();
        int lock2 = scanner.nextInt();
        scanner.close();

        int attempt = 0;
        while (true) {
            if (attempt == lock1) {
                System.out.println("yes");
                return;
            }
            attempt++;
            if (attempt == lock2) {
                System.out.println("yes");
                return;
            }
            attempt++;
            if (attempt > 9999) break;
        }
        System.out.println("no");
    }
}
