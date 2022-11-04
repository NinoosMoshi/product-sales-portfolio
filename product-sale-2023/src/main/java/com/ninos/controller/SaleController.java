package com.ninos.controller;

import com.ninos.entity.Sale;
import com.ninos.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sale")
@CrossOrigin
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping("/get-all-sales")
    public List<Sale> getSales() {
        return saleService.getSales();
    }


    @GetMapping("/get-by-order-id")
    public List<Sale> getSaleByOrderId(@RequestParam Long orderId) {
        return saleService.getSaleByOrderId(orderId);
    }



}
