package com.example.shop.controller;

import com.example.shop.model.Product;
import com.example.shop.model.Status;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProductsMarkController {
    @Autowired
    ProductService productService;

    @PutMapping("/api/mark/{id}")
    public void mark(@PathVariable String id){
        Product product = productService.getProduct(Long.parseLong(id));
        if(product.getStatus() == Status.none) product.setStatus(Status.bought);
    }
}
