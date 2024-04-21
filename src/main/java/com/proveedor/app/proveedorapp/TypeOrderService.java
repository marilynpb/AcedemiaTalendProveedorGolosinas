package com.proveedor.app.proveedorapp;

import com.proveedor.app.proveedorapp.model.TypeOrder;
import com.proveedor.app.proveedorapp.model.TypeUser;
import com.proveedor.app.proveedorapp.repository.TypeOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TypeOrderService {
    @Autowired
    private TypeOrderRepository typeOrderRepository;

    public TypeOrder createTypeOrder(TypeOrder typeOrder){
        return typeOrderRepository.save(typeOrder);
    }

    public TypeOrder getStateById(Long id){
        Optional<TypeOrder> optionalTypeOrder = typeOrderRepository.findById(id);
        return optionalTypeOrder.get();
    }

    public List<TypeOrder> getAllStates(){
        return typeOrderRepository.findAll();
    }

    public void deleteTypeOrder(Long id){
        typeOrderRepository.deleteById(id);
    }
}
