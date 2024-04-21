package com.proveedor.app.proveedorapp.controller;

import com.proveedor.app.proveedorapp.OrderService;
import com.proveedor.app.proveedorapp.model.Order;
import com.proveedor.app.proveedorapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.createorder(order);
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public Order searchOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }

    @DeleteMapping("{id}")
    public void deleteOrderById(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }

    @PutMapping("/{id}/state")
    public ResponseEntity<Order> updateOrderState(@PathVariable("id") Long id, @RequestBody Map<String, Integer> requestBody) {
        Integer newState = requestBody.get("state");
        Order updateOrder = orderService.updateOrderState(id, newState);
        if (updateOrder != null) {
            return ResponseEntity.ok(updateOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
