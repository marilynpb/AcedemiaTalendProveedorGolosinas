package com.proveedor.app.proveedorapp;

import com.proveedor.app.proveedorapp.model.TypeUser;
import com.proveedor.app.proveedorapp.repository.TypeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TypeUserService {
    @Autowired
    private TypeUserRepository typeUserRepository;

    public TypeUser createTypeUser(TypeUser typeUser){
        return typeUserRepository.save(typeUser);
    }

    public TypeUser getStateById(Long id){
        Optional<TypeUser> optionalTypeUser = typeUserRepository.findById(id);
        return optionalTypeUser.get();
    }

    public List<TypeUser> getAllStates(){
        return typeUserRepository.findAll();
    }

    public void deleteTypeUser(Long id){
        typeUserRepository.deleteById(id);
    }
}
