package com.ninos.controller;

import com.ninos.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;



}
