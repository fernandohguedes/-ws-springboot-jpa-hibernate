package com.example.curso.resources;

import com.example.curso.entities.Product;
import com.example.curso.entities.User;
import com.example.curso.services.ProductService;
import com.example.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity< List<Product>> get() {
        List<Product> products = service.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
