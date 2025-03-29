package laba3.task5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "a");
        map.put(1, "bbbbbbbb");
        map.put(2, "ccc");
        map.put(3, "dddddddddd");
        map.put(4, "eeeeee");
        map.put(5, "fffffffffffff");
        map.put(6, "gg");
        map.put(7, "hhhhh");
        map.put(8, "kkkkkkkkk");
        map.put(9, "l");

        System.out.println("Строки с ключами > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.println("Строки при ключе 0: " + map.get(0));
        }

        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }

        System.out.println("Произведение ключей (длина строки > 5): " + product);
    }
}
