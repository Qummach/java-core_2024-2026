package laba1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.nextLine();

        System.out.println("Input age: ");
        int age = scanner.nextInt();

        System.out.println("Input height: ");
        float height = scanner.nextFloat();
        scanner.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        scanner.close();
    }
}
