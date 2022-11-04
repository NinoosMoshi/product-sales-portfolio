package com.ninos.service;

import com.ninos.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    void deleteProduct(Long productId);
    Product updateProduct(Product product);
    Product findByBarcode(String barcode);
    Product findById(Long id);
    List<Product> getAllProducts();

}
