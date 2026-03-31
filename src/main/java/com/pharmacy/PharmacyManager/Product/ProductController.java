package com.pharmacy.PharmacyManager.Product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

    @GetMapping("/getproduct")
    public List<ProductModel> GetAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping("/postproduct")
    public ProductModel PostProduct(@RequestBody ProductModel product){
        return productService.saveProduct(product);
    }

    @PutMapping("/putproduct")
    public ProductModel PutProduct(@RequestBody ProductModel product){
        return productService.saveProduct(product);
    }

    @DeleteMapping("/deleteproduct")
    public void DeleteProduct(@RequestParam Long id){
        productService.deleteProduct(id);
    }
}
