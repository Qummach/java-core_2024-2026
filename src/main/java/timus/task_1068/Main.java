package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum;
        if (n >= 1) {
            sum = n * (n + 1) / 2;
        } else {
            sum = (1 - n) * n / 2 + 1;
        }
        System.out.println(sum);
    }
}
