package timus.task_1607;

import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int petyaPrice = a;
        int taxiPrice = c;
        int result = petyaPrice;

        while (petyaPrice < taxiPrice) {
            petyaPrice += b;
            if (petyaPrice >= taxiPrice) {
                result = taxiPrice;
                break;
            }
            taxiPrice -= d;
            if (petyaPrice >= taxiPrice) {
                result = petyaPrice;
                break;
            }
            result = petyaPrice;
        }

        System.out.println(result);
    }
}
