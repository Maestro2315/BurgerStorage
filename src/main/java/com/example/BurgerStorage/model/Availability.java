package com.example.BurgerStorage.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "availability")
@Data
@RequiredArgsConstructor
public class Availability {
    @Column(name = "id", nullable = false)
    @Id
    private int id;

    @Column(name = "actual_quantity")
    private Long actualQuantity;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private Product product;
}
