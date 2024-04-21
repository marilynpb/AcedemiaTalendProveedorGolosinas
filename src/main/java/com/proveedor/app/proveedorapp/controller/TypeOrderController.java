package com.proveedor.app.proveedorapp.controller;

import com.proveedor.app.proveedorapp.StateService;
import com.proveedor.app.proveedorapp.TypeOrderService;
import com.proveedor.app.proveedorapp.model.State;
import com.proveedor.app.proveedorapp.model.TypeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/typeorders")
public class TypeOrderController {
    @Autowired
    private TypeOrderService typeOrderService;

    @PostMapping
    public TypeOrder createTypeOrder(@RequestBody TypeOrder typeOrder){
        return typeOrderService.createTypeOrder(typeOrder);
    }

    @GetMapping
    public List<TypeOrder> getAllStates(){
        return typeOrderService.getAllStates();
    }

    @GetMapping("{id}")
    public TypeOrder searchTypeOrderById(@PathVariable("id") Long id){
        return typeOrderService.getStateById(id);
    }

    @DeleteMapping("{id}")
    public void deleteTypeOrderById(@PathVariable("id") Long id){
        typeOrderService.deleteTypeOrder(id);
    }
}
