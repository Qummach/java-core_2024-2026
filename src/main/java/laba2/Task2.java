package laba2;

public class Task2 {
    public static void main(String[] args) {
        int x = 9, y = 9;
        int[][] array = new int[x][y];
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < y; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int k = y - 1; k >= 0; k--) {
                    array[i][k] = value++;
                }
            }
        }

        for (int[] a : array) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
