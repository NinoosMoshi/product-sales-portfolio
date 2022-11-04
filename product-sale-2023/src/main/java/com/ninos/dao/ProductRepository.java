package com.ninos.dao;

import com.ninos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findProductByBarcode(String barcode);

}

