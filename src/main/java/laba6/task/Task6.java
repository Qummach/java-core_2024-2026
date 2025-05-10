package laba6.task;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Сумма: " + Sum.sum(numbers));
    }
}
class Sum {
    public static long sum(int[] array) throws InterruptedException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        final int threadsCount = Runtime.getRuntime().availableProcessors();
        final long[] partialSums = new long[threadsCount];
        Thread[] threads = new Thread[threadsCount];

        int chunkSize = array.length / threadsCount;

        for (int i = 0; i < threadsCount; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = (i == threadsCount - 1) ? array.length : start + chunkSize;

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[threadIndex] = sum;
            });

            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        long total = 0;
        for (long sum : partialSums) {
            total += sum;
        }

        return total;
    }
}
