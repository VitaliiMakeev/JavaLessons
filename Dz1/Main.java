package org.example.HomeWork.Dz1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Мука", 500, 1);
        Product product2 = new Product("Мука высший сорт", 1500, 2);
        Product product3 = new Product("Печеньки", 400, 1);
        Product product4 = new Product("Рыбка супер высший сорт", 2500, 1);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println("sourchProd(products) = " + sourchProd(products));
    }

    /**
     * @apiNote 1. Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     * @param products массив с которым работаем
     * @return максимальную цену
     */
    private static int sourchProd(List<Product> products) {
        int maxPrice = 0;
        for (Product product : products) {
            if (product.getName().contains("высший") && (product.getSort() == 1 || product.getSort() == 2)){
                if (maxPrice < product.getPrice()){
                    maxPrice = product.getPrice();
                }
            }
        }
        return maxPrice;
    }
}
