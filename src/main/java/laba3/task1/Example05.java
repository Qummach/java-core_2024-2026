package laba3.task1;

public class Example05 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        System.out.println("Вызов fact(" + n + ")"); // Вывод последовательности вызовов
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Результат fact(" + n + ") = " + result);
            return result;
        }
    }
}
