package com.ninos.service.impl;

import com.ninos.dao.OrderRepository;
import com.ninos.dto.OrderDTO;
import com.ninos.entity.Order;
import com.ninos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order saveOrder(List<OrderDTO> orderDTOS) {
        Double total = 0.0;
        for (OrderDTO orderTemp:orderDTOS){
           total += orderTemp.getProductPrice();
        }
        Order order = new Order();
        order.setTotal(total);

        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
