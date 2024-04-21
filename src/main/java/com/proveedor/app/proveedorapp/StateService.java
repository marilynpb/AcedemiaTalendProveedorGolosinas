package com.proveedor.app.proveedorapp;

import com.proveedor.app.proveedorapp.model.State;
import com.proveedor.app.proveedorapp.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public State createState(State state){
        return stateRepository.save(state);
    }

    public State getStateById(Long id){
        Optional<State> optionalState = stateRepository.findById(id);
        return optionalState.get();
    }

    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    public void deleteState(Long id){
        stateRepository.deleteById(id);
    }
}
