package com.example.shop.controller;

import com.example.shop.model.Product;
import com.example.shop.model.Status;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProductsMarkController {
    @Autowired
    ProductService productService;

    @GetMapping("{id}")
    public Product product(@PathVariable String id) {
        return productService.getProduct(Long.parseLong(id));
    }

    @GetMapping("mark/{id}")
    public RedirectView mark(@PathVariable String id){
        Product product = productService.getProduct(Long.parseLong(id));
        if(product.getStatus() == Status.none) product.setStatus(Status.bought);
        return new RedirectView("/");
    }
}
