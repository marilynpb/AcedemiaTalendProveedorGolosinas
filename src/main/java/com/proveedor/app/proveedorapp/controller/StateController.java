package com.proveedor.app.proveedorapp.controller;

import com.proveedor.app.proveedorapp.StateService;
import com.proveedor.app.proveedorapp.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping
    public State createState(@RequestBody State state){
        return stateService.createState(state);
    }

    @GetMapping
    public List<State> getAllStates(){
        return stateService.getAllStates();
    }

    @GetMapping("{id}")
    public State searchStateById(@PathVariable("id") Long id){
        return stateService.getStateById(id);
    }

    @DeleteMapping("{id}")
    public void deleteStateById(@PathVariable("id") Long id){
        stateService.deleteState(id);
    }
}
