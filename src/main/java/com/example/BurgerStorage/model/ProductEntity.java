package com.example.BurgerStorage.model;

import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
@RequiredArgsConstructor
public class ProductEntity {
    @Column(name = "id")
    @Id
    private int id;

    @Column(name = "product_name")
    private Long productName;

    @Column(name = "description")
    private Long description;

    @Column(name = "id_type")
    private int idType;


    @Column(name = "count")
    private int count;


}
