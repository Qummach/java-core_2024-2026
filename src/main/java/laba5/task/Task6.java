package laba5.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task6 {
    private static final int number = 30;

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Список целых чисел : ");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(122));
            System.out.println(integers.get(i));
        }

        List<Integer> result = filterNumberValues(integers);

        System.out.println("Список чисел, которые меньше " + number);
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterNumberValues(List<Integer> list) {
        return list.stream()
                .filter(x -> x < number)
                .collect(Collectors.toList());
    }
}
