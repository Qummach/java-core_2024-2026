package laba5.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        String string = "Напишите фун!кцию!, Котор2ая на вход сп3исок " +
                "возвращает Нов#ый список Те с5троки, " +
                "с Боль%шой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringWithoutCharOrNum = filterStringsCharAndNum(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringWithoutCharOrNum) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsCharAndNum(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я\\s]+"))
                .collect(Collectors.toList());
    }
}
