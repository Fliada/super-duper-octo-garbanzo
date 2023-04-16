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
    @GetMapping(path = "/")
    public Map<Long, Product> list(Model model) {
        return productService.listAllProducts();
    }
}
