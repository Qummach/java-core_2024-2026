package timus.task_1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P = scanner.nextDouble();
        double Q = scanner.nextDouble();

        for (int N = 1; ; N++) {
            double lower = N * P / 100.0;
            double upper = N * Q / 100.0;

            if (Math.floor(lower) + 1 < upper) {
                System.out.println(N);
                return;
            }
        }
    }
}
