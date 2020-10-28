package com.tao_gio_hang.repository;

import com.tao_gio_hang.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
