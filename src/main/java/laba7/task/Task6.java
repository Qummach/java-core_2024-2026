package laba7.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");

        String fileName = scanner.nextLine();

        System.out.println("Введите слово");
        String word = scanner.nextLine();

        File file = new File("src/main/java/laba7/" + fileName);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Файл не найден");
            scanner.close();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNum = 0;
            boolean found = false;
            System.out.println("Строки содержащие слово: ");
            while ((line = reader.readLine()) != null) {
                lineNum++;

                if (line.contains(word)) {
                    System.out.println("Строка: " + lineNum + ", " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Слово не найдено");
            }
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
        scanner.close();
    }
}
