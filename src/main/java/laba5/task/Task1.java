package laba5.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    private static final String word = "вход";

    public static void main(String[] args) {
        String string = "Напишите функцию, Которая на вход список " +
                "Строк и возвращает Новый список , содержащий только Те строки, " +
                "которые начинаются с Большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStrings(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.contains(word))
                .collect(Collectors.toList());
    }
}
