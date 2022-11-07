package com.example.BurgerStorage.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "storage")
@Data
@RequiredArgsConstructor
public class Storage {
    @Column(name = "id", updatable = false, insertable = false,nullable = false)
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_product", updatable = false, nullable = false, insertable = false)
    private int id_product;

    @Column(name = "left_count")
    private Long leftCount;

    @Column(name = "date_manufacture")
    private Date dateManufacture;

    @Column(name = "date_expiration")
    private Date dateExpiration;

    @ManyToOne
    @JoinColumn(name = "id", updatable = false, nullable = false, insertable = false)
    private Product product;

    @OneToOne
    @JoinColumn(name = "id_product", nullable = false, updatable = false, insertable = false)
    private ArrivalProduct arrivalProduct;

    @OneToMany(mappedBy = "storage",
            fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    private Set<ConsumptionProduct> consumptionProduct;
}
