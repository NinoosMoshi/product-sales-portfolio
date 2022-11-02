package com.ninos.service.impl;

import com.ninos.dao.SaleRepository;
import com.ninos.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;


}
