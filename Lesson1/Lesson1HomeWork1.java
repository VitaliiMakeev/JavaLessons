package org.example.HomeWork.Lesson1;

import java.util.Scanner;

public class Lesson1HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("triumNumber(n) = " + triumNumber(n));
        scanner.close();
    }

    /**
     * @apiNote 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     * @param n int
     * @return число шариков, из которых можно собрать треугольник
     */
    private static int triumNumber(int n) {
        return n*(n+1)/2;
    }
}
