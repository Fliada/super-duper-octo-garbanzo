package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProductsCreateController {
    @Autowired
    ProductService productService;

    @PutMapping("/api/add")
    public void addProduct(@RequestParam(name = "name") String name, @RequestParam(name = "price") String price, @RequestParam(name = "count") String count) {
        productService.create(name, Integer.parseInt(price), Integer.parseInt(count));
    }
}
