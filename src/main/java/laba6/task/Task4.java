package laba6.task;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i;
            new Thread(() -> System.out.println(threadNumber)).start();
        }
    }
}
