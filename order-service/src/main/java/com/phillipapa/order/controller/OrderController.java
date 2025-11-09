package com.phillipapa.order.controller;

import com.phillipapa.order.model.Order;
import com.phillipapa.order.repository.OrderRepository;
import com.phillipapa.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;
    private final OrderRepository repository;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.create(order);
    }

    @GetMapping("/customers/{customerId}")
    public List<Order> allCustomer(@PathVariable Long customerId) {
        return repository.findCustomers(customerId);
    }
}
