package org.example.HomeWork.Dz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Вводите числа (для завершения ввода - введите ноль)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        numbers.add(n);
        do {
            int n1 = scanner.nextInt();
            if (n1 != 0) {
                numbers.add(n1);
            }
            n = n1;
        } while (n != 0);
        scanner.close();
        System.out.println(numbers);    // для наглядности
        System.out.println("minAveMax(numbers) = " + minAveMax(numbers));
    }

    /**
     * @apiNote 4. Задан целочисленный список ArrayList.
     * Найти минимальное, максимальное и среднее из этого списка.
     * @param numbers список чисел
     * @return список [min, max, среднее]
     */
    public static ArrayList<Integer> minAveMax(List<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();
        int min = numbers.get(0);
        int max = numbers.get(0);
        int ave = 0;
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            ave += number;
        }
        result.add(min);
        result.add(max);
        result.add(ave/numbers.size());
        return result;
    }



}
