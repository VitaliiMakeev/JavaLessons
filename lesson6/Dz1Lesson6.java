package org.example.HomeWork.lesson6;

import java.util.*;

public class Dz1Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop1 = new Laptop(16, 512, "win7", "red");
        Laptop laptop2 = new Laptop(8, 1000, "win10", "black");
        Laptop laptop3 = new Laptop(32, 256, "win11", "gray");
        Laptop laptop4 = new Laptop(4, 156, "winxp", "green");
        Laptop laptop5 = new Laptop(16, 512, "linux", "blue");
        Laptop laptop6 = new Laptop(8, 256, "linux", "red");
        Laptop laptop7 = new Laptop(32, 512, "macos", "gray");
        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);

        HashMap<Integer, String> mapKrit = new HashMap<>();
        mapKrit.put(1, "ОЗУ");
        mapKrit.put(2, "Обьем ЖД");
        mapKrit.put(3, "Операционная система");
        mapKrit.put(4, "Цвет");

        // System.out.println("askMetod(mapKrit, scanner) = " + askMetod(mapKrit, scanner));
        System.out.println("filtrResult(askMetod(mapKrit, scanner), laptopSet) = " +
                filtrResult(askMetod(mapKrit, scanner), laptopSet));


    }

    /**
     * @apiNote Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     * @param stringStringHashMap Параметры фильтрации
     * @param laptops множество ноутбуков
     * @return результат, соответствующий критериям
     */
    private static HashSet<Laptop> filtrResult(HashMap<String, String> stringStringHashMap, HashSet<Laptop> laptops) {
        FilterLaptop filterLaptop = new FilterLaptop();
        HashSet<Laptop> result1 = new HashSet<>();
        HashSet<Laptop> result2 = new HashSet<>();
        HashSet<Laptop> result3 = new HashSet<>();
        HashSet<Laptop> result4 = new HashSet<>();

        for (int i = 0; i < stringStringHashMap.size(); i++) {
            if (stringStringHashMap.containsKey("ОЗУ")){
                result1 = filterLaptop.filtrOzu(laptops, Integer.parseInt(stringStringHashMap.get("ОЗУ")));
                stringStringHashMap.remove("ОЗУ");
                i++;
            }
            if (stringStringHashMap.containsKey("Обьем ЖД")){
                result2 = filterLaptop.filtrMemory(laptops, Integer.parseInt(stringStringHashMap.get("Обьем ЖД")));
                stringStringHashMap.remove("Обьем ЖД");
                i++;
            }
            if (stringStringHashMap.containsKey("Операционная система")){
                result3 = filterLaptop.filtrOs(laptops, stringStringHashMap.get("Операционная система"));
                stringStringHashMap.remove("Операционная система");
                i++;
            }
            if (stringStringHashMap.containsKey("Цвет")){
                result4 = filterLaptop.filtrColour(laptops, stringStringHashMap.get("Цвет"));
                stringStringHashMap.remove("Цвет");
                i++;
            }
        }
        HashSet<Laptop> res1 = new HashSet<>(filterLaptop.retail(result1, result2));
        HashSet<Laptop> res2 = new HashSet<>(filterLaptop.retail(result3, result4));
        HashSet<Laptop> resFinal = new HashSet<>(filterLaptop.retail(res1, res2));

        return resFinal;
    }

    /**
     * @apiNote Написать метод, который будет запрашивать у пользователя критерий (или критерии)
     * фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map
     *  Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
     *  фильтрации можно также в Map.
     * @param mapKrit Варианты параметров фильтрации
     * @param scanner сканер
     * @return параметры фильтрации Map
     */
    private static HashMap<String, String> askMetod(HashMap<Integer, String> mapKrit, Scanner scanner) {
        HashMap<String, String> res = new HashMap<>();

        boolean flag = true;
        while (flag){
            System.out.println("“Введите цифру, соответствующую необходимому критерию: ");
            for (int i = 1; i < mapKrit.size() + 1; i++) {
                System.out.println(i + " - " + mapKrit.get(i));
            }
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n > 0 && n <= 2){
                System.out.println("Введите минимальное значение: ");
                String n1 = scanner.nextLine();
                res.put(mapKrit.get(n), n1);
            } else if (n == 3){
                System.out.println("Введите ОС (win7, win10, macos, linux): ");
                String n2 = scanner.nextLine();
                res.put(mapKrit.get(n), n2);
            } else if (n == 4) {
                System.out.println("Введите цвет (английский): ");
                String n3 = scanner.nextLine();
                res.put(mapKrit.get(n), n3);
            }
            System.out.println("Продолжим фильтрацию? (y/n)");
            String n4 = scanner.nextLine();
            if (n4.charAt(0) == 'n'){
                flag = false;
            }
        }
        scanner.close();
        return res;
    }
}
