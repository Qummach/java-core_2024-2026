package laba4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int arraySize = scanner.nextInt();

            if (arraySize <= 0) {
                System.out.println("Ошибка: размер массива должен быть больше нуля");
                return;
            }

            byte[] array = new byte[arraySize];
            byte sum = 0;

            System.out.println("Введите элементы массива");
            for (int i = 0; i < arraySize; i++) {
                try {
                    int input = scanner.nextInt();

                    if (input < Byte.MIN_VALUE || input > Byte.MAX_VALUE) {
                        throw new ArithmeticException("Ошибка: выход за диапазон byte");
                    }

                    array[i] = (byte) input;

                    int tempSum = sum + array[i];
                    if (tempSum > Byte.MAX_VALUE || tempSum < Byte.MIN_VALUE) {
                        throw new ArithmeticException("Ошибка: переполнение при вычислении суммы");
                    }
                    sum = (byte) tempSum;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введена строка вместо числа");
                    scanner.next();
                    i--;
                }
            }
            System.out.println("Сумма = " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: несоответствие числового типа данных при вводе размера массива");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена");
        }
    }
}
