package com.example.CW_app.controller;

import com.example.CW_app.data.Order;
import com.example.CW_app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.CW_app.data.Order;
import com.example.CW_app.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/orders/{userid}")
    public List<Order> getOrdersByUserId(@PathVariable int userid)
    {
        return orderService.getOrdersByUserId(userid);
    }

    @PostMapping(path = "/orders")
    public Order createOrder(@RequestBody Order order)
    {
        return orderService.createOrder(order);
    }
}

