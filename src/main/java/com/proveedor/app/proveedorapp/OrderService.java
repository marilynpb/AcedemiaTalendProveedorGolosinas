package com.proveedor.app.proveedorapp;

import com.proveedor.app.proveedorapp.model.Order;
import com.proveedor.app.proveedorapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createorder(Order order){
        return orderRepository.save(order);
    }

    public Order getOrderById(Long id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }

    public Order updateOrderState(Long id, Integer newState){

        Optional<Order> optionalOrder = orderRepository.findById(id);
        if(optionalOrder.isPresent()){
            Order order = optionalOrder.get();
            Integer currentState = order.getState();

            if (newState < currentState) {
                throw new IllegalArgumentException("No se puede retroceder a un estado anterior.");
            }

            if (newState >= 5) {
                throw new IllegalArgumentException("No existe ese estado.");
            }

            if (newState == currentState) {
                throw new IllegalArgumentException("No se puede volver a signar el mismo estado.");
            }

            if (currentState + 1 != newState) {
                throw new IllegalArgumentException("No se puede saltar estados.");
            }

            order.setState(newState);
            return orderRepository.save(order);

        }else {
            throw new IllegalArgumentException("La orden con ID " + id + " no se encontró.");
        }
    }
}
