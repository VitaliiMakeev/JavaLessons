package org.example.HomeWork.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Dz1Lesson5 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String str1 = "Россия";
        System.out.println("finderStr(str, str1) = " + finderStr(str, str1));

    }

    /**
     * @apiNote 1) Подсчитать количество искомого слова, через map
     * (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     * @param str входная строка
     * @param str1 искомое слово в строке
     * @return результат
     */
    private static String finderStr(String str, String str1) {
        Map<String, Integer> mapStr = new HashMap<>();
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            String temp = array[i].replace('.', ' ').trim().toLowerCase();
            mapStr.putIfAbsent(temp, 0);
            mapStr.put(temp, mapStr.get(temp) + 1);
        }
        String str3 = str1.replace('.', ' ').trim().toLowerCase();
        return str1 + " - " + mapStr.get(str3);
    }
}
