package org.example.HomeWork.lesson4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Dz1lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите цифры (для завершения введите ноль): ");
        LinkedList<Integer> linkedList = creatList(scanner);
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println("Collections.reverse(linkedList) = " + linkedList);
        System.out.println("reversTow(linkedList) = " + reversTow(linkedList));
        System.out.println("reversThree(linkedList) = " + reversThree(linkedList));
    }

    /**
     * @apiNote 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param linkedList список
     * @return перевернутый список
     */
    private static LinkedList<Integer> reversThree(LinkedList<Integer> linkedList) {
        LinkedList<Integer> result = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            result.add(linkedList.pollFirst());
        }
        return result;
    }
    /**
     * @apiNote вспомогательная функция
     * @param scanner сканер
     * @return создает список
     */
    private static LinkedList creatList(Scanner scanner) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        int n = scanner.nextInt();
        if (n == 0) {
            return integerLinkedList;
        } else {
            integerLinkedList.add(n);
        }
        while (n != 0) {
            int k = scanner.nextInt();
            if (k > 0) {
                integerLinkedList.add(k);
            }
            n = k;
        }
        return integerLinkedList;
    }
    /**
     * @apiNote 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param someList список
     * @return перевернутый список
     */
    public static LinkedList<Integer> reversTow(LinkedList<Integer> someList){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = someList.size() - 1; i >= 0 ; i--) {
            result.add(someList.get(i));
        }
        return result;
    }
}
