package org.example.HomeWork.lesson5;

import java.util.*;

public class Dz2Lesson5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Иван Иванов");
        linkedList.add("Светлана Петрова");
        linkedList.add("Кристина Белова");
        linkedList.add("Анна Мусина");
        linkedList.add("Анна Крутова");
        linkedList.add("Иван Юрин");
        linkedList.add("Петр Лыков");
        linkedList.add("Павел Чернов");
        linkedList.add("Петр Чернышов");
        linkedList.add("Мария Федорова");
        linkedList.add("Марина Светлова");
        linkedList.add("Мария Савина");
        linkedList.add("Мария Рыкова");
        linkedList.add("Марина Лугова");
        linkedList.add("Анна Владимирова");
        linkedList.add("Иван Мечников");
        linkedList.add("Петр Петин");
        linkedList.add("Иван Ежов");
        HashMap<String, Integer> mapStr = creatMap(linkedList);
        printMap(sortedMap(mapStr));



    }

    /**
     * @apiNote Выводит HashMap в консоль
     * @param mapStr результат
     */
    private static void printMap(Map<String, Integer> mapStr) {
        for (Map.Entry<String, Integer> entry : mapStr.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }

    /**
     * @apiNote Пусть дан список сотрудников:
     *     Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
     *     Отсортировать по убыванию популярности.
     * @param mapStr сортируемый HashMap
     * @return сортированный LinkedHashMap
     */
    public static LinkedHashMap<String, Integer> sortedMap(Map<String, Integer> mapStr) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mapStr.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return (LinkedHashMap<String, Integer>) result;
    }

    /**
     * @apiNote Создает HashMao из LinkedList
     * @param linkedList из чего надо создать
     * @return HashMap
     */
    private static HashMap<String, Integer> creatMap(LinkedList<String> linkedList) {
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < linkedList.size(); i++) {
            String name = linkedList.get(i).toString().split(" ")[0];
            mapStr.putIfAbsent(name, 0);
            mapStr.put(name, mapStr.get(name) + 1);
        }
        return (HashMap<String, Integer>) mapStr;
    }


}
