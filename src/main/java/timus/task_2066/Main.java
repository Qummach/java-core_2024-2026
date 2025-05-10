package timus.task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] permutations = {
                {a, b, c}, {a, c, b},
                {b, a, c}, {b, c, a},
                {c, a, b}, {c, b, a}
        };

        int minResult = Integer.MAX_VALUE;

        for (int[] nums : permutations) {
            int x = nums[0], y = nums[1], z = nums[2];

            int[] results = {
                    x + y + z,
                    x + y - z,
                    x + y * z,
                    x - y + z,
                    x - y - z,
                    x - y * z,
                    x * y + z,
                    x * y - z,
                    x * y * z
            };

            for (int res : results) {
                if (res < minResult) {
                    minResult = res;
                }
            }
        }
        System.out.println(minResult);
    }
}
