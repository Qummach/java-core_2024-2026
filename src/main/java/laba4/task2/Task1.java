package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите размер массива");
            int arraySize = scanner.nextInt();

            if (arraySize <= 0) {
                System.out.println("Ошибка: размер массива должен быть больше нуля");
                return;
            }

            int[] array = new int[arraySize];
            int positiveCount = 0;
            int sum = 0;

            System.out.println("Введите элементы массива");
            for (int i = 0; i < arraySize; i++) {
                try {
                    array[i] = scanner.nextInt();

                    if (array[i] > 0) {
                        sum += array[i];
                        positiveCount++;
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Ошибка: введена строка вместо числа");
                    scanner.next();
                    i--;
                }
            }

            if (positiveCount == 0) {
                throw new ArithmeticException("Ошибка: положительные эелементы отсутствуют");
            } else {
                double average = (double) sum / positiveCount;
                System.out.println("Среднее значение положительных элементов: " + average);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: несоответствие числового типа данных при вводе размера массива");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена");
        }
    }
}
