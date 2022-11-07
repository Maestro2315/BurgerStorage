package com.example.BurgerStorage.converter;

import com.example.BurgerStorage.dto.ProductTypeDto;
import com.example.BurgerStorage.model.ProductType;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeToDtoConverter {

    public ProductTypeDto converter(ProductType productType){
        ProductTypeDto productTypeDto = new ProductTypeDto();
        productTypeDto.setTypeName(productType.getTypeName());
        return productTypeDto;
    }
}
