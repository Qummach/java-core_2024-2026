package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stones = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
            totalSum += stones[i];
        }

        int minDiff = Integer.MAX_VALUE;
        for (int mask = 0; mask < (1 << n); mask++) {
            int subsetSum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetSum += stones[i];
                }
            }
            int diff = Math.abs(totalSum - 2 * subsetSum);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        System.out.println(minDiff);
    }
}
