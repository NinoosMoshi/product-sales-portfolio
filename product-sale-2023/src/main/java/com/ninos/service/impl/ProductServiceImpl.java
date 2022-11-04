package com.ninos.service.impl;

import com.ninos.dao.ProductRepository;
import com.ninos.entity.Product;
import com.ninos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }


    public void deleteProduct(Long productId) {
        this.productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findByBarcode(String barcode) {
        Optional<Product> product = Optional.ofNullable(productRepository.findProductByBarcode(barcode));
        return product.isPresent() ? product.get() : null;
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.isPresent() ? product.get() : null;
    }

    @Override
    public List<Product> getAllProducts() {
         List<Product> products = productRepository.findAll();
        return products;
    }


}
