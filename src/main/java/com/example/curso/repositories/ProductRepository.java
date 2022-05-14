package com.example.curso.repositories;

import com.example.curso.entities.Product;
import com.example.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
