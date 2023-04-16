package com.example.shop.controller;

import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProductsDeleteController {
    @Autowired
    ProductService productService;

    @GetMapping("delete/{id}")
    public RedirectView del(@PathVariable String id){
        productService.delete(Long.parseLong(id));
        return new RedirectView("/");
    }
}
