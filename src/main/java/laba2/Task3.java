package laba2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();

        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = caesarCipher(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equals("y")) {
                String decryptedText = caesarCipher(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        scanner.close();
    }
    public static String caesarCipher(String text, int shift) {
        int length = text.length();
        char[] chars = new char[length];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')) {
                ch = (char) ((ch - 'A' + shift + 26) % 26 + 'A');
            } else if ((ch >= 'a' && ch <= 'z')) {
                ch = (char) ((ch - 'a' + shift + 26) % 26 + 'a');
            }
            chars[i] = ch;
        }
        return new String(chars);
    }
}
