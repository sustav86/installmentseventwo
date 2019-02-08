package com.sustav.springboot.demo.installmentseventwo.controller;

import com.sustav.springboot.demo.installmentseventwo.dao.OrderRepository;
import com.sustav.springboot.demo.installmentseventwo.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setStatus(999);

        return order;
    }
}
