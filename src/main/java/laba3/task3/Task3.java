package laba3.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        fillArray(array, scanner, 0);

        System.out.println("Вывод массива:");
        printArray(array, 0);

        scanner.close();
    }

    public static void fillArray(int[] array, Scanner scanner, int index) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            fillArray(array, scanner, index + 1);
        }
    }

    public static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }
}
