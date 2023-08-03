package com.example.locadora.Car;

import jakarta.persistence.*;

@Table(name = "car")
@Entity(name = "car")

public class Car {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titke;
    private String image;
    private Integer price;
}
