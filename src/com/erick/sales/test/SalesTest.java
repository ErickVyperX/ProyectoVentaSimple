package com.erick.sales.test;

import com.erick.sales.Order;
import com.erick.sales.Product;

public class SalesTest {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 26.5);
        Product product2 = new Product("Pants", 121.5);
        Product product3 = new Product("Coat", 121.5);
        Product product4 = new Product("Sweater", 121.5);
        Product product5 = new Product("Ties", 121.5);
        Product product6 = new Product("Belt", 121.5);
        Product product7 = new Product("T-shirt", 121.5);
        Product product8 = new Product("Jacket", 121.5);
        Product product9 = new Product("Gloves", 121.5);
        Product product10 = new Product("Sandals", 121.5);
        //Product product11 = new Product("sad", 121.5);
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);
        order1.addProduct(product4);
        order1.addProduct(product5);
        order1.addProduct(product6);
        order1.addProduct(product7);
        order1.addProduct(product8);
        order1.addProduct(product9);
        order1.addProduct(product10);
        //order1.addProduct(product11);
        System.out.println(order1.showOrderDetails());

        order1 = new Order();
        order1.addProduct(product3);
        order1.addProduct(product5);
        System.out.println(order1.showOrderDetails());
    }
}
