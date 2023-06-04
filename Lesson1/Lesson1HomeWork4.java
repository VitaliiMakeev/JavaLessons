package org.example.HomeWork.Lesson1;

import java.util.Scanner;

public class Lesson1HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Введите пример вида(2? + ?5 = 69)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(findResult(str));
    }

    public static int num1(String str) {
        String res = str.trim().split(" ")[0].replace("?", "");
        int result = Integer.parseInt(res);
        return result;
    }

    public static int num2(String str) {
        String res = str.trim().split(" ")[2].replace("?", "");
        int result = Integer.parseInt(res);
        return result;
    }

    public static int res(String str) {
        String res = str.trim().split(" ")[4];
        int result = Integer.parseInt(res);
        return result;
    }

    public static char operand(String str) {
        char res = str.trim().split(" ")[1].charAt(0);
        return res;
    }

    public static char getOper() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите операцию(+, -, *, /):");
        return scanner1.next().trim().charAt(0);
    }

    public static int calc(int a, int b, char c) {
        int result = 0;
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
        }
        return result;
    }

    /**
     * РАБОТАЕТ ТОЛЬКО С ДВУХЗНАЧНЫМИ ЧИСЛАМИ
     * @apiNote 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     * @param str строка примера
     * @return правильный пример или сообщение.
     */
    private static String findResult(String str) {
        String res111 = "Нет подходящик решений.";
        int len = str.trim().length();
        int prob = 0;
        int num1 = num1(str);
        char operation = operand(str);
        int num2 = num2(str);
        int res = res(str);
        int storona1 = 0;
        int storona2 = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') prob++;
        }
        if (prob != 4) return "Вы некорректно ввели пример, попробуйте еще раз.";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '?' && i > 0) {
                storona1++;
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') prob--;
            if (prob == 2) {
                for (int j = 1; j < len; j++) {
                    if (str.charAt(i + j) == '?' && j > 1) {
                        storona2++;
                        break;
                    } else break;
                }
            }
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (storona1 == 1 && storona2 == 1) {
                    int num11 = (num1 * 10) + i;
                    int num22 = (num2 * 10) + j;
                    int result = calc(num11, num22, operation);
                    if (result == res){
                        res111 = num11 + " + " + num22 + " = " + res;
                        break;
                    }
                } else if (storona1 == 0 && storona2 == 0) {
                    int num11 = ((i + 1) * 10) + num1;
                    int num22 = ((j + 1) * 10) + num2;
                    int result = calc(num11, num22, operation);
                    if (result == res){
                        res111 = num11 + " + " + num22 + " = " + res;
                        break;
                    }
                } else if (storona1 == 1 && storona2 == 0) {
                    int num11 = (num1 * 10) + i;
                    int num22 = ((j + 1) * 10) + num2;
                    int result = calc(num11, num22, operation);
                    if (result == res){
                        res111 = num11 + " + " + num22 + " = " + res;
                        break;
                    }
                } else if (storona1 == 0 && storona2 == 1) {
                    int num11 = ((i + 1) * 10) + num1;
                    int num22 = (num2 * 10) + j;
                    int result = calc(num11, num22, operation);
                    if (result == res){
                        res111 = num11 + " + " + num22 + " = " + res;
                        break;
                    }
                }
            }
        }
        return res111;
    }
}
