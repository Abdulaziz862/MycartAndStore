package com.udacity.store.controller;

import com.udacity.store.model.Order;
import com.udacity.store.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders/")
@CrossOrigin(origins = "http://localhost:4200")

public class OrderController {
// TODO: Use the mapping submit to add an API endpoint to fetch the products from the OrderRepository

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/create")

    public ResponseEntity<Order>createOrder(@RequestBody Order order){
        Order orders =orderRepository.save(order);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/all")
    public List<Order> getAllProducts(){
        return orderRepository.findAll();
    }
@GetMapping("/{orderId}")
    public Order getOrderById(Long orderId){
        return orderRepository.findById(orderId).get();
}
}
