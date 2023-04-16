package com.example.shop.repository;

import com.example.shop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductsRepository {
    private final Map<Long, Product> products = new HashMap<Long, Product>();

    public void Add(Product product)
    {
        products.put(product.getId(), product);
    }

    public void Delete(Long id)
    {
        products.remove(id);
    }

    public Map<Long, Product> getProducts()
    {
      return Map.copyOf(products);
    }
}
