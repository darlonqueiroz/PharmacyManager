package com.pharmacy.PharmacyManager.Category;

import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getcategory")
   public Iterator<CategoryModel> GetAllCategory(){
        return categoryService.getAllCategories();
    }
    @PostMapping("/postcategory")
    public String PostCategory(){
        return "<h1>Category with Post</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
    }

    @PutMapping("/putcategory")
    public String PutCategory(){
        return "<h1>Category with Put</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
    }
    @DeleteMapping("/deletecategory")
    public String DeleteCategory(){
        return "<h1>Category with Delete</h1><img src='https://icons8.com.br/icon/5OD485koNIrb/java'/><br/><h3>Bem vindos ao mundo do Backend</h3>";
    }
}
