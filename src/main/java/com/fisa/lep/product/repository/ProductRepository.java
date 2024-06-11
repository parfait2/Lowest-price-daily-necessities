package com.fisa.lep.product.repository;

import com.fisa.lep.mart.entity.Mart;
import com.fisa.lep.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    List<Product> findByMartAndName(Mart mart, String name);
    Optional<Product> findByName(String name);
//
    boolean existsByName(String name);



}
