package com.proveedor.app.proveedorapp.controller;

import com.proveedor.app.proveedorapp.ProductService;
import com.proveedor.app.proveedorapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    public Product searchProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
