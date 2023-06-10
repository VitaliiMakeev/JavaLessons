package org.example.HomeWork.lesson2;

import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        System.out.println("numberUpp(n, scanner) = " + numberUpp(n, scanner));
    }

    /**
     * @apiNote 2) Дана последовательность из N целых чисел. Верно ли,
     * что последовательность является возрастающей.
     * @param n длинна последомательности целых чисел
     * @param scanner сканер
     * @return результат
     */
    private static boolean numberUpp(int n, Scanner scanner) {
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n1 > n2) {
                return false;
            }
            n1 = n2;
        }
        scanner.close();
        return true;
    }
}
