package com.example.BurgerStorage.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name =  "arrival_product")
@Data
@RequiredArgsConstructor
public class ArrivalProduct {
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    @Id
    private int id;

    @Column(name = "date_arrival", nullable = false)
    private Date date_arrival;

    @Column(name = "count", nullable = false)
    private int count;

    @Column(name = "id_product", nullable = false, insertable = false, updatable = false)
    private Long id_product;

    @OneToOne
    @JoinColumn(name = "id_product", nullable = false, insertable = false, updatable = false)
    private Storage storage;
}
