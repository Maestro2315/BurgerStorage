package com.example.BurgerStorage.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "product_type")
@Data
@NoArgsConstructor
public class ProductType {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "type_name", nullable = false, length = 150)
    private String typeName;

    @OneToMany(mappedBy = "productType",
            fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set<Product> products;
}
