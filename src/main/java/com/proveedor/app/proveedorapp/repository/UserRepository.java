package com.proveedor.app.proveedorapp.repository;

import com.proveedor.app.proveedorapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
