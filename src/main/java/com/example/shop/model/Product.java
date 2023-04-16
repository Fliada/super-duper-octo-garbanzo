package com.example.shop.model;

import jakarta.persistence.*;

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "count")
    private int count;

    @Column(name = "status")
    private Status status;

    public Product(String name, int price, int count, Status status)
    {
        this.id = -1L;
        setName(name);
        setCount(count);
        setStatus(status);
    }

    public Product(String name, int price, int count)
    {
        this.id = -1L;
        setName(name);
        setCount(count);
        this.status = Status.none;
    }

    public Product(String name, int price)
    {
        this.id = -1L;
        setName(name);
        this.count = 1;
        this.status = Status.none;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
