package timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int d = 0; d < 2 * N - 1; d++) {
            int startRow = Math.min(d, N - 1);
            int startCol = Math.max(0, d - (N - 1));

            while (startRow >= 0 && startCol < N) {
                System.out.print(matrix[startRow][startCol] + " ");
                startRow--;
                startCol++;
            }
        }
    }
}
