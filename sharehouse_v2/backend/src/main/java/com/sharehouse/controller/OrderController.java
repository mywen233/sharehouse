package com.sharehouse.controller;

import com.sharehouse.model.IdleOrder;
import com.sharehouse.repository.IdleOrderRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private IdleOrderRepository orderRepository;

    @GetMapping
    public List<IdleOrder> getMyOrders(HttpSession session) {
        Long userId = (Long) session.getAttribute("userid");
        if (userId == null) return null;
        return orderRepository.findByBuyerUid(userId);
    }

    @PostMapping
    public IdleOrder createOrder(@RequestBody IdleOrder order, HttpSession session) {
        Long userId = (Long) session.getAttribute("userid");
        if (userId == null) return null;
        order.setBuyerUid(userId);
        order.setAdd_time(new Date());
        return orderRepository.save(order);
    }
}
