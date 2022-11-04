package com.ninos.controller;

import com.ninos.dto.OrderDTO;
import com.ninos.entity.Order;
import com.ninos.entity.Product;
import com.ninos.service.OrderService;
import com.ninos.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private SaleService saleService;

    @PostMapping("/save")
    public Order saveOrder(@RequestBody List<OrderDTO> orderDTOS){
       return saleService.saveSale(orderDTOS);
    }


    @GetMapping("/get-orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }


}
