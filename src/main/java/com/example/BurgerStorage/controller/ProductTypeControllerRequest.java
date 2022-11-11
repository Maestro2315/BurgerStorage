package com.example.BurgerStorage.controller;


import com.example.BurgerStorage.dto.ProductTypeDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/productTypes")
@Tag(name = "Type of products", description = "Couple of methods to work with type of products")
public interface ProductTypeControllerRequest {

    @Operation(tags = "Type of products", summary = "Get list types of product")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Product types list completely got", content = @Content(schema = @Schema(implementation = ProductTypeDto.class))),
            @ApiResponse(responseCode = "404", description = "Types of product will not found")})

    @GetMapping
    ResponseEntity<List<ProductTypeDto>> getAllProductTypes();

    @Operation(tags = "Type of products", summary = "Adding type of product")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Type of product successfully added", content = @Content(schema = @Schema(implementation = ProductTypeDto.class)))
    })

    @PostMapping
    ProductTypeDto createProductType(@RequestBody ProductTypeDto productTypeDto);

    @Operation(tags = "Type of products", summary = "Deleting type of product")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Delete was completed", content = @Content(schema = @Schema(implementation = ProductTypeDto.class)))
    })

    @DeleteMapping("/{id}")
    void deleteProductTypeById(@PathVariable Long id);
}


