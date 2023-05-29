package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProductsDeleteController {
    @Autowired
    ProductService productService;

    @PostMapping("/api/delete/{id}")
    public RedirectView del(@PathVariable String id){
        productService.delete(Long.parseLong(id));
        return new RedirectView("/list");
    }

    @DeleteMapping("/api/delete/{id}")
    public void delete(@PathVariable String id){
        productService.delete(Long.parseLong(id));
    }
}
