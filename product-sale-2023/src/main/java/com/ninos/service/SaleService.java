package com.ninos.service;

import com.ninos.dto.OrderDTO;
import com.ninos.entity.Order;
import com.ninos.entity.Sale;

import java.util.List;

public interface SaleService {

    Order saveSale(List<OrderDTO> orderDTOS);
    List<Sale> getSales();
    List<Sale> getSaleByOrderId(Long orderId);

}
