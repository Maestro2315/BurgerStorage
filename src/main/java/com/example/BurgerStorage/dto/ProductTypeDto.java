package com.example.BurgerStorage.dto;

import com.example.BurgerStorage.model.ProductType;
import lombok.Data;

@Data
public class ProductTypeDto {
    private String typeName;

    public ProductType toProductType(){
        ProductType productType = new ProductType();
        productType.setTypeName(this.typeName);
        return productType;
    }
}
