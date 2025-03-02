package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во панелей: ");
        int panelsNumber = scanner.nextInt();

        System.out.print("Введите высоту панели: ");
        int panelsHeight = scanner.nextInt();

        System.out.print("Введите ширину панели: ");
        int panelsWidth = scanner.nextInt();
        scanner.close();

        if ((panelsNumber>=1 & panelsNumber<=100) & (panelsHeight>=1 & panelsHeight <=100)
                & (panelsWidth>=1 & panelsWidth<=100))
        {
            int amountThorium = ((panelsHeight * panelsWidth) * 2) * panelsNumber;
            System.out.println(amountThorium);
        } else {
            System.out.println("Некорректный размер панелей");
        }
    }
}
