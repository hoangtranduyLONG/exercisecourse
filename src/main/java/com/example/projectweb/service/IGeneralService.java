package com.example.projectweb.service;

import com.example.projectweb.model.Product;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<Product> findById(Long id);

    void save(T t);

    void remove(Long id);
}
