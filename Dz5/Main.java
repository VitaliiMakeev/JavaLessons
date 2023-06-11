package org.example.HomeWork.Dz5;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(numbers);        // для наглядности
        System.out.println("variantsItem(numbers) = " + variantsItem(numbers));
    }

    /**
     * @apiNote 5*) при входном массиве, вернуть массив массивов со всеми перестановками его элементов.
     * @param numbers список чисел
     * @return все варианты перестановок элементов в списке
     */
    private static ArrayList<List<Integer>> variantsItem(List<Integer> numbers) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int count = (numbers.size() - 1) * numbers.size();
        while (count != 0) {
            int tempary = 1;
            for (int i = 0; i < numbers.size() - 1; i++) {
                ArrayList<Integer> copy = new ArrayList<>(numbers);
                Collections.swap(copy, i, tempary);
                result.add(copy);
                numbers = copy;
                tempary++;
                count--;
            }
        }
        return result;
    }
}
