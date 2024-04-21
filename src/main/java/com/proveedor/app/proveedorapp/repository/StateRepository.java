package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
