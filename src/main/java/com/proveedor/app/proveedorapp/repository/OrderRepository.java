package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
