package com.ninos.controller;

import com.ninos.entity.Product;
import com.ninos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }


    @DeleteMapping("/delete")
    public String deleteProduct(@RequestParam Long productId) {
        this.productService.deleteProduct(productId);
        return "deleting successfully";
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @GetMapping("/get-by-barcode")
    public Product findProductByBarcode(@RequestParam("barcode") String barcode){
        return productService.findByBarcode(barcode);
    }

    @GetMapping("/get-by-id")
    public Product findProductById(@RequestParam("id") Long id){
        return productService.findById(id);
    }

    @GetMapping("/get-all-products")
    public List<Product> findAllProducts(){
        return productService.getAllProducts();
    }


}
