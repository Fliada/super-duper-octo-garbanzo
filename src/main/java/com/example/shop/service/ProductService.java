package com.example.shop.service;

import com.example.shop.model.Product;
import com.example.shop.model.Status;
import com.example.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Map;

public class ProductService {
    @Autowired
    ProductsRepository products;

    public Map<Long, Product> listAllProducts () {
        return products.getProducts();
    }

    public void create (String name, int price, int count, Status status) {
        Product post = new Product(name, price, count, status);
    }
}
