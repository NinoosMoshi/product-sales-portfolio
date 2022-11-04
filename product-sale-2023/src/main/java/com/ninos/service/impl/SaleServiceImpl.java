package com.ninos.service.impl;

import com.ninos.dao.SaleRepository;
import com.ninos.dto.OrderDTO;
import com.ninos.entity.Order;
import com.ninos.entity.Sale;
import com.ninos.service.OrderService;
import com.ninos.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    private OrderService orderService;

    public SaleServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Order saveSale(List<OrderDTO> orderDTOS) {

        if (orderDTOS.size() == 0)
            return null;
        Order ord = orderService.saveOrder(orderDTOS);
        orderDTOS.forEach(o ->{
            Sale sale = new Sale();
            sale.setOrderId(ord.getOrderId());
            sale.setProductId(o.getProductId());
            saleRepository.save(sale);
        });
        return ord;
    }

    @Override
    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    @Override
    public List<Sale> getSaleByOrderId(Long orderId) {
        return saleRepository.findSaleByOrderId(orderId);
    }
}
