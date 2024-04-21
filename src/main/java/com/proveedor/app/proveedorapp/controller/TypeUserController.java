package com.proveedor.app.proveedorapp.controller;

import com.proveedor.app.proveedorapp.TypeOrderService;
import com.proveedor.app.proveedorapp.TypeUserService;
import com.proveedor.app.proveedorapp.model.TypeOrder;
import com.proveedor.app.proveedorapp.model.TypeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/typeusers")
public class TypeUserController {
    @Autowired
    private TypeUserService typeUserService;

    @PostMapping
    public TypeUser createTypeUser(@RequestBody TypeUser typeUser){
        return typeUserService.createTypeUser(typeUser);
    }

    @GetMapping
    public List<TypeUser> getAllStates(){
        return typeUserService.getAllStates();
    }

    @GetMapping("{id}")
    public TypeUser searchTypeOrderById(@PathVariable("id") Long id){
        return typeUserService.getStateById(id);
    }

    @DeleteMapping("{id}")
    public void deleteTypeUserById(@PathVariable("id") Long id){
        typeUserService.deleteTypeUser(id);
    }
}
