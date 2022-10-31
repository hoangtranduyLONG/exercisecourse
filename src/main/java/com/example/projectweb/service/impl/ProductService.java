package com.example.projectweb.service.impl;



import com.example.projectweb.model.Product;
import com.example.projectweb.repository.IProductReponsitory;
import com.example.projectweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductReponsitory productReponsitory;

    @Override
    public Iterable<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productReponsitory.findById(id);
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);

    }

    @Override
    public void remove(Long id) {
        productReponsitory.deleteById(id);

    }


}

