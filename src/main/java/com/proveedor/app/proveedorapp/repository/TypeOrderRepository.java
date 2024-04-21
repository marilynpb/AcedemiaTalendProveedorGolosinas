package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.TypeOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOrderRepository extends JpaRepository<TypeOrder, Long> {
}
