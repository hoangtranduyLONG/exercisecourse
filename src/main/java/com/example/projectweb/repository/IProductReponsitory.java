package com.example.projectweb.repository;


import com.example.projectweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IProductReponsitory extends JpaRepository<Product,Long> {

}
