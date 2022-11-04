package com.ninos.dao;

import com.ninos.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    List<Sale> findSaleByOrderId(Long orderId);

}

