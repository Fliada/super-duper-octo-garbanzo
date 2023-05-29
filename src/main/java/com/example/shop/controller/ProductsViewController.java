package com.example.shop.controller;

import com.example.shop.model.Product;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@RestController
public class ProductsViewController {
    @Autowired
    ProductService productService;

    @GetMapping("/api/list")
    public Map<Long, Product> list() {
        return productService.listAllProducts();
    }

    @PostMapping("/api/{id}")
    public Product product(@PathVariable Long id) {
        return productService.getProduct(id);
    }
}
