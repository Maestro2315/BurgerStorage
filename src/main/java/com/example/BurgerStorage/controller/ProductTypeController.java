package com.example.BurgerStorage.controller;

import com.example.BurgerStorage.dto.ProductTypeDto;
import com.example.BurgerStorage.service.ProductTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productTypes")
@RequiredArgsConstructor
public class ProductTypeController {

    private final ProductTypeService productTypeService;

    @GetMapping("/getAllProductTypes")
    public List<ProductTypeDto> getAllProductType(){return productTypeService.getAllTypes();}

    @PostMapping(value = "/createProductType", consumes = "application/json")
    public ProductTypeDto createProductType(@RequestBody ProductTypeDto productTypeDto){
        return productTypeService.addProductType(productTypeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProductTypeById(@PathVariable Long id){
        productTypeService.deleteProductType(id);
    }

}
