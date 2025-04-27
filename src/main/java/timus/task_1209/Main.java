package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            long Ki = scanner.nextLong();
            long D = 8 * (Ki - 1) + 1;

            long sqrtD = (long) Math.sqrt(D);
            if (sqrtD * sqrtD == D && (sqrtD - 1) % 2 == 0) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
