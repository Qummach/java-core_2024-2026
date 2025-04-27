package laba5.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    private static final int number = 10;

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Список целых чисел : ");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> result = filterNumber(integers);

        System.out.println("Список чисел, которые делятся на " + number + " без остатка");

        for (Integer i : result) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterNumber(List<Integer> list) {
        return list.stream()
                .filter(x -> x % number == 0)
                .collect(Collectors.toList());
    }
}
