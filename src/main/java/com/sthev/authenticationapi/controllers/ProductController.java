package com.sthev.authenticationapi.controllers;

import com.sthev.authenticationapi.domain.product.Product;
import com.sthev.authenticationapi.domain.product.ProductRequestDTO;
import com.sthev.authenticationapi.domain.product.ProductResponseDTO;
import com.sthev.authenticationapi.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity<Void> saveProducts(@RequestBody @Valid ProductRequestDTO data){
        Product product = new Product(data);
        this.repository.save(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
        List<ProductResponseDTO> productResponseDTOS = this.repository.findAll()
                .stream()
                .map(ProductResponseDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(productResponseDTOS);
    }
}
