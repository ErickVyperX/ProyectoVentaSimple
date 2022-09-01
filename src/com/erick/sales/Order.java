package com.erick.sales;

import java.util.Arrays;
import java.util.StringJoiner;

public class Order {
    private final int idOrder;
    private final Product[] products;
    private static int counterIdOrders;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = counterIdOrders++;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    //Only 10 products maximum by Order
    public void addProduct(Product product) {
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            if (this.products[i] == null) {
                this.products[i] = product;
                break;
            }
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            if (product == null) {
                break;
            }
            total += product.getPrice();
        }
        return total;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Product[] getProducts() {
        return products;
    }

    public String showOrderDetails() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("\nidOrder=" + getIdOrder())
                .add("\nproducts=" + Arrays.toString(getProducts()))
                .add("\ntotal=" + calculateTotalPrice())
                .toString();
    }
}
