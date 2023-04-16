package com.example.shop.service;

import com.example.shop.model.Product;
import com.example.shop.model.Status;
import com.example.shop.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class ProductService {
    @Autowired
    ProductsRepository products;
    private Long id = 0L;

    public Map<Long, Product> listAllProducts () {
        return products.getProducts();
    }

    public Product getProduct(Long id) {
        return listAllProducts().get(id);
    }

    public void create (String name, int price, int count, Status status) {
        Product post = new Product(id++, name, price, count, status);
    }

    public void create (String name, int price, int count) {
        Product post = new Product(id++, name, price, count);
        products.Add(post);
    }

    public void delete (Long id) {
        products.Delete(id);
    }
}
