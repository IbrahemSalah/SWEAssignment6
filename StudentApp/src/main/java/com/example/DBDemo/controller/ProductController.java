package com.example.DBDemo.controller;

import com.example.DBDemo.entity.Product;
import com.example.DBDemo.entity.Review;
import com.example.DBDemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    final private ProductService productService;

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }


    @GetMapping
    public List<Product> getAll(){
       return productService.getAll();
    }

    @GetMapping("/{id}/reviews")
    public List<Review> findAllReviewsByProductId(@PathVariable long id){
        return productService.findAllReviewsByProductId(id);
    }


    @GetMapping("/minPrice")
    public List<Product> findAllByPriceGreaterThan(@RequestParam int price) {
        return productService.findAllByPriceGreaterThan(price);
    }

    @GetMapping("/minPriceAndCategoryContains")
    public List<Product> findAllByPriceGreaterThanAndCategory_Name(@RequestParam int price,@RequestParam String name) {
        return productService.findAllByPriceGreaterThanAndCategory_Name(price, name);
    }

    @GetMapping("/nameContains")
    public List<Product> findAllByNameContains(@RequestParam String name) {
        return productService.findAllByNameContains(name);
    }

}
