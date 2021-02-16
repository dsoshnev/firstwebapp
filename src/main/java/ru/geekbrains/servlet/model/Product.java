package ru.geekbrains.servlet.model;

public class Product {
    private long id;
    private String name;
    private double cost;

    public Product init(long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
