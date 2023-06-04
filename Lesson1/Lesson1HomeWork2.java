package org.example.HomeWork.Lesson1;

public class Lesson1HomeWork2 {
    public static void main(String[] args) {
        justNumber();
    }

    /**
     * @apiNote 2) Вывести все простые числа от 1 до 1000
     * Вывщдит в консоль простые числа от 1 до 1000
     */
    private static void justNumber() {
        for (int i = 1; i < 1001; i++) {
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    k++;
                    break;
                }
            }if (k == 0) System.out.println(i);
        }
    }
}
