package timus.task_1820;

import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n <= k) {
            System.out.println(2);
        } else {
            int time = (2 * n + k - 1) / k;
            System.out.println(time);
        }
    }
}
