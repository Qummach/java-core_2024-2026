package laba7.task;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String fileName = scanner.nextLine();

        System.out.println("Введите текст");
        String text = scanner.nextLine();

        File file = new File("src/main/java/laba7/" + fileName);

        try (PrintWriter printWriter = new PrintWriter(file, "UTF-8")) {
            printWriter.println(text);
            System.out.println("Текст добавлен в файл");
            System.out.println("Было добавлено " + text.length() + " символа");
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }

        scanner.close();
    }
}
