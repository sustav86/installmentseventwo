package com.sustav.springboot.demo.installmentseventwo.dao;

import com.sustav.springboot.demo.installmentseventwo.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MockDBRepository implements OrderRepository {

    private static Map<String, Order> orderList = new HashMap<>();

    static {
        orderList.put("100123456789", new Order("+380674567889", "7889", "100123456789", "456", "term", "", 1));
        orderList.put("100923456789", new Order("+380674567999", "7999", "100923456789", "123", "term", "", 1));
    }
    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orderList.values());
    }

    @Override
    public Order findById(String id) {
        return orderList.get(id);
    }

    @Override
    public Order update(String id) {
        return null;
    }
}
