package com.example.BurgerStorage.dto;

import com.example.BurgerStorage.model.Product;
import lombok.Data;

@Data
public class ProductDto {

    private String name;
    private String description;
    private int count;

    public Product toProduct(){
        Product product = new Product();
        product.setProductName(this.name);
        product.setDescription(this.description);
        product.setCount(this.count);
        return product;
    }
}
