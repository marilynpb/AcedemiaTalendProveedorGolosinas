package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
