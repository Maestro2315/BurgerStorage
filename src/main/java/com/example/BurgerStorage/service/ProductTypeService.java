package com.example.BurgerStorage.service;


import com.example.BurgerStorage.converter.ProductTypeToDtoConverter;
import com.example.BurgerStorage.dto.ProductTypeDto;
import com.example.BurgerStorage.model.ProductType;
import com.example.BurgerStorage.repository.ProductTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductTypeService {
    private final ProductTypeRepository productTypeRepository;
    private final ProductTypeToDtoConverter converter;

    public List<ProductTypeDto> getAllTypes(){
        return productTypeRepository.findAll()
               .stream().map(converter::converter)
                .collect(Collectors.toList());
    }

    public ProductTypeDto addProductType(ProductTypeDto productTypeDto){
        ProductType productType = productTypeDto.toProductType();

        productTypeRepository.save(productType);
        return productTypeDto;
    }

    public void deleteProductType(Long id){
        productTypeRepository.deleteById(id);}
}
