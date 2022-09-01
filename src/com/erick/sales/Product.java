package com.erick.sales;

import java.util.StringJoiner;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int counterIdProducts;

    private Product() {
        this.idProduct = counterIdProducts++;
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("idProduct=" + idProduct)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }
}
