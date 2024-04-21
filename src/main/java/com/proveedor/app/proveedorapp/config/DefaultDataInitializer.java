package com.proveedor.app.proveedorapp.config;

import com.proveedor.app.proveedorapp.model.*;
import com.proveedor.app.proveedorapp.repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultDataInitializer {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private TypeUserRepository typeUserRepository;
    @Autowired
    private TypeOrderRepository typeOrderRepository;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void initializeDefaultData() {
        if (userRepository.count() == 0) {
            User defaultUser = new User();
            defaultUser.setEmail("gloria@ejemplo.com");
            defaultUser.setPassword("123456");
            defaultUser.setTypeUser(1);
            defaultUser.setName("Gloria");
            defaultUser.setLastName("Perez");

            userRepository.save(defaultUser);

            User defaultUser2 = new User();
            defaultUser2.setEmail("marilyn@ejemplo.com");
            defaultUser2.setPassword("pass123");
            defaultUser2.setTypeUser(2);
            defaultUser2.setName("Marilyn");
            defaultUser2.setLastName("Boyko");

            userRepository.save(defaultUser2);
        }

        if (productRepository.count() == 0) {
            Product defaultProduct = new Product();
            defaultProduct.setName("Alfajores x unidad");
            defaultProduct.setPrice(500);

            productRepository.save(defaultProduct);

            Product defaultProduct2 = new Product();
            defaultProduct2.setName("Caramelos x kg");
            defaultProduct2.setPrice(2000);

            productRepository.save(defaultProduct2);

            Product defaultProduct3 = new Product();
            defaultProduct3.setName("Papas fritas x paquete de 50gr");
            defaultProduct3.setPrice(800);

            productRepository.save(defaultProduct3);
        }

        if (typeUserRepository.count() == 0) {
            TypeUser defaultTypeUser = new TypeUser();
            defaultTypeUser.setDescription("Admin");

            typeUserRepository.save(defaultTypeUser);

            TypeUser defaultTypeUser2 = new TypeUser();
            defaultTypeUser2.setDescription("Cliente");

            typeUserRepository.save(defaultTypeUser2);
        }

        if (typeOrderRepository.count() == 0) {
            TypeOrder defaultTypeOrder = new TypeOrder();
            defaultTypeOrder.setDescription("Minorista");

            typeOrderRepository.save(defaultTypeOrder);

            TypeOrder defaultTypeOrder2 = new TypeOrder();
            defaultTypeOrder2.setDescription("Mayorista");

            typeOrderRepository.save(defaultTypeOrder2);
        }

        if (stateRepository.count() == 0) {
            State defaultState = new State();
            defaultState.setDescription("Borrador");

            stateRepository.save(defaultState);

            State defaultState2 = new State();
            defaultState2.setDescription("Pend. Aprobación");

            stateRepository.save(defaultState2);

            State defaultState3 = new State();
            defaultState3.setDescription("Aprobado");

            stateRepository.save(defaultState3);

            State defaultState4 = new State();
            defaultState4.setDescription("Rechazado");

            stateRepository.save(defaultState4);
        }

        if (orderRepository.count() == 0) {
            Order defaultOrder = new Order();
            defaultOrder.setAmount(100);
            defaultOrder.setType(2);
            defaultOrder.setState(1);
            defaultOrder.setId_user(2);
            defaultOrder.setId_product((long) 1L);

            orderRepository.save(defaultOrder);
        }
    }
}