package laba7.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                       new FileReader("src/main/java/laba7/input.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Кол-во строк в файле: " + lineCount);
    }
}
