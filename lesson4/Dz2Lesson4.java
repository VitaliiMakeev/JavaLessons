package org.example.HomeWork.lesson4;

public class Dz2Lesson4 {
    public static void main(String[] args) {
        String s = "()";
        String s1 = "(){}[]";
        String s2 = "(]";
        String s4 = "()}}[]";
        System.out.println("toChekFinal(s) = " + toChekFinal(s));
        System.out.println("toChekFinal(s) = " + toChekFinal(s1));
        System.out.println("toChekFinal(s) = " + toChekFinal(s2));
        System.out.println("toChekFinal(s) = " + toChekFinal(s4));




    }

    /**
     * @apiNote Учитывая строку, s содержащую только символы '(', ')' '{', '}' '[' ']',,,,,,,,,,,,,,и,,, определите,
     * является ли введенная строка допустимой.
     * @param s строка с которой работаем
     * @return результат
     */
    private static boolean toChekFinal(String s) {
        boolean result = false;
        char[] array = s.toCharArray();
        if (array.length % 2 != 0) {
            return result;
        }
        for (int i = 0; i < array.length; i+=2) {
            String tmp = Character.toString(array[i]);
            if(!toChekOne(tmp).isEmpty() && toChekOne(tmp).charAt(0) == array[i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * @apiNote Вспомогательный метод
     * @param s строка
     * @return результат
     */
    private static String toChekOne(String s) {
        String res = "";
        switch (s){
            case ("("):
                res = ")";
                break;
            case ("{"):
                res = "}";
                break;
            case ("["):
                res = "]";
                break;
        }
        return res;
    }
}
