package laba2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(120);
            System.out.print(array[i]);
            System.out.print(" ");
        }
        int min = Arrays.stream(array).min().getAsInt();

        List<Integer> indexes = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                indexes.add(j);
            }
        }

        System.out.println("\nМинимальное значение равно: " + min + " его индекс/ы " + indexes);
    }
}
