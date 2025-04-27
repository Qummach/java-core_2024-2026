package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        if (60 + (12 - f) * 45 <= 300) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
