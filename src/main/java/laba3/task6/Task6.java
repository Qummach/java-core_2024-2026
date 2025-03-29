package laba3.task6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        int N = 10000;

        long startTime = System.nanoTime();
        aarrayList(N);
        long endTime = System.nanoTime();
        System.out.println("Время выполнения (ArrayList): " + (endTime - startTime) / 1_000_000_000.0 + " сек");

        startTime = System.nanoTime();
        llinkedList(N);
        endTime = System.nanoTime();
        System.out.println("Время выполнения (LinkedList): " + (endTime - startTime) / 1_000_000_000.0 + " сек");
    }

    public static void aarrayList(int N) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }
    }

    public static void llinkedList(int N) {
        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }
    }
}
