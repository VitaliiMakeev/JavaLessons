package org.example.HomeWork.lesson2;

import java.util.Random;
import java.util.Scanner;


public class Dz3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("printAray(chekArray(n)) = " + printAray(chekArray(n)));
    }

    /**
     * @apiNote 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму
     *     индексов двузначных элементов массива.
     * @param n длинна будущего массива цифр
     * @return массив цифр
     */
    private static int[] chekArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(-100, 100);
            if (array[i] >= 10 && array[i] < 100){
                sum += i;
            }
        }
        System.out.println(printAray(array));   // для проверки
        for (int i = 0; i < n; i++) {
            if (array[i] < 0){
                array[i] = sum;
            }
        }
        return array;
    }

    /**
     * @param array массив чисел
     * @return строку вида: [n, n1, ...]
     */
    public static String printAray(int[] array){
        String res = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                res += array[i] + "]";
                break;
            }
            res += array[i] + ",";
        }
        return res;
    }


}
