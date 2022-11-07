package com.example.BurgerStorage.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "consumption_product")
@Data
@RequiredArgsConstructor
public class ConsumptionProduct {
    @Column(name = "id", nullable = false)
    @Id
    private int id;

    @Column(name = "date_consumption", nullable = false)
    private Date dateConsumption;

    @Column(name = "id_product", nullable = false, insertable = false, updatable = false)
    private Long idProduct;

    @Column(name = "count", nullable = false)
    private int count;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Storage storage;
}
