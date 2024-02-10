package com.sthev.authenticationapi.repositories;

import com.sthev.authenticationapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
