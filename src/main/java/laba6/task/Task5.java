package laba6.task;

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static int findMax(int[] arr) throws InterruptedException, ExecutionException {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Integer>> futures = new ArrayList<>();

        int chunkSize = (arr.length + numThreads - 1) / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, arr.length);

            if (start >= end) break;

            futures.add(executor.submit(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (arr[j] > localMax) {
                        localMax = arr[j];
                    }
                }
                return localMax;
            }));
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            int localMax = future.get();
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }

        executor.shutdown();
        return globalMax;
    }
    public static void main(String[] args) throws Exception {
        int[] data = {3, 5, 1, 9, 4, 7, 2, 8, 6, 0};
        System.out.println("Максимум: " + findMax(data));
    }
}
