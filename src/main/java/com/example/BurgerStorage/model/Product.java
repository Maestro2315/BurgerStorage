package com.example.BurgerStorage.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "product")
@RequiredArgsConstructor
@Data
public class Product {
    @Column(name = "id")
    @GeneratedValue
    @Id
    private int id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "id_type")
    private int idType;

    @Column(name = "count", nullable = false)
    private int count;


    @ManyToOne
    @JoinColumn(name = "type_name", nullable = false)
    private ProductType productType;

    @OneToMany(mappedBy = "id_product",
            fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set<Storage> storage;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private Availability availability;
}
