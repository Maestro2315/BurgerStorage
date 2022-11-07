package com.example.BurgerStorage.controller;

import com.example.BurgerStorage.dto.ProductDto;
import com.example.BurgerStorage.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/getAllProducts")
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/createProduct")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }

    @DeleteMapping("/{id}")
    public void deleteByIdProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
