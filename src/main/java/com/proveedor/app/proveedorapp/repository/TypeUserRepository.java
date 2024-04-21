package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.TypeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeUserRepository extends JpaRepository<TypeUser, Long> {
}
