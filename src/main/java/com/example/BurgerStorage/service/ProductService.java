package com.example.BurgerStorage.service;

import com.example.BurgerStorage.converter.ProductToDtoConverter;
import com.example.BurgerStorage.dto.ProductDto;
import com.example.BurgerStorage.model.Product;
import com.example.BurgerStorage.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductToDtoConverter converter;

    public List<ProductDto> getAllProducts(){
        return productRepository.findAll().stream().map(converter::converter).collect(Collectors.toList());
    }

    public ProductDto addProduct(ProductDto productDto){
        Product product = productDto.toProduct();
        productRepository.save(product);
        return productDto;
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
