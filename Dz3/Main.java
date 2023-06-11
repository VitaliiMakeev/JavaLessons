package org.example.HomeWork.Dz3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 50_000, 1863, 1300);
        Book book2 = new Book("Книга1", "Достаевский", 23_000, 2010, 907);
        Book book3 = new Book("Книга2", "Пушкин", 18_000, 2011, 1050);
        Book book4 = new Book("Книга3", "Грибоедов", 32_000, 2008, 983);
        Book book5 = new Book("Книга4", "Аносов", 31_000, 2015, 911);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println("sourchBookName(bookList) = " + sourchBookName(bookList));

    }

    /**
     * @apiNote 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и
     * количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и
     * год издания после 2010 г, включительно.
     * @param bookList массив книг
     * @return список названий кнаг, подходящих условиям.
     */
    private static ArrayList<String> sourchBookName(List<Book> bookList) {
        ArrayList<String> result = new ArrayList<>();
        for (Book book : bookList) {
            if (chekNum(book.getCount()) && book.getSoname().toLowerCase().contains("а") && book.getYer() >= 2010){
                result.add(book.getNameBook());
            }
        }
        return result;
    }

    public static boolean chekNum(int num){
        if (num < 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
