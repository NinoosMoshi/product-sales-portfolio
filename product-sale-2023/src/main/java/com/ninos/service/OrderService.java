package com.ninos.service;

import com.ninos.dto.OrderDTO;
import com.ninos.entity.Order;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderService {

     Order saveOrder(List<OrderDTO> orderDTOS);
     List<Order> getAllOrders();
}
