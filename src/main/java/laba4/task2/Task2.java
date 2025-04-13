package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.println("Введите номер столбца для вывода: ");
            int columnNumber = scanner.nextInt();

            if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                throw new IndexOutOfBoundsException("Ошибка: столбец с номером " + columnNumber + " не существует");
            }

            for (int[] row : matrix) {
                System.out.println(row[columnNumber]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена");
        }
    }
}
