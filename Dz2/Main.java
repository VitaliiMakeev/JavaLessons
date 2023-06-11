package org.example.HomeWork.Dz2;

import org.example.HomeWork.Dz1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product2 product1 = new Product2("Носки1", "Турция", 0.1, 50, 3);
        Product2 product2 = new Product2("Носки2", "Турция", 0.1, 30, 3);
        Product2 product3 = new Product2("Носки3", "Китай", 0.1, 10, 3);
        Product2 product4 = new Product2("Носки4", "Китай", 0.1, 10, 2);
        Product2 product5 = new Product2("Носки5", "Грузия", 0.1, 10, 3);
        List<Product2> product2List = new ArrayList<>();
        product2List.add(product1);
        product2List.add(product2);
        product2List.add(product3);
        product2List.add(product4);
        product2List.add(product5);
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите сорт товара: ");
        int n = scanner.nextInt();
        System.out.println("sourchProduct(n, product2List) = " + sourchProduct(n, product2List));
    }

    /**
     * @apiNote 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * @param n сорт товара
     * @param product2List массив товаров
     * @return список товаров с минимальной ценой заданного сорта
     */
    private static ArrayList<String> sourchProduct(int n, List<Product2> product2List) {
        ArrayList<String> result = new ArrayList<>();
        int minPrice = product2List.get(0).getPrice();
        for (Product2 product2 : product2List) {
            if (product2.getSort() == n && product2.getPrice() <= minPrice){
                minPrice = product2.getPrice();
            }
        }
        for (Product2 product2 : product2List) {
            if (product2.getPrice() == minPrice && product2.getSort() == n){
                result.add(product2.getName());
            }
        }
        return result;
    }
}
