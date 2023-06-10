package org.example.HomeWork.lesson2;

import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        System.out.println("sumProstNum(n, scanner) = " + sumProstNum(n, scanner));
    }

    /**
     * @apiNote 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n длинна последомательности целых чисел
     * @param scanner сканер
     * @return сумму простых чисел
     */
    private static int sumProstNum(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            int n1 = scanner.nextInt();
            for (int j = 2; j < n1 - 1; j++) {
                if(n1 % j == 0) {
                    tmp++;
                }
            }
            if (tmp == 0){
                sum += n1;
            }
        }
        scanner.close();
        return sum;
    }
}
