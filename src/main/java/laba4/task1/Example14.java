package laba4.task1;

public class Example14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива = " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
}
