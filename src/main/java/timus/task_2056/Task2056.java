package timus.task_2056;

import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        boolean hasThree = false;
        boolean allFives = true;

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            sum += grade;
            if (grade == 3) {
                hasThree = true;
            }
            if (grade != 5) {
                allFives = false;
            }
        }

        scanner.close();

        if (hasThree) {
            System.out.println("None");
        } else if (allFives) {
            System.out.println("Named");
        } else if ((double) sum / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
