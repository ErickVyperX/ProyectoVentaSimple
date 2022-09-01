package com.erick.sales.test;

import com.erick.sales.Order;
import com.erick.sales.Product;

public class SalesTest {
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 26.5);
        Product product2 = new Product("Pants", 121.5);
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        System.out.println(order1.showOrderDetails());

        Product product3 = new Product("Coat", 245.0);
        Product product4 = new Product("Sweater", 221.5);
        Order order2 = new Order();
        order2.addProduct(product3);
        order2.addProduct(product4);
        System.out.println(order2.showOrderDetails());

    }
}
