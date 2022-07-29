package com.example.demo.service;

import com.example.demo.pojo.Order;

public interface OrderService {

    Order createOrderByFrId(String frId);
    Order UpdateOrderByFrId(String frId);
    Order readOrderByFrId(String frId);
    Order DeleteOrderByFrId(String frId);
}
