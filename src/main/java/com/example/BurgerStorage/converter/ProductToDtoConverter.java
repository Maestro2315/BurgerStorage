package com.example.BurgerStorage.converter;

import com.example.BurgerStorage.dto.ProductDto;
import com.example.BurgerStorage.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductToDtoConverter {

    public ProductDto converter(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getProductName());
        productDto.setDescription(product.getDescription());
        productDto.setCount(product.getCount());
        return productDto;
    }
}
