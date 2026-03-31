package com.pharmacy.PharmacyManager.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private  ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductModel getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

     public ProductModel saveProduct(ProductModel product) {
        return productRepository.save(product);
    }

     public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
