package laba5.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    private static final int lengthWord = 9;

    public static void main(String[] args) {
        String string = "Напишите функцию, Которая на вход список " +
                "Строк возвращает Новый список , содержащий только Те строки, " +
                "которые начинаются с Большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsLength(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsLength(List<String> list) {
        return list.stream()
                .filter(s -> s.length() > lengthWord)
                .collect(Collectors.toList());
    }
}
