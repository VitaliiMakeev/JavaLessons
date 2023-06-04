package org.example.HomeWork.Lesson1;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Lesson1HomeWork3 {
    public static void main(String[] args) {
        calculat();
    }

    /**
     * @apiNote 3) Реализовать простой калькулятор
     */
    public static void calculat(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую, это простой калькулятор!");
        while (flag){
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            char operation = getOper();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.printf("Результат вычисления: %d %s %d = %d\n", num1, operation, num2, calc(num1, num2, operation));
            System.out.print("Продолжим?(y/n): ");
            char flagek = scanner.next().charAt(0);
            if (flagek == 'n'){
                flag = false;
            }
        }

    }
    /**
     * Функция берет из консоли знак операнда
     * @return знак операнда
     */
    public static char getOper() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите операцию(+, -, *, /):");
        return scanner1.next().trim().charAt(0);
    }

    /**
     *
     * @param a int
     * @param b int
     * @param c операнд
     * @return int
     */
    public static int calc(int a, int b, char c) {
        int result;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Операция не распознана, повторите ввод.");
                result = calc(a, b, getOper());
        }
        return result;
    }
}
