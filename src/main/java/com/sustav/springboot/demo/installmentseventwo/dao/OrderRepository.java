package com.sustav.springboot.demo.installmentseventwo.dao;

import com.sustav.springboot.demo.installmentseventwo.entity.Order;

import java.util.List;

public interface OrderRepository {

    List<Order> findAll();

    Order findById(String id);

    Order update(String id);
}
